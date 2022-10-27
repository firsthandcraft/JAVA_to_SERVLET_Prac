package service;

import java.util.ArrayList;

import vo.Member;

public interface Dao {
	void con();
	void discon();
	void insert(Member vo);
	ArrayList selectAll(int type);
	Member selectMember(String id);
	boolean update(Member m);
	void delete(String id);
}
