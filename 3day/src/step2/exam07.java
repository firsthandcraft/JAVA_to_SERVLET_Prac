package step2;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*키보드로부터 숫자를 입력 받아 누적합계를 구하고 
		 * 누적 합계값이 100보다 커지면, 합계출력 후 프로그램 종료*/
		Scanner sc = new Scanner(System.in);
		int num = 1,sum=0;
		while (sum <100) {
			System.out.println("숫자를 입력해주세요 : ");
			num = sc.nextInt();
			
			for(int i =1; i<=num;i++) {
				sum+=i;
				System.out.println(i+"\t"+sum+"\n");
				if(sum>100) break;
			}
//			if(sum>101) {
//				System.out.println("종료합니다.");
//				break;
//			} 
//		
			
		}
		sc.close();
	}

}
