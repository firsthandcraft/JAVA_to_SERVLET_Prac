package step4;
class Test{
	int i; //��������
	static int j;//static ���� 
	
	static void test() {
		System.out.println(j);//0
		//static�� �ڽ��� Ŭ���� ���̶� ��ü �����ؾ���
		//System.out.println();static method �����̹Ƿ�
		//�ν��Ͻ� ���� i�� ���ٺҰ� --> ���� ���� �ʿ�
		//static �� ��ü ������� ��� ó�� �޸𸮿� ��ü
	}
	void test2() {
		System.out.println(j);//0
	}
}


public class Teststatic3 {
public static void main(String[] args) {
	
	Test.test();
	Test t =new Test();
	t.test2();
}
}
