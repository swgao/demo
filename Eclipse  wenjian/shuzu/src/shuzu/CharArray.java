package shuzu;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] text = new char[100];
		text = "李新胜".toCharArray();//原文
		System.out.println(text);
		for(int i=0;i<text.length;i++)        //加密
			text[i]-=79;
		System.out.println(text);
		for(int i=0;i<text.length;i++)      //解密
			text[i]+=99;
		System.out.println(text);
				
       
	}

}
