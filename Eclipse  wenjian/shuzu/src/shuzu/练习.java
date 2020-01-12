package shuzu;

public class Á·Ï° {
static String f(String src , int b) {
	if(b==0) {
		return ""+src.charAt(0);
	}
	return src.charAt(b)+f(src,b-1);
}
static int f1(int[] arr,int a) {
	if(a==arr.length-1) {
		return arr[a];
	}
	return arr[a]+f1(arr,a+1);
}
static int min(int[] arr) {
	int begin=0;
	int end = arr.length-1;
	if( arr[begin] < arr[end]) return arr[begin];
	while( begin+1 < end) {
		int mid = ((end - begin) >> 1);
		if(arr[begin] <arr[mid]) {
			begin = mid;
		}else {
			end = mid;
		}
	}
	return arr[end];
}
static int f6(int N) {
	if(N==1||N==2)
		return 1;
	return f6(N-1)+f6(N-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(f("asd",2));
System.out.println(f1(new int[] {1,2,3,6,8},0));
int[] arr= {1,6,5,8,6};
int ser = min(arr);
System.out.println(ser);
System.out.println(f6(6));
	}

}