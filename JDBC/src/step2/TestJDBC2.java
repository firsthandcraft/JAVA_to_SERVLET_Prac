package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추가 
		try {
			//1.driver loading 클래스명 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver ok");
			//2.DB connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//주소 아이디 패스워드
			System.out.println("connection ok");
			//3.statement:SQL을 실행하는 기능
			Statement stmt = con.createStatement(); //ctrl_shift +o 
			//4.쿼리문 작성
			String sql ="insert into member(id,password,name,address)values('spring','aaㅇaa','장마력','길동')";
			//각각 일치 해야한다. id- spring pa=aaaa name-장매력 add =길동
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
		//두번 run 하면 에러 같
}}
