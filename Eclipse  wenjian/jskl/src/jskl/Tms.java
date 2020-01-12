package jskl;

public class Tms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=2;//
    int sum=0;//因数的和
    int j=1;//i的因数
    for(;i<=1000;i++) {
    	for(sum=0,j=1;j<i;j++) {
    		if(i%j==0)//j是不是i的因数
    		sum+=j;//是，加进去
    	}
    if(sum==i)//是不是完数
    	System.out.println(i+"是完数。");
	}
	}
}
