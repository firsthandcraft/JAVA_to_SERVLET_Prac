package step1;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ű����� ���� ��������� �Է¹޾Ƽ� 
		 *���� 91~100 �̸� "��"
		 *���� 81~90 �̸� "��"
		 *���� 71~80 �̸� "��"
		 *���� 61~70 �̸� "��"
		 *���� 60 ����    "��"
		 * */
		System.out.println("���ڸ� �Է��ϼ���");

		Scanner sc = new Scanner(System.in);
		int input_no = sc.nextInt(); 
		
/*		if(input_no >90) {
			System.out.println("��");
		} else {
			if(input_no>80) {
				System.out.println("��");
			} else{
				if(input_no>80) {
					System.out.println("��");
				} else{
					if(input_no>70) {
						System.out.println("��");
					} else{
						if(input_no>60) {
							System.out.println("��");
						}
					}
				}
			}
		}		
*/
		System.out.println("------------------");

		if(input_no >90 && input_no<101) {
			System.out.println("��");
		} else if(input_no>80 && input_no <91) {
			System.out.println("��");
		} else if(input_no>70 && input_no <81){
			System.out.println("��");
		} else if(input_no>60 && input_no <71){
			System.out.println("��");
		} else if(input_no>50 && input_no <61){
			System.out.println("��");
		}

		sc.close();
	}

}
