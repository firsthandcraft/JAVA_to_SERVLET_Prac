package step4;

public class Car {
	//변수 2개 만들기
	private String model;
	private String color;
	//생성자
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	//SETGET메소드
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
