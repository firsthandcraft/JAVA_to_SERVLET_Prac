package test;

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
			System.out.println("1.등록  2.검색  3.수정  4.삭제 5.전체 출력 6.종료");
			i = sc.nextInt();
			switch(i) {
			case 1: 
				System.out.println("아이디 입력 : ");
				id= sc.next();
				System.out.println("이름 입력 : ");
				name= sc.next();
				System.out.println("전화번호 입력 : ");
				tel= sc.next();
				System.out.println("주소 입력 : ");
				add= sc.next();
				service.insert(new MemberVO(id,name,tel,add));
				break;
			case 2://검색
				System.out.println("아이디 입력 : ");
				id= sc.next();
				MemberVO m= service.select(id);
				System.out.println(m);
				break;
			case 3://수정
				System.out.println("수정 아이디 입력 : ");
				id= sc.next();
				System.out.println("이름 입력 : ");
				name= sc.next();
				System.out.println("전화번호 입력 : ");
				tel= sc.next();
				System.out.println("주소 입력 : ");
				add= sc.next();
				MemberVO m2= service.select(id);
				service.update(m2);
				break;
			case 4://삭제
				System.out.println("삭제 아이디 입력 : ");
				id= sc.next();
				service.delete(id);
				break;
			
			case 5:
				service.printAll();			
				break;
				//주문하면 product 에서 order에서 주문한  수량만큼빠짐
			case 6: flag = false;
				break;
			default:
				System.out.println("1-6숫자만 입력");
			
			
			}
		
		}
		flag=false;

	
	
}}
