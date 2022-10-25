package step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.driver loading Ŭ������ 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver ok");
			//2.DB connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//�ּ� ���̵� �н�����
			System.out.println("connection ok");
			//3.statement:SQL�� �����ϴ� ���
			Statement stmt = con.createStatement(); //ctrl_shift +o 
			//������ �ۼ�
			//����
			String sql ="delete from member where name='��ŷ�'";
			int result= stmt.executeUpdate(sql);//insert =executeUpdate�� ������Ѵ�.
			System.out.println(result);//������ �� row��(���� �Ѹ� ���� 1�� ��ȯ0)
			
			//6.close	
			stmt.close();
			con.close();
					
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}}
