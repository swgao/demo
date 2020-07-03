 package shuzu;

import java.util.Random;

public class 寻找数组中相同的数 {

	public static void main(String[] args) {
		/*思路：建造一个数组，然后便利，在随机最后一个数，然后在建造一个数字，便利，
		//把第一次得到的数变成第二个数组的下标，然后在做一次便利，新数组中下标的数位2的就收那个重复的数。
		一个储存空间，在一个储存空间，第一遍都是+1；多余的那个就是+2；把那个+2找出来就行*/
		int N=11;//取值范围
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		arr[arr.length-1]=new Random().nextInt(N-1)+1;
 		int[]hearder = new int[N];
		for(int i=1;i<N;i++) {
			hearder[arr[i]]++;
			System.out.print(arr[i]);
			
		}
		for(int i=0;i<N;i++) {
			if(hearder[i]==2) {
				System.out.println("\t");
				System.out.println(i);
				break;
			}
		}
	}

}
