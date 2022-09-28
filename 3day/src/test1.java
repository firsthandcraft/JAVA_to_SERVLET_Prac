
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 키보드로 부터 평균점수를 입력받아서 
		 *점수 91~100 이면 "수"
		 *점수 81~90 이면 "우"
		 *점수 71~80 이면 "미"
		 *점수 61~70 이면 "양"
		 *점수 60 이하    "가"
		 * */
		System.out.println("숫자를 입력하세요");

		Scanner sc = new Scanner(System.in);
		int input_no = sc.nextInt(); 
		
		if(input_no >90 && input_no<101) {
			System.out.println("수");
		} else {
			if(input_no>80 && input_no <91) {
				System.out.println("우");
			} else if{
		
			}
		}		
		

		sc.close();
		
	}

}

