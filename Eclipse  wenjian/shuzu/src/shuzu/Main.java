package shuzu;
import java.util.Scanner;
/*
 题目内容：

这是细胞自动机的非图形版本。细胞自动机是指在一个二维网格内，每一个网格是一个细胞。每个细胞有活和死两种状态。

初始时刻，有些细胞是活的，有些细胞是死的。自动机的每一步，根据每个细胞周围8个格子内的其他细胞的生存情况决定这个细胞下一步是否存活。具体的规则如下：



如果该细胞现在是活的，并且周围8个格子中有2或3个活着的细胞，则继续存活；如果周围8个格子中的活着的细胞数量少于2个或多于3个，则死亡；

如果该细胞现在是死的，并且周围8个格子中正好有3个活着的细胞，则细胞复活。

位于整个网格边缘和顶角的细胞，它的周围细胞可能少于8个。即越过网格的边界不再有细胞。

每个细胞的生死变化，都不会影响当前这一步周围的细胞，只会在下一步表现出来。



提示：课程中的代码与上一句描述不同。



输入格式:

首先输入两个正整数，范围为[3,102]，依次表示网格的宽度和高度。

然后输入多组正整数，依次表示一个活着的细胞的网格位置，每组数字中，第一个表示行号，第二个表示列号，均从0开始编号。

最后，以“-1 -1”表示不再有活着的细胞。-1 -1不是有效的位置。

然后，以一个正整数，范围为[1,10000]，表示要求细胞自动机执行的步数。



输出格式：

输出一个正整数，表示执行完毕后，剩下的活着的细胞的数量。



输入样例：

3 3

1 1 1 2 0 1 2 1

-1 -1

1



输出样例：

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
		
		// 初始化为0
		for (int i = 0; i < height+2; i++)
			for (int j = 0; j < width+2; j++)
			{
				old_field[i][j] = 0;
				old_field[i][j] = 0;
			}
		
		//读入活的细胞的位置
		while(true)
		{
			int i=in.nextInt();
			int j=in.nextInt();
			if(i==-1&&j==-1)
				break;
			old_field[i+1][j+1]=1;
			new_field[i+1][j+1]=1;
		}
		//读入执行步数
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
						if(count==3)//细胞复活
							new_field[i][j]=1;
					}
					else
					{
						if(!(count==2||count==3))//细胞死亡
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
		//计算位置为i，j的细胞周围活的细胞的数量
		int temp=0;
		temp+=old_field[i-1][j]+old_field[i+1][j]+old_field[i][j-1]+old_field[i][j+1];
		temp+=old_field[i-1][j-1]+old_field[i-1][j+1]+old_field[i+1][j-1]+old_field[i+1][j+1];
		return temp;
	}
	
	int Count()
	{
		//计算活着的细胞的数量
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
