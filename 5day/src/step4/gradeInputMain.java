package step4;

import java.util.Scanner;

import step3.product;

public class gradeInputMain {
	public static void main(String[] args) {
		
		gradeInput[]r=new gradeInput[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� ������ �����Է�");
		int i=0;
		for(i=0; i<r.length;i++) {
			r[i]=new gradeInput();
			
			r[i].input(sc);
			r[i].tot();
			r[i].avg();
			
		}
		for(i=0; i<r.length;i++) {
			r[i].print();
			System.out.println("");

		}
		
		
	

		
	}


}
