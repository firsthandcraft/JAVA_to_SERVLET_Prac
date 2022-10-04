package step6;

public class Member2 {

	String name;
	String tel;
	String address;
	//생성자 오버 로딩
	//회원가입 형태
	
	//over loading https://hyoje420.tistory.com/14

	//생성자 만들기 
	//source -> generate Constructor using field -에서 전체 체크해제
	public Member2() {//초기화만 하는 생성자 
		name="no name";
		tel="no tel";
		address="no address";
		
	}

	//source -> generate Constructor using field -에서 tel,address 체크해제
	public Member2(String name) {//생성자 이름이 같지만 다르다. 
		super();
		this.name = name;
		tel="on tel";
		address="no address";	
	}

	//source -> generate Constructor using field -에서 전체 선택
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
