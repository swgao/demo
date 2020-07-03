package ÎïÌå;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.support.v13.app.FragmentCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Camera2BasicFragment extends Fragment
    implements FragmentCompat.OnRequestPermissionsResultCallback {

  private static final String TAG = "TfLiteCameraDemo";
  private static final String FRAGMENT_DIALOG = "dialog";
  private static final String HANDLE_THREAD_NAME = "CameraBackground";
  private static final int PERMISSIONS_REQUEST_CODE = 1;

  private final Object lock = new Object();
  private boolean runClassifier = false;
  private boolean checkedPermissions = false;
  private TextView textView;
  private ImageClassifier classifier;
  private static final int MAX_PREVIEW_WIDTH = 1920;
  private static final int MAX_PREVIEW_HEIGHT = 1080; 
  private HandlerThread backgroundThread;
  private Handler backgroundHandler;
  private ImageReader imageReader;
  private CaptureRequest.Builder previewRequestBuilder;
  private CaptureRequest previewRequest;
  private Semaphore cameraOpenCloseLock = new Semaphore(1);
  private String cameraId;
  private AutoFitTextureView textureView;
  private CameraCaptureSession captureSession;
  private CameraDevice cameraDevice;
  private Size previewSize;
  private void startBackgroundThread() {
	    backgroundThread = new HandlerThread(HANDLE_THREAD_NAME);
	    backgroundThread.start();
	    backgroundHandler = new Handler(backgroundThread.getLooper());
	    synchronized (lock) {
	      runClassifier = true;
	    }
	    backgroundHandler.post(periodicClassify);
	  }

	  /** Stops the background thread and its {@link Handler}. */
	  private void stopBackgroundThread() {
	    backgroundThread.quitSafely();
	    try {
	      backgroundThread.join();
	      backgroundThread = null;
	      backgroundHandler = null;
	      synchronized (lock) {
	        runClassifier = false;
	      }
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
  private Runnable periodicClassify =
	      new Runnable() {
	        @Override
	        public void run() {
	          synchronized (lock) {
	            if (runClassifier) {
	              classifyFrame();
	            }
	          }
	          backgroundHandler.post(periodicClassify);
	        }
	      };

	  /** Creates a new {@link CameraCaptureSession} for camera preview. */
	  private void createCameraPreviewSession() {
	    try {
	      SurfaceTexture texture = textureView.getSurfaceTexture();
	      assert texture != null;

	      // We configure the size of default buffer to be the size of camera preview we want.
	      texture.setDefaultBufferSize(previewSize.getWidth(), previewSize.getHeight());

	      // This is the output Surface we need to start preview.
	      Surface surface = new Surface(texture);

	      // We set up a CaptureRequest.Builder with the output Surface.
	      previewRequestBuilder = cameraDevice.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW);
	      previewRequestBuilder.addTarget(surface);

	      // Here, we create a CameraCaptureSession for camera preview.
	      cameraDevice.createCaptureSession(
	          Arrays.asList(surface),
	          new CameraCaptureSession.StateCallback() {

	            @Override
	            public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
	              // The camera is already closed
	              if (null == cameraDevice) {
	                return;
	              }

	              // When the session is ready, we start displaying the preview.
	              captureSession = cameraCaptureSession;
	              try {
	                // Auto focus should be continuous for camera preview.
	                previewRequestBuilder.set(
	                    CaptureRequest.CONTROL_AF_MODE,
	                    CaptureRequest.CONTROL_AF_MODE_CONTINUOUS_PICTURE);

	                // Finally, we start displaying the camera preview.
	                previewRequest = previewRequestBuilder.build();
	                captureSession.setRepeatingRequest(
	                    previewRequest, captureCallback, backgroundHandler);
	              } catch (CameraAccessException e) {
	                e.printStackTrace();
	              }
	            }

	            @Override
	            public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
	              showToast("Failed");
	            }
	          },
	          null);
	    } catch (CameraAccessException e) {
	      e.printStackTrace();
	    }
	  }

	  private void configureTransform(int viewWidth, int viewHeight) {
	    Activity activity = getActivity();
	    if (null == textureView || null == previewSize || null == activity) {
	      return;
	    }
	    int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
	    Matrix matrix = new Matrix();
	    RectF viewRect = new RectF(0, 0, viewWidth, viewHeight);
	    RectF bufferRect = new RectF(0, 0, previewSize.getHeight(), previewSize.getWidth());
	    float centerX = viewRect.centerX();
	    float centerY = viewRect.centerY();
	    if (Surface.ROTATION_90 == rotation || Surface.ROTATION_270 == rotation) {
	      bufferRect.offset(centerX - bufferRect.centerX(), centerY - bufferRect.centerY());
	      matrix.setRectToRect(viewRect, bufferRect, Matrix.ScaleToFit.FILL);
	      float scale =
	          Math.max(
	              (float) viewHeight / previewSize.getHeight(),
	              (float) viewWidth / previewSize.getWidth());
	      matrix.postScale(scale, scale, centerX, centerY);
	      matrix.postRotate(90 * (rotation - 2), centerX, centerY);
	    } else if (Surface.ROTATION_180 == rotation) {
	      matrix.postRotate(180, centerX, centerY);
	    }
	    textureView.setTransform(matrix);
	  }

	  /** Classifies a frame from the preview stream. */
	  private void classifyFrame() {
	    if (classifier == null || getActivity() == null || cameraDevice == null) {
	      showToast("Uninitialized Classifier or invalid context.");
	      return;
	    }
	    Bitmap bitmap =
	        textureView.getBitmap(ImageClassifier.DIM_IMG_SIZE_X, ImageClassifier.DIM_IMG_SIZE_Y);
	    String textToShow = classifier.classifyFrame(bitmap);
	    bitmap.recycle();
	    showToast(textToShow);
	  }

	  /** Compares two {@code Size}s based on their areas. */
	  private static class CompareSizesByArea implements Comparator<Size> {

	    @Override
	    public int compare(Size lhs, Size rhs) {
	      // We cast here to ensure the multiplications won't overflow
	      return Long.signum(
	          (long) lhs.getWidth() * lhs.getHeight() - (long) rhs.getWidth() * rhs.getHeight());
	    }
	  }

	  /** Shows an error message dialog. */
	  public static class ErrorDialog extends DialogFragment {

	    private static final String ARG_MESSAGE = "message";

	    public static ErrorDialog newInstance(String message) {
	      ErrorDialog dialog = new ErrorDialog();
	      Bundle args = new Bundle();
	      args.putString(ARG_MESSAGE, message);
	      dialog.setArguments(args);
	      return dialog;
	    }

	    @Override
	    public Dialog onCreateDialog(Bundle savedInstanceState) {
	      final Activity activity = getActivity();
	      return new AlertDialog.Builder(activity)
	          .setMessage(getArguments().getString(ARG_MESSAGE))
	          .setPositiveButton(
	              android.R.string.ok,
	              new DialogInterface.OnClickListener() {
	                @Override
	                public void onClick(DialogInterface dialogInterface, int i) {
	                  activity.finish();
	                }
	              })
	          .create();
	    }
	  }
	}
