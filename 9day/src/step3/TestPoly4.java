package step3;

class Animal{}
class Person extends Animal{
	
}
class Dog extends Animal{}

public class TestPoly4 {

	public static void main(String[] args) {
		Animal a = new Person();
		//Animal �� PersonŬ������ ��ü�� �޾ƿ�
		
		/*instanceof ������
		��ü�� Ÿ���� ���Ͽ� true or false �� ��ȯ
		�� if a �����(��Ӱ��� :ex) ����� �����̴�. )���� 
		true �� ��ȯ�ϹǷ� �׻� �ڽĺ��� �θ������ ���ؾ��Ѵ�. 
		*/
		if(a instanceof Person)
			System.out.println("���� ����̴�.");
		//���� ����̴�.
		
		if(a instanceof Dog)
			System.out.println("���� ����.");
		//�ȵ�
	
		if(a instanceof Animal)
			System.out.println("���� �����̴�.");
		//���� �����̴�.
	
		
	}}
