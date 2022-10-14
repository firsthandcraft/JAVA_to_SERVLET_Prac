package step8;

class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}

class Service{
	//Exception �߻��Ǹ� ȣ���� ������ ������.:throws
	public void test(int age) throws MyException {
		if(age <=0) {
			throw new MyException("���̴� 1�� �̻��̾���ٴϴ�.");
		}
		System.out.println(age+"��");
	}
}

public class TestThrow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Service service = new Service();
	try {
//		service.test(0);//���̴� 1�� �̻��̾���ٴϴ�.
		service.test(13);//13��
	} catch (MyException e) {
		System.out.println(e.getMessage());
	}

}}
