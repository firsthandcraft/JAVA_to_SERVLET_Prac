package vo;

public class Teacher extends Person{
	
	private String subject;

	public Teacher() {
		super();
	}
	public Teacher(String tel, String name, String address,String subject) {
		super(tel, name, address);
		// TODO Auto-generated constructor stub
		this.subject=subject;

	}
	//SETGET method
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	//tostring
	/*@Override
	public String toString() {
		return super.toString()+"subject :" +subject;
	}*/
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
