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
		System.out.println("1.����  2.���  3.����  4.���� 5.��ü��� 6. ����");
		i = sc.nextInt();
		switch(i) {
		case 1: 
			System.out.println("���̵� �Է� : ");
			id= sc.next();
			System.out.println("å�̸� �Է� : ");
			title= sc.next();
			System.out.println("���� �Է� : ");
			author= sc.next();
			System.out.println("���ǻ� �Է� : ");
			publisher= sc.next();
			System.out.println("���� �Է� : ");
			price= sc.nextInt();
			service.insert(new BookVO(id,title,author,publisher,price));
			break;
		case 2:
			System.out.println("���̵� �Է�");
			id=sc.next();
			BookVO m = service.findbook(id);;
			System.out.println(m);
			break;
		case 3://���� 
			System.out.println("���� ���̵� �Է� : ");
			id= sc.next();
			System.out.println("���� å�̸� �Է� : ");
			title= sc.next();
			System.out.println("���� ���� �Է� : ");
			author= sc.next();
			System.out.println("���� ���ǻ� �Է� : ");
			publisher= sc.next();
			System.out.println("���� ���� �Է� : ");
			price= sc.nextInt();
			BookVO m2= new BookVO(id,title,author,publisher,price);
			service.updatebook(m2);
			break;
		case 4:
			System.out.println("���� ���̵� �Է� : ");
			id = sc.next();
			service.bookdelete(id);
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
