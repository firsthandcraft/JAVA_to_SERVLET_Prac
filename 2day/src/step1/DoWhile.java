package step1;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dowhile ��
		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputString;
		
		do {//���๮
			System.out.println(">");
			inputString=scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q"));{//���ǽ�
			System.out.println("����");
		}
		
		
	}

}
