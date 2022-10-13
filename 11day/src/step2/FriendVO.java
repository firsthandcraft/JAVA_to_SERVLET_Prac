package step2;

public class FriendVO {
	//변수 만들기 
	private String name;
	private int age;
	//생성자
	public FriendVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//SETGETMETHOD
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
	//TOSTRING
	@Override
	public String toString() {
		return "FriendVO [name=" + name + ", age=" + age + "]";
	}
	
	
}
