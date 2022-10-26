package test;

import java.util.Scanner;

import service.BookService;
import vo.BookVO;


public class TestBookService {
public static void main(String[] args) {

	BookService service = new BookService();
	Scanner sc = new Scanner(System.in);
	boolean flag= true;
	int price;	
	String id,title,author,publisher;
	int i = 0;
	
	
	while(flag) {
		System.out.println("1.생상  2.출력  3.수정  4.삭제 5.전체출력 6. 종료");
		i = sc.nextInt();
		switch(i) {
		case 1: 
			System.out.println("아이디 입력 : ");
			id= sc.next();
			System.out.println("책이름 입력 : ");
			title= sc.next();
			System.out.println("저자 입력 : ");
			author= sc.next();
			System.out.println("출판사 입력 : ");
			publisher= sc.next();
			System.out.println("가격 입력 : ");
			price= sc.nextInt();
			service.insert(new BookVO(id,title,author,publisher,price));
			break;
		case 2:
			System.out.println("아이디 입력");
			id=sc.next();
			BookVO m = service.findbook(id);;
			System.out.println(m);
			break;
		case 3://순서 
			System.out.println("수정 아이디 입력 : ");
			id= sc.next();
			System.out.println("수정 책이름 입력 : ");
			title= sc.next();
			System.out.println("수정 저자 입력 : ");
			author= sc.next();
			System.out.println("수정 출판사 입력 : ");
			publisher= sc.next();
			System.out.println("수정 가격 입력 : ");
			price= sc.nextInt();
			BookVO m2= new BookVO(id,title,author,publisher,price);
			service.updatebook(m2);
			break;
		case 4:
			System.out.println("삭제 아이디 입력 : ");
			id = sc.next();
			service.bookdelete(id);
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
