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
		System.out.println("1.등록 2.검색 3.수정 4.삭제 5.전체출력 6.종료");
		i= sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("아이디 입력: ");
			id=sc.next();
			System.out.println("이름 입력: ");
			name=sc.next();
			System.out.println("번호 입력: ");
			tel=sc.next();
			System.out.println("주소 입력: ");
			address=sc.next();
			
			service.addMemberVO(new MemberVO(id,name,tel,address));
			break;
		case 2:
			System.out.println("아이디 입력: ");
			id=sc.next();
			MemberVO m =service.findMemberVO(id);
			System.out.println(m);
			break;

		case 3:
			System.out.println("수정할 아이디 입력: ");
			id=sc.next();
			System.out.println("수정할 이름 입력: ");
			name=sc.next();
			System.out.println("수정할 번호 입력: ");
			tel=sc.next();
			System.out.println("수정할 주소 입력: ");
			address=sc.next();
			
			MemberVO m2= new MemberVO(id,name,tel,address);
			service.updateMemberVO(m2);
			
			break;
		case 4:
			System.out.println("삭제아이디 입력");
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
			System.out.println("1-6의 숫자만 입력바랍니다.");
		}
	}
}}
