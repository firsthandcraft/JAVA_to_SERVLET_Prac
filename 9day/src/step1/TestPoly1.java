package step1;
class Animal{
	public void sleep() {
		System.out.println("�ڴ�");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
	

}

class Person extends Animal{
	public void eat() {//�Դٸ� ���
		System.out.println("����� �Դ�");
	}
	public void study() {
		System.out.println("����� �����ϴ�");
	}
	
}

class Dog extends Animal{
	public void eat() {//�Դٸ� ���
		System.out.println("���� �Դ�");
	}
	public void bark() {
		System.out.println("���� ¢��");
	}
}
public class TestPoly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�θ� Ÿ���� ������ �ڽ� ��ü�� ���� (�پ缺)
		Animal a =new Person();
		// �θ�    = �ڽ� �� ��ü�� �����
		a.sleep();//�ڴ� //�θ�� ���� ��ӹ��� �޼ҵ� ȣ�Ⱑ��
		a.eat();//����� �Դ� // �޼ҵ� �������̵� �Ǿ� �ڽ��� �޼ҵ� ȣ��
		
		//a.study();//������ ���´�. �θ� ���� ������ .Person Ŭ������ ������ �ִ°� 
		//������ ������ �θ� Ÿ���̹Ƿ� �ν� �Ұ�
		//�� �ڽ��� �������� ����� ������ �� ����. 
		//�����ϱ� ���ؼ��� ��ü�� ĳ������ �ʿ��ϴ�. 
		//casting ������� �κи� ������ �����ϴ�. 
		
	Person p = (Person)a;//��üĳ����
	p.study();//����� �����ϴ�. ���ٰ���
	
	System.out.println("================================");
	//dog ��ü ����
	Animal a2 = new Dog();
	a2.sleep();//�ڴ� 
	a2.eat();//�����Դ�
	
	Dog d= (Dog)a2;//��ü ĳ����
	d.bark();//���� ¢��
	

}}
