package jskl;

public class Tms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=2;//
    int sum=0;//�����ĺ�
    int j=1;//i������
    for(;i<=1000;i++) {
    	for(sum=0,j=1;j<i;j++) {
    		if(i%j==0)//j�ǲ���i������
    		sum+=j;//�ǣ��ӽ�ȥ
    	}
    if(sum==i)//�ǲ�������
    	System.out.println(i+"��������");
	}
	}
}
