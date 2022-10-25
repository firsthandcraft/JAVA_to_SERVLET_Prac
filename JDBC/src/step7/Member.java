package step7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Member {
	public Connection conn=null;
	public PreparedStatement pstmt=null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs =null;
	
	
	public Member() {	
		jdbc_driver="oracle.jdbc.driver.OracleDriver";
		jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";	
	}
	public void con() {
		try {
			Class.forName(jdbc_driver);
			conn =DriverManager.getConnection(jdbc_url,"hr","hr");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void discon() {
		try {
			if (rs!=null) {
				rs.close();
			}
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void MemberInsert() {
		con();
		Scanner sc = new Scanner(System.in);
		System.out.println("사람넘버");
		String num=sc.next();
		System.out.println("이름");
		String name=sc.next();
		System.out.println("주소");
		String addr=sc.next();
		System.out.println("전화번호");
		String tel=sc.next();
		
		String sql ="insert into Member values(MEMBER_SEQ.nextval,?,?,?)";
															//반드시 입력한 값은 테이블에 맞춰 만든 대로 제작
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,addr);
			pstmt.setString(3,tel);
			pstmt.executeUpdate();
			discon();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	public void MemberPrint() {
		con();
		String sql = "select * from Member";
		try {
			pstmt= conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("사람넘버 : "+rs.getInt(1));
				System.out.println("이름 : "+rs.getString(2));
				System.out.println("주소 : "+rs.getString(3));
				System.out.println("전화번호 : "+rs.getString(4));
				System.out.println("-------------------");

			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	public boolean Search(String name) {//name 으로 검색
		con();
		String sql = "select * from Member where name=?";
		
		try{
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();
				while(rs.next()) {
						System.out.println("이름 : "+rs.getString(1));
						System.out.println("주소 : "+rs.getString(2));
						System.out.println("전화번호 : "+rs.getString(3));
						return true;
				}
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return false;
	}
	public void update() {
		con();
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 사람의 번호 입력 : ");
		int tel = sc.nextInt();
		System.out.println("수정할 사람의 주소 입력 : ");
		String addr = sc.next();
		
		//
		String sql ="update Member set addr=? where tel=?";
		try {	
			
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,addr);
			pstmt.setInt(2,tel);
			pstmt.executeUpdate();
			discon();
			
		}  catch(Exception e) {
			System.out.println(e);
		}
	}//전화 , 주소 
	
	public void delete() {
		con();
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 사람의 번호 입력 : ");
		int j = sc.nextInt();
		String sql ="delete from Member where num=?";
		try {	
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1,j);
			pstmt.executeUpdate();
			discon();
			
		}  catch(Exception e) {
			System.out.println(e);
		}
	}

	
}
