package step5;

public class Member {
	String name;
	String tel;
	String address;
	
	//아무것도 없는 생성자
	public Member() {//source -> generate Constructor using field -에서 체크 해제
		super();
		name="no name";
		tel ="no tel";
		address = "no address";
	}
	
	//생성자
	/*public Member(String name, String tel, String address) {
	 * //source -> generate Constructor using field -에서 전체 체크
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}*/
	//메서드 추가 
	void setMemberData(String _name,String _tel,String _address) {
		name=_name;
		tel=_tel;
		address=_address;
		
		//단점 매개변수 갯수를 안맞추면 값이 오류가 난다.
		//필수 항목 선택항목이 있을때 
		//선택항목 빼도 오류가 안나는 이유 생성자는default도 있고 변수도 있다. 
		//over loading https://hyoje420.tistory.com/14
	}
	
	//메소드 추가 
	void print() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
	
	

}
