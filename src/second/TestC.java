package second;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ΰ��� ���ڸ� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		int j=sc.nextInt();
		
		int max, min;//�ִ밪, �ּҰ��� ������ ���� ����

		// Ű����κ��� 2���� ���ڸ� �Է¹޾Ƽ� �ִ밪�� �ּҰ��� ���	
		if(i>j) {
			max = i;
			min = j;
			System.out.println("�ִ밪 : "+i);
			System.out.println("�ּҰ� : "+j );

		} else  if(i==j){
			System.out.println("�Ȱ���");
		} else {
			max = j;
			min = i;
			System.out.println("�ִ밪 : "+j );
			System.out.println("�ּҰ� : "+i );

		}
		
	
	}

}
