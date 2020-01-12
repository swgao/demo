package jskl;

public class xiti7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,j;
       for(i=1;i<=8;i++) {
    	   for(j=1;j<=2*(8-i);j++)
    		   System.out.print(" ");
    	   for(j=1;j<=i;j++)
    		   System.out.print(j+" ");
    	   for(j=i-1;j>0;j--)
    		   System.out.print(j+" ");
    	   System.out.print("\n");
       }
	}

}
