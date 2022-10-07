package step3;

class Animal{}
class Person extends Animal{
	
}
class Dog extends Animal{}

public class TestPoly4 {

	public static void main(String[] args) {
		Animal a = new Person();
		//Animal 은 Person클래스의 객체를 받아옴
		
		/*instanceof 연산자
		객체의 타입을 비교하여 true or false 로 변환
		단 if a 관계시(상속관계 :ex) 사람은 동물이다. )에는 
		true 를 반환하므로 항상 자식부터 부모순으로 비교해야한다. 
		*/
		if(a instanceof Person)
			System.out.println("나는 사람이다.");
		//나는 사람이다.
		
		if(a instanceof Dog)
			System.out.println("나는 개다.");
		//안됨
	
		if(a instanceof Animal)
			System.out.println("나는 동물이다.");
		//나는 동물이다.
	
		
	}}
