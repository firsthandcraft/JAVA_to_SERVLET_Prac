import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է��ϼ���");
		/*Ű����κ��� 1���� ������ �Է¹޾Ƽ� �׼��� ���밪�� ���Ͽ� ����ϴ� ���α׷�*/
		Scanner sc = new Scanner(System.in);
		int input_no = sc.nextInt();

		if( input_no >= 0) {
			System.out.println("�Է��Ͻ� ū����"+input_no);
		} else {
			input_no = -(input_no);
			System.out.println("���밪"+input_no);
		}
		sc.close();
	}

}
