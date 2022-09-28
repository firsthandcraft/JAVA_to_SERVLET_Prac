package step1;
import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요");
		/*키보드로부터 1개의 정수를 입력받아서 그수의 절대값을 구하여 출력하는 프로그램*/
		Scanner sc = new Scanner(System.in);
		int input_no = sc.nextInt();

		if( input_no >= 0) {
			System.out.println("입력하신 큰수는"+input_no);
		} else {
			input_no = -(input_no);
			System.out.println("절대값"+input_no);
		}
		sc.close();
	}

}
