package Java;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	//ͨ���û����������ȡһ������
	public static User getUser(String name,String pass) {
		User user = null;
		if(name!=null||pass!=null) {
			String sql = "select * from user where name='"+""+name+"'and pass='"+""+pass+"'";
			//ִ�в�ѯ��䣬�����ؽ����
			ResultSet rs = BaseDao.executeQuery(sql);
			try {
				if(rs.next()) {
					//�����û����󣬲������û���Ϣ����Ҫ�������ַ�����
					user = new User();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setPass(rs.getString("pass"));
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}
	//ͨ����ţ���ȡһ������
	public static User getUser(int id) {
		User user = null;
		if(id>0) {
			String sql = "select * from user where id='"+id+"'";
			//ִ�в�ѯ��䣬�����ؽ����
			ResultSet rs = BaseDao.executeQuery(sql);
			try {
				if(rs.next()) { //���ƽ����ָ�룬�жϼ�¼�Ƿ���ڣ�
					user = new User();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setPass(rs.getString("pass"));
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}
	//ͨ���û�������ȡһ������
		public static User getUser(String name) {
			User user = null;
			if(name!=null) {
				String sql = "select * from user where name='"+name+"'";
				//ִ�в�ѯ��䣬�����ؽ����
				ResultSet rs = BaseDao.executeQuery(sql);
				try {
					if(rs.next()) {
						//�����û����󣬲������û���Ϣ����Ҫ�������ַ�����
						user = new User();
						user.setId(rs.getInt("id"));
						user.setName(rs.getString("name"));
						user.setPass(rs.getString("pass"));
					}
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return user;
		}
		//ͨ����ţ���ȡһ������
		public static List<User> selectUserList() {
			User user = null;
			List<User> list = new ArrayList<User>();
				String sql = "select * from user";
				//ִ�в�ѯ��䣬�����ؽ����
				ResultSet rs = BaseDao.executeQuery(sql);
				try {
					while(rs.next()) {
						//�����û����󣬲������û���Ϣ����Ҫ�������ַ�����
						user = new User();
						user.setId(rs.getInt("id"));
						user.setName(rs.getString("name"));
						user.setPass(rs.getString("pass"));
						list.add(user);
					}
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			return list;
		}
		//�������û�
		public static int insertUser(User user) {
			if(user!=null) {
				//��ȡ�û���Ϣ
				int id = user.getId();
				String name = user.getName();
				String pass = user.getPass();
				String sql="insert into user values('"+id+"','"+name+"','"+pass+"')";
				return BaseDao.executeUpdate(sql);
			}
			else {
				return -1;
			}
		}
		//�޸��û���Ϣ
		public static int updateUser(User user) {
			if(user!=null) {
				//��ȡ�û���Ϣ
				int id = user.getId();
				String name = user.getName();
				String pass = user.getPass();
				String sql = "update user set name='"+name+"',pass='"+pass+"' where id="+id+"";
				return BaseDao.executeUpdate(sql);
			}
			else {
				return -1;
			}
		}
		//�޸��û�����
		public static int updatePass(String name,String pass) {
			if(name!=null&&pass!=null) {
				String sql="update user set pass='"+pass+"' where name='"+name+"'";
				return BaseDao.executeUpdate(sql);
			}
			else {
				return -1;
			}
		}
		//ɾ��ָ��id���û�
		public static int deleteUser(int id) {
			String sql="delete from user where id="+id;
			return BaseDao.executeUpdate(sql);
		}
		//���ȫ���û�
		public static void emptyUser() {
			String sql = "delete from user";
			BaseDao.executeQuery(sql);
		}
}