package vo;

public class Employee extends Person{
	private String dept;
	public Employee(String tel, String name, String address, String dept) {
		super(tel, name, address);
		// TODO Auto-generated constructor stub
		this.dept=dept;
	}
	public String getDaept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
/*
	@Override
	public String toString() {
		return super.toString()+"dept"+dept;
	}*/
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", toString()=" + super.toString() + "]";
	}
	

	
}
