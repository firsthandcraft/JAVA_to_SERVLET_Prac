package step3;

public class Parent {
//변수 만들기 
	public String name;
	protected int age;//상속에서piblic처럼 일반은private처럼
	private int money;
	//생성자
	public Parent() {
		System.out.println("Parent 생성자");
	}
	//출력
	public void printParentInfo() {
		System.out.println("name "+name);
		System.out.println("age "+age);
	}
	
	//money SETGET메소드 지정
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
}
