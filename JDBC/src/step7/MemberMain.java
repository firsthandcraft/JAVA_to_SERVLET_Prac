package step7;

import java.util.Scanner;


public class MemberMain {
public static void main(String[] args) {
	Member m= new Member();
	Scanner sc = new Scanner(System.in);
	boolean flag= true;
	int i = 0;
	while(flag) {
		System.out.println("1.생상  2.출력  3.검색  4.업데이트  5.삭제  6. 종료");
		i = sc.nextInt();
		switch(i) {
		case 1: 
			m.MemberInsert();
			break;
		case 2:
			m.MemberPrint();
			break;
		case 3:
			System.out.println("검색할 이름 입력 : ");
			String j = sc.next();
			m.Search(j);
			
			break;
		case 4:
			m.update();
			break;
		case 5:
			m.delete();
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
