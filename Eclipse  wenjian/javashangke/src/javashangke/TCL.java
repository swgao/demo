package javashangke;

public class TCL implements Switch {
	@Override
	public void off() {
		System.out.println("关掉TCL开关");
	}

	@Override
	public void on() {
		System.out.println("打开TCL开关");
	}

}
