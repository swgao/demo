package shuzu;
/*
 * �и��������ַ������飬����ɢ����һЩ���ַ�������дһ��
 * �������ҳ������ַ������϶����ǿ��ַ�����������*/
public class �������������в��� {

	public static void main(String[] args) {
		String[] arr = {"a","","ac","","ad","b","","ba"};
		int res = indeOf(arr, "abc");
		System.out.println(res);
	}
private static int indeOf(String[] arr,String p) {
	int begin = 0;
	int end = arr.length-1;
	while(begin<=end) {
		int indexOfMid = begin + ((end - begin) >> 1);
		while(arr[indexOfMid].equals("")) {
			indexOfMid++;
			if(indexOfMid>end)
				return -1;
}
		if(arr[indexOfMid].compareTo(p)>0) {
			end=indexOfMid-1;
		}else if(arr[indexOfMid].compareTo(p)<0) {
			begin=indexOfMid+1;
		}else {
			return indexOfMid;
		}
	}
	return -1;
}
}
