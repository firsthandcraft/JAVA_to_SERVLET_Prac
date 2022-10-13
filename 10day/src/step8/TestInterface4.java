package step8;

interface A{
	public void a();
}
interface B extends A{
	public void b();
	//인터페이스 끼리 상속 가능
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
	//여러개의 인터페이스를 implements 가능하고 
	//이경우 모든 추상 매서드를 다 구현해야한다.
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
		
		a.a();//a   A타입까지만 인식 가능
		B b =c; 
		b.b();//b   A와 B 타입 모두 인식 가능
		
		A af= new F();
		B bf= new F();
		D df= new F();
		//특정 인터페이스를 implements 한 클래스를
		//상속받은 F는 부모 E가 구현한 타입으로 
		//모두 다 처리 가능하다.ㄴ
		
		
		
	}}
