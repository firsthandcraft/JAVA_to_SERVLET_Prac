package test;



import java.util.Scanner;

import service.teacherMS;
import vo.TwoMembervo;

public class teacherTestMemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name,id,tel,add;

		boolean flag = true;
		int i=0;
		teacherMS service = new teacherMS();
		while(flag) {
			System.out.println("1.등록 2.검색 3.수정 4.삭제 5.전체출력 6.종료");
			i=sc.nextInt();
			switch(i) {
			case 1:
				//등록
				TwoMembervo m2=  new TwoMembervo(id,name, tel, add);

	            service.addMemberVO(m2);
				break;
			case 2:
				//검색
				System.out.println("아이디 입력 :");
				id=sc.next();
				
				service.findMemberVO(id);
				break;
			case 3:
				//수정
				
				break;
			case 4:
				//삭제
				break;
			case 5:
				//전출
				service.printAll();
				break;
			case 6:
				System.out.println("종료");
				 flag=false;
				break;
			default:
				System.out.println("다시 1-6만입력");
		}
			
		}
	}}
