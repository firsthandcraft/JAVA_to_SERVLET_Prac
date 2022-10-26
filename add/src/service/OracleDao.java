package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.Member;
public class OracleDao implements Dao {

	Connection conn =null;
	PreparedStatement pstmt=null;
	ResultSet rs =null;
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
	public void insert(Member m) {
		// TODO Auto-generated method stub
		con();
		String sql ="insert into addr values(?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,m.getName());
			pstmt.setString(2,m.getTel());
			pstmt.setString(3,m.getAddress());
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		con();
		ArrayList<Member>list = new ArrayList<Member>();
		String sql ="select * from addr";
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Member(rs.getString(1),rs.getString(2)
						,rs.getString(3)));
			}

		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return list;
	}

	@Override
	public Member select(String name) {
		// TODO Auto-generated method stub
		con();
		Member m = null;
		String sql ="select * from addr where name=?";
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				m= new Member(rs.getString(1),rs.getString(2)
						,rs.getString(3));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return m;
	}

	@Override
	public boolean update(Member m) {
		// TODO Auto-generated method stub
		int num=0;
		
		con();
	
		String sql ="update addr set tel=?,address=? where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,m.getTel());
			pstmt.setString(2,m.getAddress());
			pstmt.setString(3,m.getName());
			num=pstmt.executeUpdate();//1이 나온다. 
			
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		if(num <= 0) {			
			return false;
		} else {return true;}
	}

	@Override
	public boolean delete(String name) {
		// TODO Auto-generated method stub
		int num=0;
		con();
		String sql ="delete addr where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		if(num <= 0) {			
			return false;
		} else {return true;}
	}

}
