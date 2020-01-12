package shuzu;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="Hello ";
        String str2="Word!";
        String str3=new String("Hello ");
        String str4="Hello ";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1+str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str3));    //eaquals比较两个不同地方的
        System.out.println(str1==str4);
	}

}
