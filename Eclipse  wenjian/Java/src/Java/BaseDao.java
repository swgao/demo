package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	protected static String driver = "com.mysql.jdbc.Driver";//������Ҫ���ص�����
	protected static String url = "jdbc:mysql://localhost:3306/db_9";//���ӵ����ݿ�
	protected static String dbUser = "root";//�����˺�
	protected static String dbPwd = "";//��������
	public static Connection conn = null; //���������ݿ�����Ӷ���
	private BaseDao() {    //�÷��������������ݿ�
		try {
			if(conn==null) {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,dbUser,dbPwd); //����ָ�����������ݿ��������
		}
		else {
			return;
		}
			} 
		catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	//����ִ�ж���ִ�в�ѯ���
	public static ResultSet executeQuery(String sql) {
		if(sql!=null) {
			if(conn==null) {
				new BaseDao();
			}
		try {
			return conn.createStatement(/*ResultSet.TYPE_SCROLL_SENSITIVE�����ڼ�¼�ж�λ�����������ܵ������û��������ĵ�Ӱ�졣
				����û���ִ�����ѯ֮��ɾ��һ����¼���Ǹ���¼���� ResultSet ����ʧ�����Ƶģ�������ֵ�ĸ���Ҳ����ӳ�� ResultSet ��
				,ResultSet.CONCUR_UPDATABLEָ�����Ը��� ResultSet*/).executeQuery(sql);
		}
		catch(SQLException e) {
			System.out.println("��ѯʧ��");
			e.printStackTrace();
			return null;
		}
	}else {
		System.out.println("��ѯ���Ϊ��");
		return null;
	}
	}
	//����ִ�ж���ִ�и������
	public static int executeUpdate(String sql) {
		if(sql!=null) {
			if(conn==null) {
				new BaseDao();
			}
		try {
			return conn.createStatement().executeUpdate(sql);
		}
		catch(SQLException e) {
			System.out.println("����ʧ��");
			e.printStackTrace();
			return -1;
		}
	}else {
		System.out.println("�������Ϊ��");
		return -1;
	}
	}
	public static void close() {
		if(conn!=null) {
			try {
				conn.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
				return;
			}
		}
		else {
			return;
		}
	}

}
