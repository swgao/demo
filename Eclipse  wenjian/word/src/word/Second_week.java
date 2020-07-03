package word;

public class Second_week {


class Display
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

class Clock
{
private Display hour = new Display(24);
private Display minute = new Display(60);
private Display second = new Display(60);

public Clock(int hour, int minute, int second)
{
	this.hour.setvalue(hour);
	this.minute.setvalue(minute);
	this.second.setvalue(second);
}

public String toString()
{
	return String.format("%02d:%02d:%02d", hour.getvalue(), minute.getvalue(), second.getvalue());
}

public void tick()
{

	if (this.second.increase() == true)
	{
		if (this.minute.increase() == true) 
			this.hour.increase();
	}
	public void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);

		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());

		clock.tick();

		System.out.println(clock);

		in.close();
	}
}
}