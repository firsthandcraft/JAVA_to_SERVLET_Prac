import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���� 
		 * 1�� Ű������� 1���� ������ �Է¹޾Ƽ� 
		 * �׼��� ����̸� "1���� Ů�ϴ�. "��� ����ϰ� 
		 * �����̸� "0���� �۽��ϴ�. "�� ����ϰ� 
		 * �� ���� 0�̸� "0�̱���"��� ����ϴ� ���α׷�
		 * */
		System.out.println("���ڸ� �Է��ϼ���");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0) {
				System.out.println("0���� Ů�ϴ�.");
		} else  {
			if(num == 0) {
			System.out.println("0�̱���");
			} else {
			System.out.println("0���� �۽��ϴ�.");
			}//else
		}//else

		sc.close();
	}

}
