package test;

import java.util.ArrayList;
import java.util.Scanner;

import service.ServiceImpl;
import vo.Member;

public class addrDBMain {
public static void main(String[] args) {
	
	ServiceImpl service = new ServiceImpl();
	boolean flag= true, flag2=false;
	int menu,i;
	String name=null, tel=null,address=null;
	
	ArrayList<Member>list=null;
	Scanner sc= new Scanner(System.in);

	while(flag) {
		System.out.println("1.추가  2.전체검색  3.검색  4.종료  5.수정  6.삭제");
		menu= sc.nextInt();
		
		switch(menu) { 
		case 1:
			System.out.println("이름 :");
			name=sc.next();
			System.out.println("전화 :");
			tel=sc.next();
			sc.nextLine();
			System.out.println("주소 :");
			address=sc.next();
			
			Member m = new Member(name, tel, address);
			service.addMember(m);
			break;
		case 2:
			list= service.getMembers();
			for (i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		break;
		case 3:
			System.out.println("검색할 이름입력 : ");
			name=sc.next();
			Member m2= service.getMember(name);
			if(m2 == null) {
				System.out.println("없다.");
			} else {
				System.out.println(m2);
			}
			break;
		case 4:
			flag=false;
			break;
		case 5://수정
			System.out.println("수정 이름 :");
			name=sc.next();
			System.out.println("수정 전화 :");
			tel=sc.next();
			sc.nextLine();
			System.out.println("수정 주소 :");
			address=sc.next();
			Member m3 = new Member(name, tel, address);
			flag2 = service.editMember(m3);
			if(flag) {
				 System.out.println("정상처리");
			} else {
				System.out.println("비정상");
			}
			break;
			
		case 6:
			System.out.println("삭제 이름 :");
			name=sc.next();
			service.delMember(name);
			break;
		}
	}
	
}}

