package second;

import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int i;
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		
		//Ű����� ���ڸ� �Է� �޾Ƽ� Ȧ������ ¦������
		/*if(i % 2 == 0 && i != 0) {
			System.out.println("¦��");
		} else  if(i==0){
			System.out.println("0");
		} else {
			System.out.println("Ȧ��");
		}*/
		
		if(i % 2 == 1) {
			System.out.println("Ȧ��");
		}  else {
			System.out.println("¦��");
		}
	}

}
