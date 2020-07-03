package clock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
public class disanzhou
{
	private ArrayList<String> city = new ArrayList<String>();
	private HashMap<String, HashMap<String, Integer>> distince = new HashMap<String, HashMap<String, Integer>>();
	private static Scanner in = new Scanner(System.in);
 
	// 输入城市名及距离
	public void input()
	{
//		Scanner in = new Scanner(System.in);
		String temp;
		// 读入城市名
		while (true)
		{
			temp = in.next();
			if (temp.equals("###") == true)
				break;
			city.add(temp);
		}
		// 读入距离
		for (int i = 0; i < city.size(); i++)
		{
			HashMap<String, Integer> temp_hashmap = new HashMap<String, Integer>();
			for (int j = 0; j < city.size(); j++)
			{
				int dis = in.nextInt();
				temp_hashmap.put(city.get(j), dis);
			}
			distince.put(city.get(i), temp_hashmap);
		}
//		in.close();
	}
 
	// 查找两个城市间的距离
	public int search(String start, String end)
	{
		int dis = 0;
		dis = distince.get(start).get(end);
		return dis;
	}
 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		disanzhou dis = new disanzhou();
//		Scanner in = new Scanner(System.in);
		dis.input();
		String start = in.next();
		String end = in.next();
		System.out.println(dis.search(start, end));
		in.close();
	}
 
}

