package step8;

interface A{
	public void a();
}
interface B extends A{
	public void b();
	//�������̽� ���� ��� ����
}
class C implements B{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("b");
	}
}

interface D{
	public void d();
}
class E implements B,D{
	//�������� �������̽��� implements �����ϰ� 
	//�̰�� ��� �߻� �ż��带 �� �����ؾ��Ѵ�.
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
}
class F extends E{
	
}

public class TestInterface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c =new C();
		A a =c;
		
		a.a();//a   AŸ�Ա����� �ν� ����
		B b =c; 
		b.b();//b   A�� B Ÿ�� ��� �ν� ����
		
		A af= new F();
		B bf= new F();
		D df= new F();
		//Ư�� �������̽��� implements �� Ŭ������
		//��ӹ��� F�� �θ� E�� ������ Ÿ������ 
		//��� �� ó�� �����ϴ�.��
		
		
		
	}}
