package step6;

class Employee{
	private String no;
	//������ �Ű� ���� 1����� 
	public Employee(String no) {
		this.no = no;
	}
	
}

class Manager extends Employee{

	private String dept;
	public Manager(String no,String dept) {
		super(no);//������ ��ų�� �θ𲨿� ������ �Ҷ� 
		 			//�θ𲨴� �θ𲨿� ������ ������ ���� �����. 
					//�θ�������� ���ڰ��� �Է��Ѵ�.
		this.dept=dept;	
	}
}



public class TestSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m= new Manager("�ڽ�Ÿ", "������");
		
	}

}
