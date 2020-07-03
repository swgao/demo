package dierzhou;

public class Display

{
	private int limit = 0;
	private int value = 0;
 
	public Display(int limit)
	{
		// TODO Auto-generated constructor stub
		this.limit = limit;
	}
 
	public void setvalue(int value)
	{
		this.value = value;
	}
 
	public boolean increase()
	{
		boolean temp = false;
		value++;
		if (value == limit)
		{
			value = 0;
			temp = true;
		}
		return temp;
	}
 
	public int getvalue()
	{
		return value;
	}
}