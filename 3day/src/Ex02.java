import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���� 
		 * Ű������� 2���� ������ �Է¹޾Ƽ� 
		�������� ū ���� ����ϴ� ���α׷�
		
		+ ����� ������ 
		 * */
		System.out.println("���ڸ� �Է��ϼ���");

		Scanner sc = new Scanner(System.in);
		int input_no = sc.nextInt();
		int input_no2 = sc.nextInt();
		
		
		if( input_no  > 0 &&  input_no2 > 0) {
			if( input_no  >  input_no2) {
				System.out.println( input_no+"��"+ input_no2+"���� Ů�ϴ�.");
			} else {
				if(input_no == input_no2) {
				System.out.println( "����");
				} else {
				System.out.println( input_no+"(��)��"+ input_no2+"���� �۽��ϴ�.");			
				}
			}		
		} else {
			
				System.out.println("�� ���� ����� �Է��ϼ���.");
			
		}//else

		sc.close();
	}

}
