package service;

import java.util.ArrayList;

import vo.MemberVO;

public interface Dao {//등록,,출력 수정, 삭제 
	void con();
	void discon();
	void insert(MemberVO m);
	MemberVO selectMember(String id);
	void update(MemberVO m);
	void delete(String id);
	ArrayList selectAll();
	
}
