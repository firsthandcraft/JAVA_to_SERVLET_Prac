package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//검색
		try {
			//드라이버 가져오기
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//확인차 출력하기 
			System.out.println("driver ok");
			
			//2.DB connection
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			//주소 아이디 패스워드
			System.out.println("connection ok");
			
			//3.statement:SQL을 실행하는 기능
			Statement stmt = con.createStatement(); //ctrl_shift +o  -> java.sql.Statment클릭 ->finish
			String sql ="select id, password, name, address from member";
			
			//4. sql (=query)를 실행 : ResultSet interface type으로 반환
			ResultSet rs = stmt.executeQuery(sql);//값에 변화가 없을때 executeQuery
			
			//5.ResultSet의 추상 메서드를 이용하여 결과를 확인한다. 
			// 값 출력하기 
//			System.out.println("ddd");
			// sql developer를 저장하고 끄면 나머지 값이 나온다. 
			while (rs.next()) {//다음행이 있으면 true 없으면 false
//				System.out.println("fff");
				System.out.println("첫번째 값 : "+rs.getString(1)+" 두번째 값 : "+rs.getString(2)+"세번째 값 : "
								+rs.getString("name")+" 네법째 값 : "+rs.getString("address"));
			}
			
			//6.close			
			//열어준 반대 순서대로 
			rs.close();
			stmt.close();
			con.close();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
}}
/*driver ok
connection ok
첫번째 값 : jsp 두번째 값 : king세번째 값 : 남남남네법째 값 : 안양
첫번째 값 : jdbc 두번째 값 : abcd세번째 값 : 신신신네법째 값 : 수서
*/
