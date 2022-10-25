package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC3 {
//수정
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.driver loading 클래스명 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver ok");
			//2.DB connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//주소 아이디 패스워드
			System.out.println("connection ok");
			//3.statement:SQL을 실행하는 기능
			Statement stmt = con.createStatement(); //ctrl_shift +o 
			//쿼리문 작성
			//장매력의 주소가 수서로 바뀜
			String sql ="update member set address='수서' where name ='장매력'";

			int result= stmt.executeUpdate(sql);//insert =executeUpdate를 써줘야한다.
			System.out.println(result);//영향을 준 row수(만약 한명 들어가면 1이 반환0)
			
			//6.close	
			stmt.close();
			con.close();
					
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}}
