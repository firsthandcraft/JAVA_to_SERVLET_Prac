import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*과제 
		 * 1번 키보드로터 1개의 정수를 입력받아서 
		 * 그수가 양수이면 "1보다 큽니다. "라고 출력하고 
		 * 음수이면 "0보다 작습니다. "를 출력하고 
		 * 그 수가 0이면 "0이군요"라고 출력하는 프로그램
		 * */
		System.out.println("숫자를 입력하세요");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0) {
				System.out.println("0보다 큽니다.");
		} else  {
			if(num == 0) {
			System.out.println("0이군요");
			} else {
			System.out.println("0보다 작습니다.");
			}//else
		}//else

		sc.close();
	}

}
