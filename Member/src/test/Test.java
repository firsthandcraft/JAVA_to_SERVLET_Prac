package test;

import java.util.Scanner;

import service.SchoolService;
import vo.MemberVO;

public class Test {
public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	String id = null,name=null,tel=null,addr=null;
	boolean flag=true;
	int i =0;
	
	SchoolService service = new SchoolService();//ctrl +shift +o 임포트하기
	
	while(flag) {
		System.out.println("1.등록 2.검색 3.전체출력 4.종료 ");
		i=sc.nextInt();
		switch(i) {
		case 1 :
			System.out.println("아이디 입력 :");
			id=sc.next();
			System.out.println("이름 입력 :");
			name=sc.next();
			System.out.println("전화번호 입력 :");
			tel=sc.next();
			System.out.println("주소 입력 :");
			addr=sc.next();
			
			service.addPerson(new MemberVO(id, name, tel, addr));
			break;
		case 2 :
			 System.out.println("전화번호: ");
             tel=sc.next();
             MemberVO m =service.findPerson(tel);
             System.out.println(m);

			break;
		case 3 :
			  if(id==null || name==null || tel==null || addr==null) {
                  System.out.println("등록을 작성해주세요");
          
              }else {
            	  service.printAll();
              }

			break;
		case 4 :
	         flag=false;
             System.out.println("종료");
          break;
          
         default:
             System.out.println("1~4까지 숫자를 입력하세요");
		}
		
		
	}
}
}
