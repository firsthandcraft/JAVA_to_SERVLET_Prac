package step3;

public class Child extends Parent {
	private String hobby;
	//defalt������
	public Child() {
		System.out.println("Child");
	}
	//���
	public void printParentInfo() {
		System.out.println("name"+name);
		System.out.println("age"+age);
		//money�� ���������� �ȵȴ�. �������� �Ұ� -> setget�޼ҵ�� ���ٰ���
		//System.out.println("money"+money);
		System.out.println("hobby"+hobby);
	}
	
	//hobby SETGET�޼ҵ�
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
}
