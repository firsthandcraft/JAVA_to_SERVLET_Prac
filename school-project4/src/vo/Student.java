package vo;

public class Student extends Person {
	

	private String stuId ;
	
	public Student(String tel, String name, String address,String stuId) {
		super(tel, name, address);
		this.stuId=stuId;
		// TODO Auto-generated constructor stub
	}

	//SETGET method
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}


	//tostring
	/*@Override
	public String toString() {
		return super.toString()+"stuId :" +stuId;
	}*/

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", toString()=" + super.toString() + "]";
	}



}
