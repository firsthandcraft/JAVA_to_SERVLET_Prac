package step1;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4,6,9,11 -> 30��
		  2 ->28 ��
		  1,3,5,7,9,10,12 -> 31��
		  �׿� �߸��� �Է°�
		 * */
		System.out.println("1~12���� �ϳ��� ���ڷ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if(i == 4 || i == 6 || i == 9 || i == 11) {
			System.out.println(i+"���� 30�ϱ��� �ֽ��ϴ�.");
		}else if(i == 2) {
			System.out.println(i+"���� 28�ϱ��� �ֽ��ϴ�.");
		} else if(i == 1 || i == 3 ||i == 5 || i == 7 || i == 9 ||i == 10|| i == 12) {
			System.out.println(i+"���� 31�ϱ��� �ֽ��ϴ�.");
		} else {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		
		System.out.println("------------------");
		//switch������ �ٲٱ� 
		switch(i) {
			case 1: case 3: case 5: case 7: case 10: case 12:
				System.out.println(i+"���� 31�ϱ��� �ֽ��ϴ�.");
				break;
			case 2:
				System.out.println(i+"���� 28�ϱ��� �ֽ��ϴ�.");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println(i+"���� 30�ϱ��� �ֽ��ϴ�.");
				break;	
			default:
				System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		sc.close();
	}

}
