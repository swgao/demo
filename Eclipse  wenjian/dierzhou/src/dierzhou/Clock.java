
package dierzhou;

public class Clock 
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
			while(true) {
				   second.increase();
				   if(second.getvalue()==0) {
					   minute.increase();
				 
				   if(minute.getvalue()==0) 
					   hour.increase();
				   }
			
		System.out.println(toString());
		}
	}
}