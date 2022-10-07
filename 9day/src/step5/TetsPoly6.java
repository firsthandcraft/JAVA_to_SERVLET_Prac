package step5;
class Vehicle{
	public void go() {
		System.out.println("가다");
	}
}
class Car extends Vehicle{
	public void go() {
		System.out.println("차동차가 가다");
	}
}
class Airplane extends Vehicle{
	public void go() {
		System.out.println("비행기 속 go 함수가 가다");
	}
	public void fly() {
		System.out.println("비행기가 가다");
	}
}




public class TetsPoly6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//up CASTING
		//다형성이 적용되므로 Vehicle 부모타입의 배열에 자식의 객체요소를 추가 가능
		//vihicle 부모는 go밖에 없다. 
		//casting은 준것만 가져올수 있다. 
		Vehicle va [] = {new Vehicle(),new Car(),new Airplane()};
		
		//for 문을 이용하여 배열의 모든 요소에 go호출
		for(int i =0;i<va.length;i++) {
			va[i].go();
			//가다
			//차동차가 가다
			//비행기 속 go 함수가 가다
			if(va[i] instanceof Airplane) {
				Airplane a = (Airplane)va[i];
				a.fly();//비행기가 가다
			}
			
		}
		
	}

}
