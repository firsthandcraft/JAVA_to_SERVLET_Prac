package step2;
class Animal{
	public void eat() {
		System.out.println("�Դ�");
		
	}
}
 class Person extends Animal{
	public void eat() {
		System.out.println("����� �Ĵ翡�� ��Դ�");
		
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("���� ��Ḧ �Դ�");
		
	}
}
class Tiger extends Animal{
	public void eat() {
		System.out.println("ȣ���̰� ������ �Դ�");
		
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
		zoo.pass(new Person());//����� �Ĵ翡�� ��Դ�

		zoo.pass(new Dog());//���� ��Ḧ �Դ�

		zoo.pass(new Tiger());//ȣ���̰� ������ �Դ�

		

}}
