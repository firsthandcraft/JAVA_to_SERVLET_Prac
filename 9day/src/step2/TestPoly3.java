package step2;
class Animal{
	public void eat() {
		System.out.println("¸Ô´Ù");
		
	}
}
 class Person extends Animal{
	public void eat() {
		System.out.println("»ç¶÷ÀÌ ½Ä´ç¿¡¼­ ¹ä¸Ô´Ù");
		
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("°³°¡ »ç·á¸¦ ¸Ô´Ù");
		
	}
}
class Tiger extends Animal{
	public void eat() {
		System.out.println("È£¶ûÀÌ°¡ »ý´ßÀ» ¸Ô´Ù");
		
	}
}

class ZooService {
	
	public void pass(Animal a){
		a.eat();
	}
}
public class TestPoly3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZooService zoo= new ZooService();
		zoo.pass(new Person());//»ç¶÷ÀÌ ½Ä´ç¿¡¼­ ¹ä¸Ô´Ù

		zoo.pass(new Dog());//°³°¡ »ç·á¸¦ ¸Ô´Ù

		zoo.pass(new Tiger());//È£¶ûÀÌ°¡ »ý´ßÀ» ¸Ô´Ù

		

}}
