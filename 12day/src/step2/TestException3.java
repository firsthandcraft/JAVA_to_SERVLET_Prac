package step2;

public class TestException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"ũ����Ż","������","Ȳ����"};
	
		try {
		System.out.println(names[1]);//
		System.out.println(names[2]);
		
		String s =null;
		System.out.println(s.length());
		} catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("�ε��� ���� �ʰ�");
			
		} catch(Exception e) {
			e.printStackTrace();//Exception �޼����� �߻���θ� ���
		}
		System.out.println("������");
}}
