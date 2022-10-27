package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.Employee;
import vo.Member;
import vo.Professor;
import vo.Student;

public class MemberDAO implements Dao{
	Connection conn =null;
	PreparedStatement pstmt=null;
	ResultSet rs =null;
	@Override
	public void con() {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver ok");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//주소 아이디 패스워드
			System.out.println("connection ok");
			} catch(Exception e) {
				System.out.println(e);
			}
	}

	@Override
	public void discon() {
		// TODO Auto-generated method stub
		try {
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		con();
		String sql = "insert into school values(?,?,?,?,?,?)";
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getTel());
			pstmt.setString(4, m.getAddr());
			pstmt.setInt(5, m.getType());
//			pstmt.setString(6, );//타입 비교 
			if(m instanceof Professor){
				pstmt.setString(6,((Professor)m).getDept());
			} else if(m instanceof Employee) {
				pstmt.setString(6,((Employee)m).getJob());
			}else if(m instanceof Student) {
				pstmt.setString(6,((Student)m).getSchool());
			}
			pstmt.executeUpdate();

		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}

	@Override
	public ArrayList selectAll(int type) {
		// TODO Auto-generated method stub
		con();
		ArrayList<Member>m = new ArrayList<Member>();
		String sql ="select * from member where type=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,type);
			rs = pstmt.executeQuery();
			if(type ==1){
				while(rs.next()) {
					m.add(new Student(rs.getString(1),rs.getString(2),rs.getString(3),
							rs.getString(4),rs.getInt(5),rs.getString(6)));
				}
			} else if(type ==2) {
				while(rs.next()) {
					m.add(new Professor(rs.getString(1),rs.getString(2),rs.getString(3),
							rs.getString(4),rs.getInt(5),rs.getString(6)));
				}
			}else if(type ==3) {
				while(rs.next()) {
					m.add(new Professor(rs.getString(1),rs.getString(2),rs.getString(3),
							rs.getString(4),rs.getInt(5),rs.getString(6)));
				}
			} 
			rs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return m;
	
	}

	@Override
	public Member selectMember(String id) {
		// TODO Auto-generated method stub
		con();
		Member m=null;
		String sql ="select * from school where id =?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			
				if(rs.next()) { 
					if(rs.getInt("type") ==1) {
						m= new Student(rs.getString(1),rs.getString(2),rs.getString(3),
								rs.getString(4),rs.getInt(5),rs.getString(6));
					} else if(rs.getInt("type") ==2) {
						m= new Professor(rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getString(6));
				} else if(rs.getInt("type") ==3) {
					m= new Employee(rs.getString(1),rs.getString(2),rs.getString(3),
					rs.getString(4),rs.getInt(5),rs.getString(6));
			}	
					}

		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return m;
		
	}

	@Override
	public boolean update(Member m) {
		// TODO Auto-generated method stub
		con();
		
		String sql ="update school set tel=?,addr=?,etc=? where id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, m.getTel());
			pstmt.setString(2, m.getAddr());
			if(m.getType()==1) {
				pstmt.setString(3, ((Student)m).getSchool());
			}else if(m.getType()==2) {
				pstmt.setString(3, ((Professor)m).getDept());
			}else if(m.getType()==3) {
				pstmt.setString(3, ((Employee)m).getJob());
			}
			pstmt.setString(4, m.getId());
			pstmt.executeUpdate();

		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return false;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		int num=0;
		con();
		String sql ="delete school where id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		discon();
		
	}

}
