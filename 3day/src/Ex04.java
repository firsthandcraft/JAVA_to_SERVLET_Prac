import java.util.Scanner;

public class Ex04 {

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
		
/*		if(input_no >90) {
			System.out.println("수");
		} else {
			if(input_no>80) {
				System.out.println("우");
			} else{
				if(input_no>80) {
					System.out.println("미");
				} else{
					if(input_no>70) {
						System.out.println("양");
					} else{
						if(input_no>60) {
							System.out.println("가");
						}
					}
				}
			}
		}		
*/
		System.out.println("------------------");

		if(input_no >90 && input_no<101) {
			System.out.println("수");
		} else if(input_no>80 && input_no <91) {
			System.out.println("우");
		} else if(input_no>70 && input_no <81){
			System.out.println("미");
		} else if(input_no>60 && input_no <71){
			System.out.println("양");
		} else if(input_no>50 && input_no <61){
			System.out.println("가");
		}

		sc.close();
	}

}
