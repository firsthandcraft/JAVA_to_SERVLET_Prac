package step1;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*과제 
		 * 키보드로터 2개의 정수를 입력받아서 
		두정수중 큰 수를 출력하는 프로그램
		
		+ 양수만 만들어보기 
		 * */
		System.out.println("숫자를 입력하세요");

		Scanner sc = new Scanner(System.in);
		int input_no = sc.nextInt();
		int input_no2 = sc.nextInt();
		
		
		if( input_no  > 0 &&  input_no2 > 0) {
			if( input_no  >  input_no2) {
				System.out.println( input_no+"가"+ input_no2+"보다 큽니다.");
			} else {
				if(input_no == input_no2) {
				System.out.println( "같다");
				} else {
				System.out.println( input_no+"(이)가"+ input_no2+"보다 작습니다.");			
				}
			}		
		} else {
			
				System.out.println("두 개의 양수를 입력하세요.");
			
		}//else

		sc.close();
	}

}
