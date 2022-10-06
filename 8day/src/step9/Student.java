package step9;

public class Student extends Person {
	
	private String stuId;
	
	Student(String name, String tel, String address,String stuId) {
		super(name, tel, address);
		this.stuId=stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
	public String getDetails() {
		return super.getDetails()+"stuId : "+stuId;
	}
}
