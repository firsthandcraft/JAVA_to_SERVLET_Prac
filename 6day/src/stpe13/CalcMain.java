package stpe13;

import java.util.Scanner;

public class CalcMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	 
	System.out.println("ù ���ڸ� �Է��ϼ���.");
	int a = sc.nextInt();
	System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
	int b = sc.nextInt();
	System.out.println("��ȣ�� �Է��ϼ��� : ");
	String c = sc.next();
	
	Calc cal= new Calc(a , b);
	
	if(c.equals("+")) {
		System.out.println(cal.add());
	} else if(c.equals("-")) {
		System.out.println(cal.sub());
	} else if(c.equals("*")) {
		System.out.println(cal.mul());
	} else if(c.equals("/")) {
		System.out.println(cal.div());
	}
	
	}

}
