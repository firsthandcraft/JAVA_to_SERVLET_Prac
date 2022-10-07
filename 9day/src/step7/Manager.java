package step7;

public class Manager extends Employee{

	private String dept;
	public Manager(String empId, String name, String address, int salary,String dept) {
		super(empId, name, address, salary);
		// TODO Auto-generated constructor stub
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return super.toString()+"dept = "+dept;
	}

	
}
