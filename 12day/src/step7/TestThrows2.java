package step7;

class Service{
	public void test(String name) {
		//Exception�߻��� �ڵ� throws
		System.out.println("�̸���"+name.length()+"�ڷ� ����");
	}
}

public class TestThrows2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service s = new Service();
		
		try {
			s.test(null);
		} catch(NullPointerException ne) {//������ Exception�޼���
			System.out.println(ne.getMessage());//Exception�߻���� �פ� �޼����� �����ش�.
		}
		System.out.println("�������");
	}}
