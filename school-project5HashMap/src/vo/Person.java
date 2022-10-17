package vo;

public class Person {
	//변수 공통사항 만들기
	private String tel;
	private String name;
	private String address;
	//생성자
	public Person() {
		super();
	}
	public Person(String tel, String name, String address) {
		super();
		this.tel = tel;
		this.name = name;
		this.address = address;
	}

	//SETGET method
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//tostring
	@Override
	public String toString() {
		return "Person [tel=" + tel + ", name=" + name + ", address=" + address + "]";
	}

}
