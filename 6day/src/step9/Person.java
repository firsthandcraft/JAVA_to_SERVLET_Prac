package step9;

public class Person {
	private String name;
	private int money;
	//���� ����� 
	//�������ϱ�
	//source > generate getters and setters
	//� �����͸� �Է��ϰ� get ���� ����ϰڴ�. 
	
	//DTO �Ǵ� VOŬ���� (������ ����)//���м� ()
	//�����ڸ� ���� ������ ������ ���´�. 
	//�������� ���������� private �� ���ظ�����
	//public �޼��带 ���� ���� ������ ����ϴ� ���
	
	//ĸ��ȭ ���м� ������ ���� 
	//������ private �� ���Ƴ��ұ� ������ 
	//�Ʒ��� ���� ���� ����ϰ� ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//�����ڴ� 1�� �ʱ�ȭ �ϸ� ����, ��ü�� �����Ǹ� �ڵ����� ȣ��
		//�ʱ�ȭ 1�� �Ҷ��� ���
		//������ �ݺ��� ���� public void setName(String name) ��String name�� ����
		
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	//private �� �����־�����
	

}
