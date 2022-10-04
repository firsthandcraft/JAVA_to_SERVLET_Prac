package step4;
class Car{
	static int scount;
	int count;
	
	//객체 생성시 자신의 인스턴스 변수는 계속 초기화
	//static변수 클래스 생성시 한 번 초기화
	Car(){//메소드 처럼 생긴 생성자임
		//클래스는 틀이니까 값을 안넣었다.
		//특징 : 일반 메서드는 여러번 호출이 가능하지만 한번 호출되고 끝
		//자동 호출된다.매게 변수가 존재하는 것 매게변수를 통해 값을 넣을 수 있다.
		System.out.println("car생성");
		count++;
		scount++;
		
	}
	
}


public class Teststatic5 {
public static void main(String[] args) {
	
	//객체 생성 해주기 
	Car c1= new Car();
	
	System.out.println(c1.count);//car생성 1
	System.out.println(Car.scount++);//1
	
//	-------------
	System.out.println("---------------");
	Car c2= new Car();
	System.out.println(c2.count);//car생성1
	
//	-------------
	System.out.println("---------------");
	Car c3= new Car();
	System.out.println(c3.count);//car생성 1
	System.out.println(Car.scount++);//4
	
	
	
}
}
