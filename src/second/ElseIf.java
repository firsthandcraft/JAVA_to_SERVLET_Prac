package second;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//else if 문
		int jumsu;
		
		//키보드를 console에 입력하게 하는 함수
		Scanner sc = new Scanner(System.in);
		//ctrl + shift + O
		
		System.out.println("점수를 입력하세요 : ");
		
		//정수를 자료형으로 키보드를 누른 값을 받아오는 것
		jumsu=sc.nextInt();
		
		//ABCD...
		if(jumsu>=90) {
			System.out.println("A");
		} else if(jumsu>=80) {
			System.out.println("B");
		} else if(jumsu>=70) {
			System.out.println("C");
		} else if(jumsu>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		//키보드로 숫자를 입력 받아서 음수인지 양수인지 
		
		//키보드로 숫자를 입력 받아서 짝수인지 홀수인지 
		
		// 키보드로부터 2개의 숫자를 입력받아서 최대값과 최소값을 출력
		
		
		int score = 85;
		char grade = (score >90) ? 'A' : ((score >80) ? 'B' :'C');
		System.out.println(score+grade);
	}

}
