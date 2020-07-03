package shuzu;

import java.net.URL;

public class 什么是递归 {
	/*
	 * 找重复：n*(n-1)的做法和(n-1)*(n-2)的做法相同 ---子方法
	 * 找变化：变化的量应该作为参数
	 * 找边界：出口*/
	/*
	 *分解为：直接量+小规模子问题
	 *分解为：多个小规模子问题 */
	 
static int f(int i){                                     //求阶乘
			if(i==1)
				return 1;
			return i*f(i-1);
		}

static void f1(int i,int j) {                            //求i--j
	if(i>j)
		return;
	System.out.print(i+" ");
	f1(i+1,j);
}

static int f2(int[] arr,int a) {                         //数组求和
	if(a==arr.length-1) {
		return arr[a];
	}
	return arr[a]+f2(arr,a+1);
}

static String f3(String src,int b) {                     //反转字符串
	if(b==0) {
		return ""+src.charAt(0);
	}
	return src.charAt(b)+f3(src,b-1);
}

static int f4(int N) {                                   //斐波那契数列
	if(N==1||N==2) {
		return 1;
	}
	return f4(N-1)+f4(N-2);
}

static int f5(int m,int n) {                             //最大公约数 m%n=0 n就是最大公约数,如果余出来是k，n%k如果等于0，则k就是结果，不是0的话，继续调换
	if(n==0)
		return m;
	return f5(n,m%n);
}

static void f6(int[]aee,int k) {                                   //数组排序
	if(k==0) {
		return;
	}
	//对前k-1个元素排序
	f6(aee,k-1);
	//把位置k元素插入到前面的部分
	int x= aee[k];
	int index = k-1;
	while(index>-1&&x<aee[index]) {
		aee[index+1]=aee[index];
		index--;
	}
	aee[index+1]=x;
}

private static int f7(int[]arr,int qi,int zhong,int key) {            //二分查找法
	if(qi>zhong) 
		return -1;
	int mid = ((zhong-qi)>>1);
	int midVal = arr[mid];
	if(midVal<key)
		return f7(arr,mid+1,zhong,key);
	else if(midVal>key)
		return f7(arr,qi,mid-1,key);
	else
		return mid;
	 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(f(3));
		System.out.println(f2(new int[]{1,2,3,4},0));
//		f1(1,9);
//		System.out.println(f3("adcdd",4));
//		System.out.println(f4(6));
//	    int []aee= {1,8,5,6,9,5,4,4};
//	    f6(aee,7);
//	    for(int i: aee) {
//		   System.out.print(i);
//	  }
		int a = f5(12,24);
		System.out.print(a);
	}
}
