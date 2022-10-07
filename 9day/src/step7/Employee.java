package step7;

public class Employee {
	private String empId;
	private String name;
	private String address;
	private int salary;
	//»ý¼ºÀÚ
	public Employee(String empId, String name, String address, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	//SETGET method
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//toString
	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary;
	}
	
	
}
