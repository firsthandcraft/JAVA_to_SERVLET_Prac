package step3;

public class TestVariableScope1 {
	int i;//���������� �⺻������ 0���� �ȴ�.
	void test1() {
		System.out.println(i);
	}
	void test2() {
		int i = 1;
		System.out.println("test2�������� :"+i);
		System.out.println(this.i);//this �׻� ���������� �ִ°�
		
	}
	//�ŰԺ��� �����  // call by reference ���� ���������� ���°��� �ƴ� �����ؼ� ���� ��. ��������
	void test3(int i) {
		System.out.println("test3�������� : "+i);
		this.i =i;
		System.out.println(this.i);//this �׻� ���������� �ִ°� //2
	}
	
	void test4() {
		int j =3;
	}

	
	void test5() {
		this.i =i;
		System.out.println("test5:"+i);	
		//System.out.println(j);	
	}
	
	void test6() {
		//���������� �ʱ�ȭ ���� x ����0
		int k=0;
		String s= null;
		System.out.println(k);
		System.out.println(s);
	}
}
