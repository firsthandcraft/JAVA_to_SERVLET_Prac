package step3;

public class Car {
	 private String model;//null
	 private String color="white";
	 
	 
	 //�⺻ ������
	 public Car() {
		super();//��ӿ��� ���� Ű����
	}

	 //�Ű����� 2�� ������
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	public void printInfo() {
		System.err.println(model+""+color);
	}
	
}
