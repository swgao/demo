package javashangke;

public class DriveCarToJourney {

	public static void main(String[] args) {
		Guoqing xiaowang = new Guoqing("小王");
		Guoqing xiaoliu = new Guoqing("小刘");
        Qiche car = new Qiche("蓝色的","蓝鸟");
        String from =  "西安";
        String to = "拉萨";
        xiaowang.talk();
        xiaowang.dirve(car);
        car.run(from, to);
        xiaowang.lock(car);
        xiaowang.talk("休息一下，在玩吧！");
        xiaowang.talk(xiaoliu,"休息一下，在玩吧！");
	}

}
