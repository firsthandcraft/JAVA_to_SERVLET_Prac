package step3;

public class Parent {
//���� ����� 
	public String name;
	protected int age;//��ӿ���piblicó�� �Ϲ���privateó��
	private int money;
	//������
	public Parent() {
		System.out.println("Parent ������");
	}
	//���
	public void printParentInfo() {
		System.out.println("name "+name);
		System.out.println("age "+age);
	}
	
	//money SETGET�޼ҵ� ����
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
}
