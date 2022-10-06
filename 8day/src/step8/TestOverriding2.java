package step8;

class Employee{
	private String empNo;
	private String eName;
	//�޼ҵ� �ִ� ������
	Employee(String empNo, String eName) {
		super();
		this.empNo = empNo;
		this.eName = eName;
	}
	
	//SETGET �޼ҵ�
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
			//super�� �θ� �� �Ͱ� �� dept �߰� 
			return super.getDetails()+"dept :"+dept;
		}
		//SETGET -dept�߰� 
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
	}
	
public class TestOverriding2 {

	public static void main(String[] args) {

		Employee e=new Employee("al","������");
		System.out.println(e.getDetails());
		
		Manager m = new Manager("a2","�����","������");
		System.out.println(m.getDetails());

	}

}
