package test;
/*drop table member;
--member�� ���̺�
create table member(
id varchar2(50)primary key,
name varchar2(50) not null,
tel varchar2(50) not null,
addr varchar2(50) not null
);

select*from member;*/
import java.util.Scanner;

import service.MemberService;
import vo.MemberVO;

public class TestMemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag= true;
		int i = 0;
		String id,name,tel,add;
		MemberService service = new MemberService();
		
		
		while(flag) {
			System.out.println("1.���  2.�˻�  3.����  4.���� 5.��ü ��� 6.����");
			i = sc.nextInt();
			switch(i) {
			case 1: 
				System.out.println("���̵� �Է� : ");
				id= sc.next();
				System.out.println("�̸� �Է� : ");
				name= sc.next();
				System.out.println("��ȭ��ȣ �Է� : ");
				tel= sc.next();
				System.out.println("�ּ� �Է� : ");
				add= sc.next();
				service.insert(new MemberVO(id,name,tel,add));
				break;
			case 2://�˻�
				System.out.println("���̵� �Է� : ");
				id= sc.next();
				MemberVO m= service.select(id);
				System.out.println(m);
				break;
			case 3://����
				System.out.println("���� ���̵� �Է� : ");
				id= sc.next();
				System.out.println("�̸� �Է� : ");
				name= sc.next();
				System.out.println("��ȭ��ȣ �Է� : ");
				tel= sc.next();
				System.out.println("�ּ� �Է� : ");
				add= sc.next();
				MemberVO m2= service.select(id);
				service.update(m2);
				break;
			case 4://����
				System.out.println("���� ���̵� �Է� : ");
				id= sc.next();
				service.delete(id);
				break;
			
			case 5:
				service.printAll();			
				break;
				//�ֹ��ϸ� product ���� order���� �ֹ���  ������ŭ����
			case 6: flag = false;
				break;
			default:
				System.out.println("1-6���ڸ� �Է�");
			
			
			}
		
		}
		flag=false;

	
	
}}
