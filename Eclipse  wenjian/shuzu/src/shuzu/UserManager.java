package shuzu;


import java.util.ArrayList;
import java.util.List;
public class UserManager {
static List<User> stu;
void add(String name) {
		User stud=new User();
		stud.setName(name);
		stu.add(stud);
		System.out.println("�ɹ����"+name+"�û���");
	}
void delete(String name) 
	{
		for(int loop=0;loop<stu.size();loop++)
		{
			if(((User)stu.get(loop)).getName()==name)
			{
				stu.remove(loop);
				System.out.println("�ɹ�ɾ��"+name+"�û���");
				break;
			}
			System.out.println("���û�");
		}
	}
void search(String name)
	{
		for(int loop=0;loop<stu.size();loop++)
		{
			if(((User)stu.get(loop)).getName()==name)
			{
				User s=(User)stu.get(loop);
				System.out.print("���ڣ�");
				break;
			}
			System.out.print("�����ڣ�"); 
		}
	}
public void findUser() {
	for(User user: stu) {
		System.out.print(user);
	}
}
	public static void main(String[] args) {
		UserManager d=new UserManager();
		d.stu=new ArrayList<User>();
		d.add("Yu");
		d.search("Yu1");
		d.findUser();
	}
}
