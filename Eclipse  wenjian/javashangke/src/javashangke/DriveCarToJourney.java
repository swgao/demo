package javashangke;

public class DriveCarToJourney {

	public static void main(String[] args) {
		Guoqing xiaowang = new Guoqing("С��");
		Guoqing xiaoliu = new Guoqing("С��");
        Qiche car = new Qiche("��ɫ��","����");
        String from =  "����";
        String to = "����";
        xiaowang.talk();
        xiaowang.dirve(car);
        car.run(from, to);
        xiaowang.lock(car);
        xiaowang.talk("��Ϣһ�£�����ɣ�");
        xiaowang.talk(xiaoliu,"��Ϣһ�£�����ɣ�");
	}

}
