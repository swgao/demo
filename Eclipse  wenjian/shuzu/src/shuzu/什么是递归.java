package shuzu;

import java.net.URL;

public class ʲô�ǵݹ� {
	/*
	 * ���ظ���n*(n-1)��������(n-1)*(n-2)��������ͬ ---�ӷ���
	 * �ұ仯���仯����Ӧ����Ϊ����
	 * �ұ߽磺����*/
	/*
	 *�ֽ�Ϊ��ֱ����+С��ģ������
	 *�ֽ�Ϊ�����С��ģ������ */
	 
static int f(int i){                                     //��׳�
			if(i==1)
				return 1;
			return i*f(i-1);
		}

static void f1(int i,int j) {                            //��i--j
	if(i>j)
		return;
	System.out.print(i+" ");
	f1(i+1,j);
}

static int f2(int[] arr,int a) {                         //�������
	if(a==arr.length-1) {
		return arr[a];
	}
	return arr[a]+f2(arr,a+1);
}

static String f3(String src,int b) {                     //��ת�ַ���
	if(b==0) {
		return ""+src.charAt(0);
	}
	return src.charAt(b)+f3(src,b-1);
}

static int f4(int N) {                                   //쳲���������
	if(N==1||N==2) {
		return 1;
	}
	return f4(N-1)+f4(N-2);
}

static int f5(int m,int n) {                             //���Լ�� m%n=0 n�������Լ��,����������k��n%k�������0����k���ǽ��������0�Ļ�����������
	if(n==0)
		return m;
	return f5(n,m%n);
}

static void f6(int[]aee,int k) {                                   //��������
	if(k==0) {
		return;
	}
	//��ǰk-1��Ԫ������
	f6(aee,k-1);
	//��λ��kԪ�ز��뵽ǰ��Ĳ���
	int x= aee[k];
	int index = k-1;
	while(index>-1&&x<aee[index]) {
		aee[index+1]=aee[index];
		index--;
	}
	aee[index+1]=x;
}

private static int f7(int[]arr,int qi,int zhong,int key) {            //���ֲ��ҷ�
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
