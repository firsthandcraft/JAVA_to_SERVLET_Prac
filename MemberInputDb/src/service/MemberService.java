package service;

import vo.MemberVO;

public class MemberService {
	private Dao dao;
	public MemberService() {
		dao= new MemberDAO();
	}
	
	public void insert(MemberVO m) {
		dao.insert(m);
	}
	
	public MemberVO select(String id) {
		return dao.selectMember(id);
	}
	public void update(MemberVO m) {
		dao.update(m);
	}
	public void delete(String id) {
		dao.delete(id);
	}
	public void printAll() {
		System.out.println(dao.selectAll());
	}
}
