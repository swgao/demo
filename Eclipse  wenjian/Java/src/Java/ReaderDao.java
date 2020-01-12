package Java;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReaderDao {
	//ͨ���û���ţ���ȡ�û���Ϣ
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
	//ͨ��sql��ѯ��䣬��ȡ���߶���
	public static List<Reader> selectReaderList(String sql){
		//����һ��������ߵĶ����б�
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
	//��ȡ���ж����б�
	public static List<Reader> selectReaderList(){
		//�����ѯ�����û���sql��ѯ���
		String sql = "select * from reader";
		return selectReaderList(sql);
	}
	//�����ַ����������Ͳ�ѯ��������ȡ�û��б�
	public static List<Reader> selectReaderList(String field,String value){
		String sql = "select * from reader";//Ĭ�Ϲ��캯����ѯ���
		if((value!=null & value.length()>0)&& field!=null) {
			sql = "select * from reader where "+field+" like '%"+value+"%'";
		}
		return selectReaderList(sql);
	}
	//������û�
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
	//�޸�ָ���û���Ϣ
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
	//ɾ��ָ������
	public static int deleteReader(String id) {
		String sql = "delete from reader where id='"+id+"'";
		return BaseDao.executeUpdate(sql);
		
	}
	//����û�
	public static void emptyReader() {
		String sql = "delete from reader";
		BaseDao.executeUpdate(sql);
	}
}
