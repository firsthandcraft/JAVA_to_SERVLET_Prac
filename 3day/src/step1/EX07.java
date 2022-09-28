package step1;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4,6,9,11 -> 30일
		  2 ->28 일
		  1,3,5,7,9,10,12 -> 31일
		  그외 잘못된 입력값
		 * */
		System.out.println("1~12월중 하나를 숫자로 입력하세요");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if(i == 4 || i == 6 || i == 9 || i == 11) {
			System.out.println(i+"월은 30일까지 있습니다.");
		}else if(i == 2) {
			System.out.println(i+"월은 28일까지 있습니다.");
		} else if(i == 1 || i == 3 ||i == 5 || i == 7 || i == 9 ||i == 10|| i == 12) {
			System.out.println(i+"월은 31일까지 있습니다.");
		} else {
			System.out.println("잘못입력하였습니다.");
		}
		
		System.out.println("------------------");
		//switch문으로 바꾸기 
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
		sc.close();
	}

}
