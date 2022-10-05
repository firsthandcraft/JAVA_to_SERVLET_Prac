package step6;

public class Friend {//데이터만 찍어내기 위한 것 = DTO(VO)

	//변수 2개 
	private String name;
	private int age;
	
	//생성자
	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//SETGET method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
