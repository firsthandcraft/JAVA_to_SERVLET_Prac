package step5;

import java.util.Scanner;

public class gradeInputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		gradeInput[]r=new gradeInput[3];
		
		//클래스와 다른 변수 만들려하는데 아무리 생각해도이름, 과목을 다르게 이름방법을 모르겠다.
		String name;
		int kor,eng,math,total=0,hap;
		int i=0;
		float ave;
		
		for(i=0;i<r.length;i++) {
	        System.out.println("이름 국어, 영어, 수학 점수 입력 : ");
	        r[i]=new gradeInput();
	        r[i].name=sc.next();
	        r[i].kor=sc.nextInt();
	        r[i].eng=sc.nextInt();
	        r[i].math=sc.nextInt();
	        r[i].total=r[i].kor+r[i].eng+r[i].math;
	        r[i].avg=(float)r[i].total/3;
		}
		for(i=0;i<r.length;i++) {
	        System.out.print("이름: "+r[i].name);
	        System.out.print("국어 : "+r[i].kor);
	        System.out.print("영어 : "+r[i].eng);
	        System.out.print("수학 : "+r[i].math);
	        System.out.print("총점 : "+r[i].total);
	        System.out.print("평균 : "+r[i].avg);
			System.out.println("");
		}

	}

}
