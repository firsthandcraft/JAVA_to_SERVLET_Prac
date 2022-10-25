package step6;

import java.util.Scanner;

public class ProductMain {
public static void main(String[] args) {
	//
	Product p= new Product();
	Scanner sc = new Scanner(System.in);
	boolean flag= true;
	int i = 0;
	while(flag) {
		System.out.println("1.제품 생상  2.재품 출력  3.제품 검색  4.주문  5.주문 내역  6. 종료");
		i = sc.nextInt();
		switch(i) {
		case 1: 
			p.ProductInsert();
			break;
		case 2:
			p.ProductPrint();
			break;
		case 3:
			System.out.println("검색할 제품 입력 : ");
			int j = sc.nextInt();
			p.Productsearch(j);
			break;
		case 4:
			p.order();
			break;
		case 5:
			p.print_ord();
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
