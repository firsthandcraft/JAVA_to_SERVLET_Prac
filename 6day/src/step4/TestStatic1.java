package step4;

class Company{//�� Ŭ������ �ϳ��� ���� . static�� ������ ���� . 
	//������ ���̽� ���� ���� ����. 
	
	
	static int i=1;
	static int v=1;
	
	//�żҵ� �����
	static void test() {
		//static�� new�� �Ȼ���ϰ� �ٷ� ������ ������
		System.out.println("static test");
	}
}


public class TestStatic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company.test();//static test
		System.out.println(Company.i);
		
		
	}

}
