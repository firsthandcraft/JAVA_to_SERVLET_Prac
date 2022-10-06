package step8;

class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
	public void eat() {//같은 상속값으로 넣어준다. overriding
		System.out.println("사람이 수저로 먹다");
	}
} 
class Dog extends Animal{
	public void eat() {//어떤 객체로 접근하는지에 따라 다르다. overriding
		System.out.println("개가 혀로 핥아서 먹다.");
	}
} 
public class TestOverriding1 {

	public static void main(String[] args) {

		Person p = new Person();
		p.eat();//사람이 수저로 먹다
		
		Dog d = new Dog();
		d.eat();//개가 혀로 핥아서 먹다.
		
		
		
	}

}
