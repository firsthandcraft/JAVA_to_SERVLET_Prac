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
//가로안의 숫자는 문자의 갯수
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
//		System.out.println("1. 회원가입 2. 내 정보 수정 3. 로그인  4. 로그아웃 5. 탈퇴 6.종료");
		System.out.println("1. 등록 2. 검색 3. 수정  4. 삭제 5. 전출력 6.종료");
		j= sc.nextInt();
		
		switch(j) {
		case 1:
			System.out.println("그룹선택 \n 1. 학생 2. 교수 3.교직원:");
			type=sc.nextInt();
			System.out.println("아이디입력 :");
			id=sc.next();
			System.out.println("이름 입력 :");
			name=sc.next();
			System.out.println("전화번호 입력 :");
			tel=sc.next();
			System.out.println("주소 입력 :");
			addr=sc.next();
			System.out.println(tag[type]+"을 입력하세요. \n");
			etc=sc.next();
				if(type ==1) {
					service.addMember(new Student(id, name,tel,addr,type,etc));
				} else if(type ==2) {
					service.addMember(new Professor(id, name,tel,addr,type,etc));
				} else if(type ==3) {
					service.addMember(new Employee(id, name,tel,addr,type,etc));
				} else {
					System.out.println("입력오류");
				}
			break;
		case 2:
			System.out.println("검색아이디 입력");
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
				System.out.println("입력오류");
			}
			System.out.println(str);
		break;
		case 3:
			System.out.println("검색할 id입력 : ");
			id=sc.next();
			System.out.println("전화번호 입력 :");
			tel=sc.next();
			System.out.println("주소 입력 :");
			addr=sc.next();
			
			m= service.getMember(id);
			type = m.getType();
			
			System.out.println("수정"+tag[type]+"을 입력하세요. \n");
			etc=sc.next();
			if(type ==1) {
				service.editMember(new Student(id,"",tel,addr,type,etc));
			} else if(type ==2) {
				service.editMember(new Professor(id,"",tel,addr,type,etc));
			} else if(type ==3) {
				service.editMember(new Employee(id,"",tel,addr,type,etc));
			} else {
				System.out.println("입력오류");
			}

			break;
		case 4:
			System.out.println("검색할 id입력 : ");
			id=sc.next();
			service.delMember(id);
			break;
		case 5:
			System.out.println("그룹선택 \n 1. 학생 2. 교수 3.교직원:");
			type=sc.nextInt();
			System.out.println(service.getMembers(type));
			break;
			
		case 6:
			flag=false;
			break;
		}
	}
	
	
	
	
	
	
}}
