package step6;

public class Friend {//�����͸� ���� ���� �� = DTO(VO)

	//���� 2�� 
	private String name;
	private int age;
	
	//������
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
