package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import board.Board;
import join.DBConnect;

public class DaoImpl implements Dao {
	private DBConnect db = DBConnect.getInstance();
	private Connection conn = db.getConnection();
	private PreparedStatement pstmt;
	String sql="";
	
	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		sql="insert into product values(seq_product.nextval?,?,?,?)";
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,p.getName());
			pstmt.setInt(2,p.getPrice()); 
			pstmt.setInt(3,p.getQuantity());
			pstmt.setString(4,p.getId());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public Product selectByNum(int num) {
		// TODO Auto-generated method stub
		ResultSet rs;
		sql = "select * from Product where num =?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) { 
				return new Product (rs.getInt(1),rs.getString(2),rs.getInt(3)
						,rs.getInt(4),rs.getString(5));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Product selectByName(String name) {
		// TODO Auto-generated method stub
		ResultSet rs;
		 sql = "select * from Product where name =?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next()) { 
				return new Product (rs.getInt(1),rs.getString(2),rs.getInt(3)
						,rs.getInt(4),rs.getString(5));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		ResultSet rs;
		ArrayList<Product>data= new ArrayList<Product>();
		sql ="select * from product";
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				data.add(new Product (rs.getInt(1),rs.getString(2),rs.getInt(3)
						,rs.getInt(4),rs.getString(5)));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return data;
	}
	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		sql = "update product set name=?, price=?,quantity=?  where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,p.getName());
			pstmt.setInt(2,p.getPrice());
			pstmt.setInt(3,p.getQuantity());
			pstmt.setInt(4,p.getNum());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		 sql="delete product where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
