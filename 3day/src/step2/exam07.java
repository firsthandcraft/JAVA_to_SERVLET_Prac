package step2;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ű����κ��� ���ڸ� �Է� �޾� �����հ踦 ���ϰ� 
		 * ���� �հ谪�� 100���� Ŀ����, �հ���� �� ���α׷� ����*/
		Scanner sc = new Scanner(System.in);
		int num = 1,sum=0;
		while (sum <100) {
			System.out.println("���ڸ� �Է����ּ��� : ");
			num = sc.nextInt();
			
			for(int i =1; i<=num;i++) {
				sum+=i;
				System.out.println(i+"\t"+sum+"\n");
				if(sum>100) break;
			}
//			if(sum>101) {
//				System.out.println("�����մϴ�.");
//				break;
//			} 
//		
			
		}
		sc.close();
	}

}
