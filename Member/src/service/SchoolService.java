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
	
	//toString() p�迭�� ��� ��带 ���index�� �̿��� �迭��ΰ� �ƴ϶� 
	//�߰��� ��ұ����� ���
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
