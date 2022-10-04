package step5;

public class Member2 {
	String name;
	String tel;
	String address;
	//생성자 선언
	public Member2(String name, String tel, String address) {
		super();
		name = "noname";
		tel = "notel";
		address = "noadd";
	}
	//메소드 추가 
	void print() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);

	}
}
