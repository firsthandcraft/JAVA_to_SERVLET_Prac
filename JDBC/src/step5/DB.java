package step5;
//전부 임포트하고플때 메모리가 많이먹는다. import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DB {
	//
	public Connection conn =null;
	//ctrl+shift+o
	public PreparedStatement pstmt =null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs =null;
	
	public DB() {
		jdbc_driver="oracle.jdbc.driver.OracleDriver";
		jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";	
	}
	public void con() {
		try {
			
			Class.forName(jdbc_driver);
			
			conn =DriverManager.getConnection(jdbc_url,"hr","hr");
			
		} catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	//close 
	public void discon() {
		
		try {
			if(rs!= null) {
				rs.close();
			}
			pstmt.close();
			conn.close();
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void enroll() {
		con ();
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일 : ");
		String email = sc.next();
		
		String sql ="insert into A values(A_seq.nextval,?)";
								// A values A 다음 띄어쓰기			
				//컬럼의 갯수와 물음표의 갯수가 똑같아야한다. 
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,email);
			pstmt.executeUpdate();
			discon();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	//입력
	public void print() {
		con();
		String sql = "select * from A";
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+""+rs.getString(2));
			}
			discon();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	//검색
	public boolean search(int num) {
		con();
		String sql = "select * from A where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);//검색된 데이터를rs가 받아온다. 
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(2));
				return true;
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return false;
	}
	//수정
	public void update() {
		con();
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 사람의 번호 입력 : ");
		int j = sc.nextInt();
		System.out.println("수정할 사람의 이메일 입력 : ");
		String email = sc.next();
		
		//
		String sql ="update A set email=? where num=?";
		try {	
			
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,email);
			pstmt.setInt(2,j);
			pstmt.executeUpdate();
			discon();
			
		}  catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	//삭제 
	public void delete(){
		con();
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 사람의 번호 입력 : ");
		int j = sc.nextInt();
		String sql ="delete from A where num=?";
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
