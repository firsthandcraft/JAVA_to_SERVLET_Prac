package step3;

import java.util.Scanner;

public class product {
		String name;
		int Co;
		int price;
		
		void input(Scanner sc) {//Scanner sc�� �Ű����� �Է±��
			System.out.println("���� �Է�");
			name =sc.next();
			System.out.println("�����Է�");
			Co=sc.nextInt();
			System.out.println("�����Է�");
			price =sc.nextInt();
		}
		
		void print() {//�ڷ����� ����.  ��±��
			System.out.println(name);
			System.out.println(Co);
			System.out.println(price);
			
			
	}
}
