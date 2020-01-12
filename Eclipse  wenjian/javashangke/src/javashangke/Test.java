package javashangke;

public class Test {

	public static void main(String[] args) {
		jicheng p = new jicheng();
		p.name="Tom";
		p.sex= '男';
		p.setAge(18);
		p.eat("面包");
		p.play("斗地主");
		p.talk();
		student s = new student("小明",9,'男',"0401","040101");
		s.eat("快餐");
		s.play("王者荣耀");
		s.sport("足球");
		s.talk();
		s.banji("一年级");
	}

}
