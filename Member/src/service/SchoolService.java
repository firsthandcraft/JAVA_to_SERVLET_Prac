package service;

import vo.MemberVO;

public class SchoolService {
	private int index;
	//ctrl+ shift +O
	private MemberVO p[]= new MemberVO[10];
	
	public void addPerson(MemberVO p) {
	this.p[index]=p;
	index++;
	}
	
	//toString() p배열의 요소 모드를 출력index를 이용해 배열모두가 아니라 
	//추가된 요소까지만 출력
	public void printAll() {
		for(int i =0; i<index;i++) {
			System.out.println(p[i]);
		}
	}
	
	public MemberVO findPerson(String tel) {
		
		MemberVO per =null;
		for(int i=0;i<index;i++) {
			if(p[i].getTel().equals(tel)) {
				per=p[i];
			}
		}
		
		return per;
	}
	
}
