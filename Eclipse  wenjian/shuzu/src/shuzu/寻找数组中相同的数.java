 package shuzu;

import java.util.Random;

public class Ѱ����������ͬ���� {

	public static void main(String[] args) {
		/*˼·������һ�����飬Ȼ���������������һ������Ȼ���ڽ���һ�����֣�������
		//�ѵ�һ�εõ�������ɵڶ���������±꣬Ȼ������һ�α��������������±����λ2�ľ����Ǹ��ظ�������
		һ������ռ䣬��һ������ռ䣬��һ�鶼��+1��������Ǹ�����+2�����Ǹ�+2�ҳ�������*/
		int N=11;//ȡֵ��Χ
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
