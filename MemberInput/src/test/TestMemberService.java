package test;

import java.util.Scanner;

import service.MemberService;
import vo.MemberVO;

public class TestMemberService {
public static void main(String[] args) {

	Scanner sc=  new Scanner(System.in);
	String id = null,name = null,tel = null,address;
	boolean flag =true;
	int i=0;
	
	MemberService service= new MemberService();
	while(flag) {
		System.out.println("1.��� 2.�˻� 3.���� 4.���� 5.��ü��� 6.����");
		i= sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("���̵� �Է�: ");
			id=sc.next();
			System.out.println("�̸� �Է�: ");
			name=sc.next();
			System.out.println("��ȣ �Է�: ");
			tel=sc.next();
			System.out.println("�ּ� �Է�: ");
			address=sc.next();
			
			service.addMemberVO(new MemberVO(id,name,tel,address));
			break;
		case 2:
			System.out.println("���̵� �Է�: ");
			id=sc.next();
			MemberVO m =service.findMemberVO(id);
			System.out.println(m);
			break;

		case 3:
			System.out.println("������ ���̵� �Է�: ");
			id=sc.next();
			System.out.println("������ �̸� �Է�: ");
			name=sc.next();
			System.out.println("������ ��ȣ �Է�: ");
			tel=sc.next();
			System.out.println("������ �ּ� �Է�: ");
			address=sc.next();
			
			MemberVO m2= new MemberVO(id,name,tel,address);
			service.updateMemberVO(m2);
			
			break;
		case 4:
			System.out.println("�������̵� �Է�");
			id=sc.next();
			service.deleteMemberVO(id);
			break;
		case 5:
			service.printAll();
			break;
		case 6:
			flag=false;
			break;
		default: 
			System.out.println("1-6�� ���ڸ� �Է¹ٶ��ϴ�.");
		}
	}
}}
