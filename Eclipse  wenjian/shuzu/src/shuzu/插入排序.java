package shuzu;

public class ≤Â»Î≈≈–Ú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,6,8,9,6,8};
		for(int i=1;i<arr.length;i++) {
			int target =arr[i];
			int j = i-1;
			while(j>-1&&target<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=target;
		}
		System.out.println("\n≈≈–Ú∫ÛµƒÀ≥–ÚŒ™£∫");
        for(int i: arr) {
            System.out.print(i+"\t");
        }
	}

}
