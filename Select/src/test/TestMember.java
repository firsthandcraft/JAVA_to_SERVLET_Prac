package test;

import java.util.Scanner;

import service.MemberService;
import service.Service;
import vo.Employee;
import vo.Member;
import vo.Professor;
import vo.Student;

/*
create table school(
	id varchar2(20)primary key,
    name varchar2(20)not null,
    tel varchar2(20),
    addr varchar2(20),
    type number(30)not null,
    etc varchar2(20)
);
//���ξ��� ���ڴ� ������ ����
*/

public class TestMember {
public static void main(String[] args) {
	Member m = null;
	String [] tag = {"","shool","dept","job"};
	Service service = new MemberService();
	Scanner sc= new Scanner(System.in);
	boolean flag= true, flag2=false;
	int j,i,type=0;
	String id="", name="",tel="",addr="",etc="";
	
	while(flag) {
//		System.out.println("1. ȸ������ 2. �� ���� ���� 3. �α���  4. �α׾ƿ� 5. Ż�� 6.����");
		System.out.println("1. ��� 2. �˻� 3. ����  4. ���� 5. ����� 6.����");
		j= sc.nextInt();
		
		switch(j) {
		case 1:
			System.out.println("�׷켱�� \n 1. �л� 2. ���� 3.������:");
			type=sc.nextInt();
			System.out.println("���̵��Է� :");
			id=sc.next();
			System.out.println("�̸� �Է� :");
			name=sc.next();
			System.out.println("��ȭ��ȣ �Է� :");
			tel=sc.next();
			System.out.println("�ּ� �Է� :");
			addr=sc.next();
			System.out.println(tag[type]+"�� �Է��ϼ���. \n");
			etc=sc.next();
				if(type ==1) {
					service.addMember(new Student(id, name,tel,addr,type,etc));
				} else if(type ==2) {
					service.addMember(new Professor(id, name,tel,addr,type,etc));
				} else if(type ==3) {
					service.addMember(new Employee(id, name,tel,addr,type,etc));
				} else {
					System.out.println("�Է¿���");
				}
			break;
		case 2:
			System.out.println("�˻����̵� �Է�");
			id=sc.next();
			m= service.getMember(id);
			String str = "";
			
			if(m.getType() ==1) {
				str=((Student)m).toString();
			} else if(m.getType()  ==2) {
				str=((Professor)m).toString();
			} else if(m.getType()  ==3) {
				str=((Employee)m).toString();
			} else {
				System.out.println("�Է¿���");
			}
			System.out.println(str);
		break;
		case 3:
			System.out.println("�˻��� id�Է� : ");
			id=sc.next();
			System.out.println("��ȭ��ȣ �Է� :");
			tel=sc.next();
			System.out.println("�ּ� �Է� :");
			addr=sc.next();
			
			m= service.getMember(id);
			type = m.getType();
			
			System.out.println("����"+tag[type]+"�� �Է��ϼ���. \n");
			etc=sc.next();
			if(type ==1) {
				service.editMember(new Student(id,"",tel,addr,type,etc));
			} else if(type ==2) {
				service.editMember(new Professor(id,"",tel,addr,type,etc));
			} else if(type ==3) {
				service.editMember(new Employee(id,"",tel,addr,type,etc));
			} else {
				System.out.println("�Է¿���");
			}

			break;
		case 4:
			System.out.println("�˻��� id�Է� : ");
			id=sc.next();
			service.delMember(id);
			break;
		case 5:
			System.out.println("�׷켱�� \n 1. �л� 2. ���� 3.������:");
			type=sc.nextInt();
			System.out.println(service.getMembers(type));
			break;
			
		case 6:
			flag=false;
			break;
		}
	}
	
	
	
	
	
	
}}
