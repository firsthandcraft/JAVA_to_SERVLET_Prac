package step9;

public class Person {
	private String name;
	private int money;
	//변수 만들기 
	//값세팅하기
	//source > generate getters and setters
	//어떤 데이터를 입력하고 get 으로 출력하겠다. 
	
	//DTO 또는 VO클래스 (데이터 셋팅)//은닉성 ()
	//접근자를 통해 변수의 접근을 막는다. 
	//전역변수 접근지정자 private 을 통해막아줌
	//public 메서드를 통해 간접 접근을 허용하는 방법
	
	//캡슐화 은닉성 때문에 만듬 
	//변수를 private 로 막아놓았기 때문에 
	//아래를 통해 값을 출력하고 세팅
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//생성자는 1번 초기화 하면 끝남, 객체가 생성되면 자도응로 호출
		//초기화 1번 할때만 사용
		//나머지 반복을 위해 public void setName(String name) 의String name을 쓴것
		
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	//private 로 막아주었을때
	

}
