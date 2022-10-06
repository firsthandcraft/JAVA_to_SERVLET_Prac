package step3;

public class Child extends Parent {
	private String hobby;
	//defalt생성자
	public Child() {
		System.out.println("Child");
	}
	//출력
	public void printParentInfo() {
		System.out.println("name"+name);
		System.out.println("age"+age);
		//money는 직접적으로 안된다. 직접접근 불가 -> setget메소드로 접근가능
		//System.out.println("money"+money);
		System.out.println("hobby"+hobby);
	}
	
	//hobby SETGET메소드
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
}
