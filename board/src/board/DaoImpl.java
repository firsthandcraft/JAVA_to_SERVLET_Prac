package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import join.DBConnect;
public class DaoImpl implements Dao  {
	private DBConnect db = DBConnect.getInstance();
	private Connection conn= db.getConnection();
	private PreparedStatement pstmt;
	
	@Override
	public void insert(Board b) {
		// TODO Auto-generated method stub
		String sql = "insert into board values(seq_board.nextval,?,?,?,sysdate,?)";
											//null Ç×¸ñ¿¡ ÀÚµ¿À¸·Î ÂïÈû
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,b.getWriter());
			pstmt.setString(2,b.getPwd());
			pstmt.setString(3,b.getTitle());
//			pstmt.setDate(5,b.getBoard_date()); -> sysdate·Î 
			pstmt.setString(4,b.getContent());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public Board select(String title) {
		// TODO Auto-generated method stub
		ResultSet rs;
		String sql = "select * from board where title =?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs=pstmt.executeQuery();
			if(rs.next()) { 
				return new Board (rs.getInt(1),rs.getString(2),rs.getString(3)
						,rs.getString(4),rs.getDate(5),rs.getString(6));
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
		ArrayList<Board>data= new ArrayList<Board>();
		String sql ="select * from board";
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				data.add(new Board(rs.getInt(1),rs.getString(2),rs.getString(3)
						,rs.getString(4),rs.getDate(5),rs.getString(6)));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return data;
	}

	@Override
	public void update(Board b) {
		// TODO Auto-generated method stub
		String sql = "update board set title=? ,board_date=sysdate, content=?,pwd=? where num=?";
		//null Ç×¸ñ¿¡ ÀÚµ¿À¸·Î ÂïÈû
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,b.getTitle());
			pstmt.setString(2,b.getContent());
			pstmt.setString(3,b.getPwd()); 
			pstmt.setInt(4,b.getNumber());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql="delete board where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
