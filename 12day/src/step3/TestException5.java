package step3;

public class TestException5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		try {
		System.out.println(4/i);
		
		} catch(NullPointerException ne) {
			System.out.println("Null�̹Ƿ� ����Ұ�");
		} finally {
			System.out.println("finally");
		}
		System.out.println("�������");
		
}}
