package second;

import java.util.Scanner;

public class TestE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("점수를 입력하세요 : ");
		int score=sc.nextInt();
		
		//ABCD...
		if(score>=90 && score<=100) {
			System.out.println("A");
		} else if(score>=80 && score<=89) {
			System.out.println("B");
		} else if(score>=70 && score<=79) {
			System.out.println("C");
		} else if(score>=60 && score <=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
	}

}
