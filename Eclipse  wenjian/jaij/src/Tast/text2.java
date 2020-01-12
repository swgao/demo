package Tast;

public class text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=100;
    for(int i=100;i<=200;i++) {
    	for(j=2;j<i;j++) {
    	if(i%j==0 ) {
         break;
    	}
    }
    	if(j>=i) {
    	  System.out.println(i);
    	}
    }
    }
	}