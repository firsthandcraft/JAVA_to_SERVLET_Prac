package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.MemberVO;
import vo.TwoMembervo;

public class teacherMS {
	private ArrayList<TwoMembervo> list= new ArrayList<TwoMembervo>();
	
	
	//메소드 
	//등록
	public TwoMembervo addMemberVO(TwoMembervo Twomembervo) {
		Scanner sc= new Scanner(System.in);
		String name,id,tel,add;
		System.out.println("아이디 입력: ");
		id=sc.next();
		System.out.println("이름 입력: ");
		name=sc.next();
		System.out.println("번호 입력: ");
		tel=sc.next();
		System.out.println("주소 입력: ");
		add=sc.next();
		return new TwoMembervo(id,name, tel, add);
		
	}
	//수정
	public void updateMemberVO() {
		//아이디 검색
	}
	//전출
	public void	printAll() {
		System.out.println(list);
	}
	//삭제
	public void delMemberVO() {
		//아이디 검색
	}
	//검색
	public TwoMembervo findMemberVO(String id) {
		//아이디 검색
		TwoMembervo pas = null;
		for(int i=0;i<list.size();i++) {
			TwoMembervo pad = list.get(i);//?arraylist를 i 만큼 가져온다는 말?
			System.out.println(pad);
			
			
			if(id.equals(pad.getId())) {
				pas=pad;
			}
		}
		return pas;
	}
}