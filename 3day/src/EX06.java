import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*������ ���ڸ� �Է¹޾� 
		 * ������ ������ ���� �������� ����ϴ� ���α׷�
		 */
		System.out.println("ù ���ڸ� �Է��ϼ���");
		
		Scanner sc = new Scanner(System.in);
		int input_no1 = sc.nextInt();
		System.out.println("�ι��� ���ڸ� �Է��ϼ���");
		int input_no2 = sc.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ���");
		int input_no3 = sc.nextInt();


		//input_no1 ���� Ŭ��
//		if( input_no1 < input_no2 && input_no1 < input_no3) {
//			System.out.println("������ :"+input_no1);
//		} else if(input_no1 == input_no2 && input_no2 == input_no3) {
//			System.out.println("����");
//		}	else {		
//				if(input_no2 <input_no3) {	
//					System.out.println("������ :"+input_no2);
//				} else {	
//					System.out.println("������ :"+input_no3);
//				}
//		}
		
		System.out.println("------------------");
		/*
		if( input_no1 < input_no2 && input_no1 < input_no3) {
			if(input_no2 < input_no3) {
				System.out.println("������ :"+input_no1);
				System.out.println("�߰��� :"+input_no2);
				System.out.println("ū�� :"+input_no3);
			} else{
				System.out.println("������ :"+input_no1);
				System.out.println("�߰��� :"+input_no3);
				System.out.println("ū�� :"+input_no2);
			}	
			
		} else if(input_no1 < input_no2 || input_no1 < input_no3) {
			if(input_no2 < input_no1 && input_no2 < input_no3) {
				System.out.println("������ :"+input_no2);
				System.out.println("�߰��� :"+input_no1);
				System.out.println("ū�� :"+input_no3);
			} else if(input_no3 < input_no1 && input_no3 < input_no2){
				System.out.println("������ :"+input_no3);
				System.out.println("�߰��� :"+input_no1);
				System.out.println("ū�� :"+input_no2);
			}	

		} else{//1�� ���� Ŭ��		
				if(input_no2 <input_no3) {
					System.out.println("������ :"+input_no2);
					System.out.println("�߰��� :"+input_no3);
					System.out.println("ū�� :"+input_no1);
				} else {
					System.out.println("������ :"+input_no3);
					System.out.println("�߰��� :"+input_no2);
					System.out.println("ū�� :"+input_no1);
				}

		}
		System.out.println("------------------");
		*/
		if(input_no1 < input_no2) {
			if(input_no2 < input_no3) {
				System.out.println("�߰��� :"+input_no2);
			} else {
				if(input_no1 < input_no3) {
					System.out.println("�߰��� :"+input_no3);
				}else {
					System.out.println("�߰��� :"+input_no1);
				}
			}
		} else {
			if(input_no2 < input_no3) {
				System.out.println("�߰��� :"+input_no3);
			}else {
				System.out.println("�߰��� :"+input_no2);
			}	
		}
		
		sc.close();
		
	}

}
