package step3;

public class Car {
	 private String model;//null
	 private String color="white";
	 
	 
	 //기본 생성자
	 public Car() {
		super();//상속에서 쓰는 키워드
	}

	 //매개변수 2개 생성자
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	public void printInfo() {
		System.err.println(model+""+color);
	}
	
}
