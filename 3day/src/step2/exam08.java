package step2;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ű����κ��� ���ڸ� �Է� �޾� �����հ踦 ���ϰ� 
		 * -999������ ���α׷� ����*/
		Scanner sc = new Scanner(System.in);
		int num = 1,sum=0;
		while (num != -999) {
			System.out.println("���ڸ� �Է����ּ��� : ");
			num = sc.nextInt();
			
			for(int i =1; i<=num;i++) {
				sum+=i;
				System.out.println(i+"\t"+sum+"\n");
			}

			
		}
		sc.close();
	}

}
