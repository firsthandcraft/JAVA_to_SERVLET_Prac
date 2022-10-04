package step3;

import java.util.Scanner;

public class product {
		String name;
		int Co;
		int price;
		
		void input(Scanner sc) {//Scanner sc는 매개변수 입력기능
			System.out.println("문자 입력");
			name =sc.next();
			System.out.println("숫자입력");
			Co=sc.nextInt();
			System.out.println("숫자입력");
			price =sc.nextInt();
		}
		
		void print() {//자료형이 없다.  출력기능
			System.out.println(name);
			System.out.println(Co);
			System.out.println(price);
			
			
	}
}
