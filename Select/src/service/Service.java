package service;

import java.util.ArrayList;

import vo.Member;

public interface Service {
	void addMember(Member m);
	Member getMember(String id);
	boolean editMember(Member m);
	void delMember(String id);
	ArrayList getMembers(int type);
}
