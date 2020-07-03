package shuzu;

public class 交换奇偶位 {
private static int m(int i) {
	System.out.println(Integer.toString(i,2));
	int ou =i&0xaaaaaaaa;//和1010 1010 1010....做与运算取出偶数位
	System.out.println(Integer.toString(ou,2));
	int ji =i&0x55555555;//和0101 0101 0101....做与运算取出奇数位
	System.out.println(Integer.toString(ji,2));
	return (ou>>1)^(ji<<1);//连起来
}
	public static void main(String[] args) {
		交换奇偶位 a = new 交换奇偶位();
		System.out.println(a.m(9));
		Integer.toString(21,6);
	}

}
