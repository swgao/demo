package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	protected static String driver = "com.mysql.jdbc.Driver";//定义需要加载的驱动
	protected static String url = "jdbc:mysql://localhost:3306/db_9";//连接的数据库
	protected static String dbUser = "root";//定义账号
	protected static String dbPwd = "";//定义密码
	public static Connection conn = null; //声明与数据库的连接对象
	private BaseDao() {    //该方法用于连接数据库
		try {
			if(conn==null) {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,dbUser,dbPwd); //按照指定参数对数据库进行连接
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
	//创建执行对象，执行查询语句
	public static ResultSet executeQuery(String sql) {
		if(sql!=null) {
			if(conn==null) {
				new BaseDao();
			}
		try {
			return conn.createStatement(/*ResultSet.TYPE_SCROLL_SENSITIVE允许在记录中定位。这种类型受到其他用户所作更改的影响。
				如果用户在执行完查询之后删除一个记录，那个记录将从 ResultSet 中消失。类似的，对数据值的更改也将反映在 ResultSet 中
				,ResultSet.CONCUR_UPDATABLE指定可以更新 ResultSet*/).executeQuery(sql);
		}
		catch(SQLException e) {
			System.out.println("查询失败");
			e.printStackTrace();
			return null;
		}
	}else {
		System.out.println("查询语句为空");
		return null;
	}
	}
	//创建执行对象，执行更新语句
	public static int executeUpdate(String sql) {
		if(sql!=null) {
			if(conn==null) {
				new BaseDao();
			}
		try {
			return conn.createStatement().executeUpdate(sql);
		}
		catch(SQLException e) {
			System.out.println("更新失败");
			e.printStackTrace();
			return -1;
		}
	}else {
		System.out.println("更新语句为空");
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
