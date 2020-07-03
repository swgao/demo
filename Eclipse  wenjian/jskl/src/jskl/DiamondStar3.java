package jskl;

public class DiamondStar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i,j;
//   for(i=1;i<=6;i++){
//	   for(j=1;j<=2*(6-i);j++)
//		   System.out.print(" ");
//	   for(j=1;j<=i;j++)
//		   System.out.print(j+" ");
//	   for(j=i-1;j>0;j--)
//		   System.out.print(j+" ");
//	   System.out.print("\n");
//   }
//	}
for(i=1;i<=6;i++) {
	for(j=1;j<=2*(6-i);j++)
		System.out.print(" ");
	
	for(j=1;j<=i;j++) 
		System.out.print(j+" ");
	
	for(j=i-1;j>0;j--) 
		System.out.print(j+" ");
	System.out.print("\n");
}
	}
	}

