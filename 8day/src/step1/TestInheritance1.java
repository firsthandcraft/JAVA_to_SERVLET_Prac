package step1;
//class�����
class Animal{//extend Object(�����Ǿ�����)
	int age=1;
	public void eat() {
		System.out.println("�Դ�");
		
	}
	
}
//class ����� 2
class Person extends Animal{//�ڽ�
	
	public void study() {
		System.out.println("�����ϴ�");
	}
}

//main
public class TestInheritance1 {
public static void main(String[] args) {
	//��ü����
	Person p  = new Person();
	p.study();
	p.eat();
	System.out.println(p.age);//������ ���� �����ϴ�.
}
}
