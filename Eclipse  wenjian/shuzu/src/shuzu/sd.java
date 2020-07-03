package shuzu;

import java.util.Arrays;

public class sd {
	public static void Bsort(int a[]) {
		int d = a.length-1;
		int f = 0;
		for(int i=0; i<a.length-1; i++) {
			boolean flag = true;
			for(int j=0; j<d;j++) {
				int temp;
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = false;
					f = j;
				}
			}
			d = f;
		if(flag) {
			break;
		}
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[] = {1,9,6,8,6,9,2,6};
		Bsort(a);
		System.out.print(Arrays.toString(a));
	}

}
