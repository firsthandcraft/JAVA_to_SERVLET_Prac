package step6;

import java.util.Scanner;

//성적처리 만들기
public class ScoreBoard {
	int i;
	void input(Scanner sc) {//Scanner sc는 매개변수 입력기능
		System.out.println("점수를 입력하세요 : ");
		i =sc.nextInt();
	}
	public void prinrScore() {
		//지역변수 
		String str = null;
		if(i>=90 && i<=100) {
		    str ="A";
		} else if(i>=80 && i<=89) {
			str ="B";
		} else if(i>=70 && i<=79) {
			str ="C";
		} else if(i>=60 && i <=69) {
			str ="D";
		} else {
			str ="F";
		}
	    System.out.println(str);

	}
	//전역변수
	
}
