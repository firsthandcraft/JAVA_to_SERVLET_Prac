package step3;


public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.printInfo();//nullwhite
	
		Car car2 = new Car("k5","red");
		car2.printInfo();//k5red
		
		System.out.println(car1);//16������ �ּҰ����� ����step3.Car@1c4af82c
		System.out.println(car2);
	
		car1=car2;
		//���԰���
		//������ �÷��Ϳ����� nullwhite�� ���ŵǸ� ����� �ٽ� �Ҵ�  
		car1.printInfo();//k5red
		car2.printInfo();//k5red
		
		
		
	}

}
