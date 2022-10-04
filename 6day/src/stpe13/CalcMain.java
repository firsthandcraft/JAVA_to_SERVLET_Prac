package stpe13;

import java.util.Scanner;

public class CalcMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	 
	System.out.println("첫 숫자를 입력하세요.");
	int a = sc.nextInt();
	System.out.println("두번째 숫자를 입력하세요.");
	int b = sc.nextInt();
	System.out.println("부호를 입력하세요 : ");
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
