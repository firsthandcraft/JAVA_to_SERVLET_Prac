package step6;
//시퀀스 없이 제작
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Product {
	// 전역변수로 connection close 선언
	//1. connection
	public Connection conn = null;
	public PreparedStatement pstmt =null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs =null;
	
	public Product() {
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

	public void ProductInsert() {
		con();
		Scanner sc = new Scanner(System.in);
		System.out.println("제품번호 : ");
		String p_id = sc.next();
		System.out.println("제품이름 : ");
		String name = sc.next();
		System.out.println("제품수량 : ");
		String num = sc.next();
		System.out.println("제조사 : ");
		String co = sc.next();
		System.out.println("제품가격 : ");
		String price = sc.next();
		
		String sql ="insert into Product values(?,?,?,?,?)";
		
		//jDBC쓰기 
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,p_id);
			pstmt.setString(2,name);
			pstmt.setString(3,num);
			pstmt.setString(4,co);
			pstmt.setString(5,price);
			pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void ProductPrint() {
		con();
		String sql = "select * from product";
		try {
			pstmt= conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//rs 썻으니 while문 쓰기 
			while(rs.next()) {
				System.out.println("제품번호 : "+rs.getInt(1));
				System.out.println("제품명 : "+rs.getString(2));
				System.out.println("제품수량 : "+rs.getString(3));
				System.out.println("제조사 : "+rs.getString(4));
				System.out.println("제품가격 : "+rs.getString(5));
				System.out.println("--------------------------");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}
	public boolean Productsearch(int p_id) {
		con();
		String sql = "select * from product where p_id=?";
		
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1,p_id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				if(p_id == rs.getInt(1)) {
					System.out.println("제품아이디 : "+rs.getInt(1));
					System.out.println("제품명 : "+rs.getString(2));
					System.out.println("제품수량 : "+rs.getString(3));
					System.out.println("제조사 : "+rs.getString(4));
					System.out.println("제품가격 : "+rs.getString(5));			
					return true;
				}
				
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		
		return false;
	}
	public void order() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상호 : ");
		String cus = sc.next();
		
		System.out.println("제품아이디: ");
		int p_id = sc.nextInt();
		System.out.println("제품번호: ");
		int num = sc.nextInt();
		
		
		boolean f = Productsearch(p_id);
		if(!f) {
			System.out.println("제품없다. ");
			return ;
		} 
		con();
		try {
			String sql1 ="select num from product where p_id=?";
			pstmt=conn.prepareStatement(sql1);
			pstmt.setInt(1,p_id);
			pstmt.executeQuery();
			rs=pstmt.executeQuery();
			rs.next();
			int n= rs.getInt(1);
			if(n<num) {
				System.out.println("수량이 크다");
				return;
			} else {
				n-=num;
				NumUpdate(p_id,n);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		con();
		try {
			String sql ="insert into order1 values(?, SYSDATE, ?,?)";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,cus);
			pstmt.setInt(2,p_id);
			pstmt.setInt(3,num);
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}
		
	 

	public void NumUpdate(int p_id, int num) {
		con();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("수정할 제품의 번호 입력 : ");
//		int j = sc.nextInt();
//		System.out.println("수정할 제품의 이메일 입력 : ");
//		String email = sc.next();
		try {	
			String sql ="update product set num=? where p_id=?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			pstmt.setInt(2,p_id);
			pstmt.executeUpdate();
			discon();
			
		}  catch(Exception e) {
			System.out.println(e);
		}
	}
	public void print_ord() {
		con();
		String sql = "select * from order1";
		try {
			pstmt= conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//rs 썻으니 while문 쓰기 
			while(rs.next()) {
				System.out.println("상호: "+rs.getInt(1));
				System.out.println("주문날짜 : "+rs.getString(2));
				System.out.println("제품번호 : "+rs.getInt(3));
				System.out.println("주문 수량 "+rs.getInt(4));
				System.out.println("--------------------------");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}
}
