package step1;

public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		
		try {//Exception�� �߻��� ������ ����Ǵ� �ڵ� ��
			System.out.println(s.length());//���� ����.
			// ���ڵ���ο��� Exception�� �߻��Ǹ� �ٷ� catch�� 
			//Exception �߻� �ȵǸ� �Ʒ� �ڵ���� ����ȴ�.
			System.out.println("����??????����Ȯ��");//�ȳ���
			//JVM �� ���� Exception�� �޾Ƽ� ������ ������� ó��
			//Exception �� ó��
		}catch(NullPointerException ne) {
			System.out.println("null�̹Ƿ� ���̸� ���Ҽ� ����.");
		}
	
	
	
	}}
