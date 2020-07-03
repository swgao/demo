package shuzu;
import java.util.Scanner;
/*
 ��Ŀ���ݣ�

����ϸ���Զ����ķ�ͼ�ΰ汾��ϸ���Զ�����ָ��һ����ά�����ڣ�ÿһ��������һ��ϸ����ÿ��ϸ���л��������״̬��

��ʼʱ�̣���Щϸ���ǻ�ģ���Щϸ�������ġ��Զ�����ÿһ��������ÿ��ϸ����Χ8�������ڵ�����ϸ������������������ϸ����һ���Ƿ������Ĺ������£�



�����ϸ�������ǻ�ģ�������Χ8����������2��3�����ŵ�ϸ����������������Χ8�������еĻ��ŵ�ϸ����������2�������3������������

�����ϸ�����������ģ�������Χ8��������������3�����ŵ�ϸ������ϸ�����

λ�����������Ե�Ͷ��ǵ�ϸ����������Χϸ����������8������Խ������ı߽粻����ϸ����

ÿ��ϸ���������仯��������Ӱ�쵱ǰ��һ����Χ��ϸ����ֻ������һ�����ֳ�����



��ʾ���γ��еĴ�������һ��������ͬ��



�����ʽ:

����������������������ΧΪ[3,102]�����α�ʾ����Ŀ�Ⱥ͸߶ȡ�

Ȼ��������������������α�ʾһ�����ŵ�ϸ��������λ�ã�ÿ�������У���һ����ʾ�кţ��ڶ�����ʾ�кţ�����0��ʼ��š�

����ԡ�-1 -1����ʾ�����л��ŵ�ϸ����-1 -1������Ч��λ�á�

Ȼ����һ������������ΧΪ[1,10000]����ʾҪ��ϸ���Զ���ִ�еĲ�����



�����ʽ��

���һ������������ʾִ����Ϻ�ʣ�µĻ��ŵ�ϸ����������



����������

3 3

1 1 1 2 0 1 2 1

-1 -1

1



���������

7*/
public class Main
{
	private int times;
	private int width;
	private int height;
	int old_field[][];
	int new_field[][];
 
	Scanner in = new Scanner(System.in);
 
	void Init()
	{
		width = in.nextInt();
		height = in.nextInt();
		old_field = new int[height+2][width+2];
		new_field = new int[height+2][width+2];
		
		// ��ʼ��Ϊ0
		for (int i = 0; i < height+2; i++)
			for (int j = 0; j < width+2; j++)
			{
				old_field[i][j] = 0;
				old_field[i][j] = 0;
			}
		
		//������ϸ����λ��
		while(true)
		{
			int i=in.nextInt();
			int j=in.nextInt();
			if(i==-1&&j==-1)
				break;
			old_field[i+1][j+1]=1;
			new_field[i+1][j+1]=1;
		}
		//����ִ�в���
		times = in.nextInt();
	}
 
	void run()
	{
		for(int k=0;k<times;k++)
		{
			for(int i=1;i<height+1;i++)
			{
				for(int j=1;j<width+1;j++)
				{
					int count=getNeighbor(i, j);
					if(old_field[i][j]==0)
					{
						if(count==3)//ϸ������
							new_field[i][j]=1;
					}
					else
					{
						if(!(count==2||count==3))//ϸ������
							new_field[i][j]=0;
					}
				}
			}
			//copy
			for (int i = 1; i < height+1; i++)
			{
				for (int j = 0; j < width+1; j++)
				{
					old_field[i][j] = new_field[i][j];
				}
			}
			
		}
	}
	
	int getNeighbor(int i,int j)
	{
		//����λ��Ϊi��j��ϸ����Χ���ϸ��������
		int temp=0;
		temp+=old_field[i-1][j]+old_field[i+1][j]+old_field[i][j-1]+old_field[i][j+1];
		temp+=old_field[i-1][j-1]+old_field[i-1][j+1]+old_field[i+1][j-1]+old_field[i+1][j+1];
		return temp;
	}
	
	int Count()
	{
		//������ŵ�ϸ��������
		int count=0;
		for (int i = 1; i < height+1; i++)
		{
			for (int j = 1; j < width+1; j++)
			{
				if(old_field[i][j]==1)
					count++;
			}
		}
		return count;
	}
	void Test()
	{
		Init();
		run();
		System.out.println(Count());
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Main().Test();
	}
 
}
