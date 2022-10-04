package step7;

import java.util.Scanner;

public class MonthService {
/*해당월의 마지막 일을 출력하는 메서드 연습
 * 46911 -30일
 * 2- 28일
 * 135781012 - 31일
 * 그외 잘못된 입력값
 * */
     int i ;
     void input(Scanner sc) {
    	 System.out.println("1~12월중 하나를 숫자로 입력하세요");
    	 i = sc.nextInt();
     }
	void printIfDay() {
		if(i==4 || i==6 || i==9 || i==11) {
            System.out.println(i+"월은 30일까지 있습니다.");

		} else if(i==2) {
            System.out.println(i+"월은 28일까지 있습니다.");

		} else {
            System.out.println(i+"월은 31일까지 있습니다.");

		}
	}
	
	
	void printSwitchDay() {
        switch(i) {
        case 1: case 3: case 5: case 7: case 10: case 12:
            System.out.println(i+"월은 31일까지 있습니다.");
            break;
        case 2:
            System.out.println(i+"월은 28일까지 있습니다.");
            break;
        case 4: case 6: case 9: case 11:
            System.out.println(i+"월은 30일까지 있습니다.");
            break;  
        default:
            System.out.println("잘못입력하였습니다.");
        }
	}
	
	
}
