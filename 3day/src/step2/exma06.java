package step2;

import java.util.Scanner;

public class exma06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է°��� �ְ� ������ ���ϱ� 
		Scanner sc = new Scanner(System.in);
		int num = 1,sum=0;

		while (num != 0) {
			System.out.println("���ڸ� �Է����ּ��� : ");
			num = sc.nextInt();
			if(num==0) {
				System.out.println("�����մϴ�.");
				break;
			} 
			for(int i =1; i<=num;i++) {
				sum+=i;
				System.out.println(i+"\t"+sum+"\n");
			
			}
		}

		sc.close();
		/*
		boolean flag = true; 
		
		switch (num){
			
			case != 0:
				
				
			case 0:
				flag = false;
				break;
			
				
			
		}
		*/
		
		
		
	}

}
