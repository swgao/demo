package shuzu;


public class Ï£¶ûÅÅÐò {

	public static void main(String[] args) {
		int[] arr= {1,9,2,8,2,6,8,6,9,3,5,8,5};
		shellSort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void shellSort(int [] arr) {
		for(int jiange=arr.length/2;jiange>0;jiange=jiange/2) {
			for(int i = jiange;i<arr.length;i++) {
				int target = arr[i];
				int j = i-jiange;
				while(j>-1&&target<arr[j]) {
					arr[j+jiange]=arr[j];
					j-=jiange;
				}
				arr[j+jiange]=target;
			}
		}
	}

}
