package SS;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class wenjianfuzhi {
public static void main(String args[]){
FileInputStream fis = null;
FileOutputStream fos = null;
try {

fis = new FileInputStream("images/2.jpg");
 byte[] b = new byte[128];
  
 fos = new FileOutputStream("images/28.jpg");
 while(fis.read(b)!=-1){
  fos.write(b); 
  
 }
 fis.close();
 fos.close();
} catch (Exception e) {
 e.printStackTrace();
}
 
}
}
