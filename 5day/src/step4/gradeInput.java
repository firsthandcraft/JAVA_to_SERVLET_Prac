package step4;

import java.util.Scanner;

public class gradeInput {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int hap;
	float avg;

	void input(Scanner sc) {//Scanner sc는 매개변수 입력기능
		System.out.println("이름");
		name =sc.next();
		System.out.println("국어");
		kor=sc.nextInt();
		System.out.println("영어");
		eng=sc.nextInt();
		System.out.println("수학");
		math=sc.nextInt();
	}
	void tot() {//출력이라 매개 변수가 필요없다. 
		total=kor+eng+math;
	}
	void avg() {
		avg = (float)total/3;

	}
	void print() {//자료형이 없다.  출력기능
		System.out.println(name+":"+kor+eng+math);
		System.out.println(total);
		System.out.println(avg);

	}

}
