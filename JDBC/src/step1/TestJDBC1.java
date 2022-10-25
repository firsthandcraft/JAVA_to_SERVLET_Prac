package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�˻�
		try {
			//����̹� ��������
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Ȯ���� ����ϱ� 
			System.out.println("driver ok");
			
			//2.DB connection
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			//�ּ� ���̵� �н�����
			System.out.println("connection ok");
			
			//3.statement:SQL�� �����ϴ� ���
			Statement stmt = con.createStatement(); //ctrl_shift +o  -> java.sql.StatmentŬ�� ->finish
			String sql ="select id, password, name, address from member";
			
			//4. sql (=query)�� ���� : ResultSet interface type���� ��ȯ
			ResultSet rs = stmt.executeQuery(sql);//���� ��ȭ�� ������ executeQuery
			
			//5.ResultSet�� �߻� �޼��带 �̿��Ͽ� ����� Ȯ���Ѵ�. 
			// �� ����ϱ� 
//			System.out.println("ddd");
			// sql developer�� �����ϰ� ���� ������ ���� ���´�. 
			while (rs.next()) {//�������� ������ true ������ false
//				System.out.println("fff");
				System.out.println("ù��° �� : "+rs.getString(1)+" �ι�° �� : "+rs.getString(2)+"����° �� : "
								+rs.getString("name")+" �׹�° �� : "+rs.getString("address"));
			}
			
			//6.close			
			//������ �ݴ� ������� 
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
ù��° �� : jsp �ι�° �� : king����° �� : �������׹�° �� : �Ⱦ�
ù��° �� : jdbc �ι�° �� : abcd����° �� : �ŽŽų׹�° �� : ����
*/
