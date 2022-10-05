package step4;

public class Person {
	private String name;
	private Car car;//car라는 변수 앞에 Car라는 클래스명
	//Car객체의 주소값을 담기 위해 car 선언하고 
	//참조형 데이터 타입은 클래스 명이 된다. 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;//객체 주소값 들어감
	}
	
	
	
}
