package join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoOracleImpl implements Dao {

	private DBConnect db = DBConnect.getInstance();
	//getInstance �� static�� �����ȴ�. 
	//new �� ����� static�� ����� ���ÿ� ����ȴ�. 
	
	private Connection conn= db.getConnection();
	private PreparedStatement pstmt;
	
	
	@Override
	public int insertMember(Member m) {
		// TODO Auto-generated method stub
		String sql="insert into member2 values(?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,m.getId());
			pstmt.setString(2,m.getPwd());
			pstmt.setString(3,m.getName());
			pstmt.setString(4,m.getEmail());
			int line = pstmt.executeUpdate();
			return line;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return 0;
	}

	@Override
	public int updateMember(Member m) {
		// TODO Auto-generated method stub
		String sql ="update member2 set pwd =?, email=? where id=?";
		try  {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,m.getPwd());
			pstmt.setString(2,m.getEmail());
			pstmt.setString(3,m.getId());
			int line = pstmt.executeUpdate();
			pstmt.close();
			return line;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int removeMember(String id) {
		// TODO Auto-generated method stub
		String sql="delete member2 where id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			int line=pstmt.executeUpdate();
			pstmt.close();
			return line;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		//�α����� ����� �ʿ䰡 ������ 
	String sql="select * from member2 where id=? and pwd=?";
			ResultSet rs =null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,pwd);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				return true;//�Է¹��� ���� ������ true�� 
			}
			pstmt.close();
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Member MemberInfo(String id) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
