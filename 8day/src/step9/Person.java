package step9;

public class Person {
	private String name;
	private String tel;
	private String address;
	//생성자 매개 변수 전부 
	Person(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	//SETGET Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDetails() {
		return "name : "+name+"tel : "+tel +"address : "+address;
	}
	
	
}
