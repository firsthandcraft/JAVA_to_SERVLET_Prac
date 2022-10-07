package step1;
class Animal{
	public void sleep() {
		System.out.println("자다");
	}
	public void eat() {
		System.out.println("먹다");
	}
	

}

class Person extends Animal{
	public void eat() {//먹다를 상속
		System.out.println("사람이 먹다");
	}
	public void study() {
		System.out.println("사람이 공부하다");
	}
	
}

class Dog extends Animal{
	public void eat() {//먹다를 상속
		System.out.println("개가 먹다");
	}
	public void bark() {
		System.out.println("개가 짖다");
	}
}
public class TestPoly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//부모 타입의 변수에 자식 객체를 참조 (다양성)
		Animal a =new Person();
		// 부모    = 자식 의 객체를 뺏어옴
		a.sleep();//자다 //부모로 부터 상속받은 메소드 호출가능
		a.eat();//사람이 먹다 // 메소드 오버라이딩 되어 자신의 메소드 호출
		
		//a.study();//에러가 나온다. 부모에 있지 않은것 .Person 클래스만 가지고 있는것 
		//참조의 변수가 부모 타입이므로 인식 불가
		//즉 자식의 독자적인 멤버는 접근할 수 없다. 
		//접근하기 위해서는 객체의 캐스팅이 필요하다. 
		//casting 상속해준 부분만 접근이 가능하다. 
		
	Person p = (Person)a;//객체캐스팅
	p.study();//사람이 공부하다. 접근가능
	
	System.out.println("================================");
	//dog 객체 생성
	Animal a2 = new Dog();
	a2.sleep();//자다 
	a2.eat();//개가먹다
	
	Dog d= (Dog)a2;//객체 캐스팅
	d.bark();//개가 짖다
	

}}
