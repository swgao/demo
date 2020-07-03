package clock;


import java.util.*;
public class asd {
	public asd() {
		
	}
	
 /* public asd(asdh hour, asdh minute, asdh second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

public asd(int nextInt, int nextInt2, int nextInt3) {
	// TODO Auto-generated constructor stub
}*/

asdh hour = new asdh(24);
  asdh minute = new asdh(60);
  asdh second = new asdh(60);
   void start() {
		while(true) {
			   second.increase();
			   if(second.getZhi()==0) {
				   minute.increase();
			   
			   if(minute.getZhi()==0) 
				   hour.increase();
			   }
		for (int i=0;i<2129999999;i++) {
			
		}
	    System.out.printf("%02d:%02d:%02d\n",hour.getZhi(),minute.getZhi(),second.getZhi());
  
}
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*java.util.Scanner in = new java.util.Scanner(System.in);
		asd clock = new asd(in.nextInt(), in.nextInt(), in.nextInt());
		clock.start();*/
    asd cloc = new asd();
    cloc.start();
    
	}

}
