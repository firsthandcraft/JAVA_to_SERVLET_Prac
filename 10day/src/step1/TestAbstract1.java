package step1;
//추상클래스 선언하기 
//abstract method (추상메서드)를 하나 이상가지고 잇으면
//그 클래스는 abstract class로 선언되어야 한다.
//abstract class는 직접 객체화 될수 없다.

abstract class Parent{
	public void eat() {
		System.out.println("먹다");
		
	}
	//abstract method는 구현부가 없다.
	//자식들은 반드시 abstract method를 오버라이딩 해야한다. 
	// 만양 오버라이딩 하지 않으면
	//자식 클래스가 abstract 가 되야 한다.=-> 객체 생성이 안됨
	//객체 생성 을 하려면 오버라이딩 해아한다.
	//추상메서드
	public abstract void study();
}
	class Child extends Parent{
		//빨간라인이 나온다.
		//추상클래스 오버라이딩
		//객체 생성이 가능하다.
		@Override
		public void study() {
			// TODO Auto-generated method stub
			System.out.println("공부하다");
			
		
	}
}

public class TestAbstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c =new Child();
		c.eat();
		c.study();
		Parent p1= new Child();
		p1.eat();
		p1.study();
		/*먹다
		공부하다
		먹다
		공부하다*/
	}

}
