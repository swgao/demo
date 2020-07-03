package Java;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReaderDao {
	//通过用户编号，获取用户信息
	public static Reader getReaderById(String id) {
		Reader reader = null;
		if(id!=null) {
			String sql = "select * from reader where id="+id;
			ResultSet rs = BaseDao.executeQuery(sql);
			try {
				if(rs.next()) {
					reader = new Reader();
					reader.setId(rs.getString("id"));
					reader.setName(rs.getString("name"));
					reader.setSex(rs.getString("sex"));
					reader.setDay(rs.getString("day"));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return reader;
		
	}
	//通过sql查询语句，获取读者对象
	public static List<Reader> selectReaderList(String sql){
		//创建一个保存读者的对象列表
		List<Reader> list = new ArrayList<Reader>();
		if(sql!=null) {
			Reader reader=null;
			ResultSet rs = BaseDao.executeQuery(sql);
			try {
				while(rs.next()) {
					reader = new Reader();
					reader.setId(rs.getString("id"));
					reader.setName(rs.getString("name"));
					reader.setSex(rs.getString("sex"));
					reader.setDay(rs.getString("day"));
					list.add(reader);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	//获取所有对象列表
	public static List<Reader> selectReaderList(){
		//构造查询所有用户的sql查询语句
		String sql = "select * from reader";
		return selectReaderList(sql);
	}
	//按照字符串属性类型查询条件，获取用户列表
	public static List<Reader> selectReaderList(String field,String value){
		String sql = "select * from reader";//默认构造函数查询语句
		if((value!=null & value.length()>0)&& field!=null) {
			sql = "select * from reader where "+field+" like '%"+value+"%'";
		}
		return selectReaderList(sql);
	}
	//添加新用户
	public static int insertReader(Reader reader) {
		if(reader!=null) {
			String id = reader.getId();
			String name = reader.getName();
			String sex = reader.getSex();
			String day = reader.getDay();
			String sql = "insert into reader values('"+id+"','"+name+"','"+sex+"','"+day+"')";
			return BaseDao.executeUpdate(sql);
			
		}else{
			return -1;
		}
	}
	//修改指定用户信息
	public static int updateReader(Reader reader) {
		if(reader!=null) {
			String id = reader.getId();
			String name = reader.getName();
			String sex = reader.getSex();
			String day = reader.getDay();
			String sql = "update reader set name='"+name+"',sex='"+sex+"',day='"+day+"' where id='"+id+"'";
			return BaseDao.executeUpdate(sql);
		}else {
			return -1;
		}
	}
	//删除指定读者
	public static int deleteReader(String id) {
		String sql = "delete from reader where id='"+id+"'";
		return BaseDao.executeUpdate(sql);
		
	}
	//清空用户
	public static void emptyReader() {
		String sql = "delete from reader";
		BaseDao.executeUpdate(sql);
	}
}
