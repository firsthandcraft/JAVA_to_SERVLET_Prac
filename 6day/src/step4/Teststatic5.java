package step4;
class Car{
	static int scount;
	int count;
	
	//��ü ������ �ڽ��� �ν��Ͻ� ������ ��� �ʱ�ȭ
	//static���� Ŭ���� ������ �� �� �ʱ�ȭ
	Car(){//�޼ҵ� ó�� ���� ��������
		//Ŭ������ Ʋ�̴ϱ� ���� �ȳ־���.
		//Ư¡ : �Ϲ� �޼���� ������ ȣ���� ���������� �ѹ� ȣ��ǰ� ��
		//�ڵ� ȣ��ȴ�.�Ű� ������ �����ϴ� �� �ŰԺ����� ���� ���� ���� �� �ִ�.
		System.out.println("car����");
		count++;
		scount++;
		
	}
	
}


public class Teststatic5 {
public static void main(String[] args) {
	
	//��ü ���� ���ֱ� 
	Car c1= new Car();
	
	System.out.println(c1.count);//car���� 1
	System.out.println(Car.scount++);//1
	
//	-------------
	System.out.println("---------------");
	Car c2= new Car();
	System.out.println(c2.count);//car����1
	
//	-------------
	System.out.println("---------------");
	Car c3= new Car();
	System.out.println(c3.count);//car���� 1
	System.out.println(Car.scount++);//4
	
	
	
}
}
