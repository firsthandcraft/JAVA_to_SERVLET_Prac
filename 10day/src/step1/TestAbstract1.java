package step1;
//�߻�Ŭ���� �����ϱ� 
//abstract method (�߻�޼���)�� �ϳ� �̻����� ������
//�� Ŭ������ abstract class�� ����Ǿ�� �Ѵ�.
//abstract class�� ���� ��üȭ �ɼ� ����.

abstract class Parent{
	public void eat() {
		System.out.println("�Դ�");
		
	}
	//abstract method�� �����ΰ� ����.
	//�ڽĵ��� �ݵ�� abstract method�� �������̵� �ؾ��Ѵ�. 
	// ���� �������̵� ���� ������
	//�ڽ� Ŭ������ abstract �� �Ǿ� �Ѵ�.=-> ��ü ������ �ȵ�
	//��ü ���� �� �Ϸ��� �������̵� �ؾ��Ѵ�.
	//�߻�޼���
	public abstract void study();
}
	class Child extends Parent{
		//���������� ���´�.
		//�߻�Ŭ���� �������̵�
		//��ü ������ �����ϴ�.
		@Override
		public void study() {
			// TODO Auto-generated method stub
			System.out.println("�����ϴ�");
			
		
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
		/*�Դ�
		�����ϴ�
		�Դ�
		�����ϴ�*/
	}

}
