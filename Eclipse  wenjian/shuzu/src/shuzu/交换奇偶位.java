package shuzu;

public class ������żλ {
private static int m(int i) {
	System.out.println(Integer.toString(i,2));
	int ou =i&0xaaaaaaaa;//��1010 1010 1010....��������ȡ��ż��λ
	System.out.println(Integer.toString(ou,2));
	int ji =i&0x55555555;//��0101 0101 0101....��������ȡ������λ
	System.out.println(Integer.toString(ji,2));
	return (ou>>1)^(ji<<1);//������
}
	public static void main(String[] args) {
		������żλ a = new ������żλ();
		System.out.println(a.m(9));
		Integer.toString(21,6);
	}

}
