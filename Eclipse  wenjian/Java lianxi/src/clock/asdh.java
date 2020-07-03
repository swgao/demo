package clock;

public class asdh {
	private int xianzaizhi=0;
	private int shangxian=0;
	public asdh(int shangxian) {
		this.shangxian = shangxian;
	}
	 public void increase() {
    	xianzaizhi++;
    	if(xianzaizhi == shangxian) {
    		xianzaizhi = 0;
    	}
    }
    public int getZhi() {
    	return xianzaizhi;
    }
public static void main(String[] args) {
}
}
