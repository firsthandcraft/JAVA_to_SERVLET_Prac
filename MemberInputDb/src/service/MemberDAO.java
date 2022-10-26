package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.MemberVO;

public class MemberDAO implements Dao {
	
	Connection conn =null;
	PreparedStatement pstmt=null;
	ResultSet rs =null;
	@Override
	public void con() {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver ok");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//주소 아이디 패스워드
		System.out.println("connection ok");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	@Override
	public void discon() {
		// TODO Auto-generated method stub
		try {
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			System.err.println(e);
		}
	}
	@Override
	public void insert(MemberVO m) {
		// TODO Auto-generated method stub
		con();
		String sql ="insert into member values(?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,m.getId());
			pstmt.setString(2,m.getName());
			pstmt.setString(3,m.getTel());
			pstmt.setString(4,m.getAdd());
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}
	@Override
	public MemberVO selectMember(String id) {
		// TODO Auto-generated method stub
		con();
		MemberVO m = null;
		String sql ="select * from member where id=?";
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				m= new MemberVO(rs.getString(1),rs.getString(2)
						,rs.getString(3),rs.getString(4));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return m;
	}
	@Override
	public void update(MemberVO m) {
		// TODO Auto-generated method stub
		con();
		String sql ="update member set name=?,tel=?,addr=? where id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,m.getId());
			pstmt.setString(2,m.getName());
			pstmt.setString(3,m.getTel());
			pstmt.setString(4,m.getAdd());
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		con();
		String sql ="delete member where  id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}
	@Override
	public ArrayList selectAll() {
		// TODO Auto-generated method stub
		con();
		ArrayList<MemberVO>m = new ArrayList<MemberVO>();
		String sql ="select * from member";
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				m.add(new MemberVO(rs.getString(1),rs.getString(2)
						,rs.getString(3),rs.getString(4)));
			}

		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return m;
	}
	
	
}
