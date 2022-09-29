package step2;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*키보드로부터 숫자를 입력 받아 누적합계를 구하고 
		 * -999누르면 프로그램 종료*/
		Scanner sc = new Scanner(System.in);
		int num = 1,sum=0;
		while (num != -999) {
			System.out.println("숫자를 입력해주세요 : ");
			num = sc.nextInt();
			
			for(int i =1; i<=num;i++) {
				sum+=i;
				System.out.println(i+"\t"+sum+"\n");
			}

			
		}
		sc.close();
	}

}
