package step8;

class Employee{
	private String empNo;
	private String eName;
	//메소드 있는 생성자
	Employee(String empNo, String eName) {
		super();
		this.empNo = empNo;
		this.eName = eName;
	}
	
	//SETGET 메소드
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return eName;
	}
	public void setEmpName(String eName) {
		this.eName = eName;
	}
	
	public String getDetails() {
		return "empNO :"+empNo+"eName"+eName;
	}
}
 
	class Manager extends Employee{

		private String dept;
		public Manager(String empNo, String eName,String dept) {
			super(empNo, eName);
			this.dept=dept;
		}
		public String getDetails() {
			//super로 부모가 들어간 것과 내 dept 추가 
			return super.getDetails()+"dept :"+dept;
		}
		//SETGET -dept추가 
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
	}
	
public class TestOverriding2 {

	public static void main(String[] args) {

		Employee e=new Employee("al","아이유");
		System.out.println(e.getDetails());
		
		Manager m = new Manager("a2","정대새","영업부");
		System.out.println(m.getDetails());

	}

}
