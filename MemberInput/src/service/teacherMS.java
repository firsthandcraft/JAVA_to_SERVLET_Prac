package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.MemberVO;
import vo.TwoMembervo;

public class teacherMS {
	private ArrayList<TwoMembervo> list= new ArrayList<TwoMembervo>();
	
	
	//�޼ҵ� 
	//���
	public TwoMembervo addMemberVO(TwoMembervo Twomembervo) {
		Scanner sc= new Scanner(System.in);
		String name,id,tel,add;
		System.out.println("���̵� �Է�: ");
		id=sc.next();
		System.out.println("�̸� �Է�: ");
		name=sc.next();
		System.out.println("��ȣ �Է�: ");
		tel=sc.next();
		System.out.println("�ּ� �Է�: ");
		add=sc.next();
		return new TwoMembervo(id,name, tel, add);
		
	}
	//����
	public void updateMemberVO() {
		//���̵� �˻�
	}
	//����
	public void	printAll() {
		System.out.println(list);
	}
	//����
	public void delMemberVO() {
		//���̵� �˻�
	}
	//�˻�
	public TwoMembervo findMemberVO(String id) {
		//���̵� �˻�
		TwoMembervo pas = null;
		for(int i=0;i<list.size();i++) {
			TwoMembervo pad = list.get(i);//?arraylist�� i ��ŭ �����´ٴ� ��?
			System.out.println(pad);
			
			
			if(id.equals(pad.getId())) {
				pas=pad;
			}
		}
		return pas;
	}
}