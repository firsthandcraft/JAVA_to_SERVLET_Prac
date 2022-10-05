package step3;


public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.printInfo();//nullwhite
	
		Car car2 = new Car("k5","red");
		car2.printInfo();//k5red
		
		System.out.println(car1);//16진수의 주소값으로 나온step3.Car@1c4af82c
		System.out.println(car2);
	
		car1=car2;
		//대입가능
		//가비지 컬렉터에의해 nullwhite는 제거되면 재사용시 다시 할당  
		car1.printInfo();//k5red
		car2.printInfo();//k5red
		
		
		
	}

}
