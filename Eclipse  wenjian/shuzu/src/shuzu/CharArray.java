package shuzu;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] text = new char[100];
		text = "����ʤ".toCharArray();//ԭ��
		System.out.println(text);
		for(int i=0;i<text.length;i++)        //����
			text[i]-=79;
		System.out.println(text);
		for(int i=0;i<text.length;i++)      //����
			text[i]+=99;
		System.out.println(text);
				
       
	}

}
