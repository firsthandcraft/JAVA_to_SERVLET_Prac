package step6;

public class Member2 {

	String name;
	String tel;
	String address;
	//������ ���� �ε�
	//ȸ������ ����
	
	//over loading https://hyoje420.tistory.com/14

	//������ ����� 
	//source -> generate Constructor using field -���� ��ü üũ����
	public Member2() {//�ʱ�ȭ�� �ϴ� ������ 
		name="no name";
		tel="no tel";
		address="no address";
		
	}

	//source -> generate Constructor using field -���� tel,address üũ����
	public Member2(String name) {//������ �̸��� ������ �ٸ���. 
		super();
		this.name = name;
		tel="on tel";
		address="no address";	
	}

	//source -> generate Constructor using field -���� ��ü ����
	public Member2(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	void print() {
		System.out.println("name"+name);
		System.out.println("tel"+tel);
		System.out.println("address"+address);
	}
	
}
