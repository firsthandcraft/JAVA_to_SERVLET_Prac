package step10;
class Company{
	private String name;
	private String address;
	//������ public ����� 
	Company(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	//object class�� toString()�޼��带 �������̵�
	//�ּҰ� ��� ��ü�� ���� ���밪�� ��ȯ�ȴ�. 
	//toString
	@Override
	public String toString() {
		return "ȸ��� :"+name + "�ּ� :" + address;
	}
	
	
}


public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1 = new Company("�ȷ�","�Ǳ�");
		System.out.println(c1.toString());//ȸ��� :�ȷ��ּ� :�Ǳ�
		System.out.println(c1);//ȸ��� :�ȷ��ּ� :�Ǳ�
		
	}

}
