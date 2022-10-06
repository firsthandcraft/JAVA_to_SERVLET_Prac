package step6;

class Employee{
	private String no;
	//생성자 매개 변수 1만들기 
	public Employee(String no) {
		this.no = no;
	}
	
}

class Manager extends Employee{

	private String dept;
	public Manager(String no,String dept) {
		super(no);//대입을 시킬때 부모꺼에 대입을 할때 
		 			//부모꺼는 부모꺼에 내꺼는 내꺼에 들어가게 만든다. 
					//부모생성자의 인자값을 입력한다.
		this.dept=dept;	
	}
}



public class TestSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m= new Manager("코스타", "영업부");
		
	}

}
