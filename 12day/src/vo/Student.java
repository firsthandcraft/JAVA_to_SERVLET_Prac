package vo;

public class Student extends Person{
	private String studId;
	public Student(String tel, String name, String address,String studId) {
		super(tel, name, address);
		// TODO Auto-generated constructor stub
		this.studId=studId;
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", getTel()=" + getTel() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	
}
