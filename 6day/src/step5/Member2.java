package step5;

public class Member2 {
	String name;
	String tel;
	String address;
	//������ ����
	public Member2(String name, String tel, String address) {
		super();
		name = "noname";
		tel = "notel";
		address = "noadd";
	}
	//�޼ҵ� �߰� 
	void print() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);

	}
}
