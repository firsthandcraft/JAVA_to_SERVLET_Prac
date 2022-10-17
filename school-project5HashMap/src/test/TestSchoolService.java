package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {

	public static void main(String[] args) {
	SchoolService service =new SchoolService();
	Student s2= new Student("011","ũ����Ż","�Ǳ�","1");
	service.addPerson(s2);
	Teacher t = new Teacher("017","Ȳ����","�ͻ�","2");
	Employee e =new Employee("019","�ÿ���","����", "�����");
	service.addPerson(t);
	service.addPerson(e);
	service.PrintAll();
	System.out.println("--------------");
	/*Student [stuId=1, toString()=Person [tel=011, name=ũ����Ż, address=�Ǳ�]]
Employee [dept=�����, toString()=Person [tel=019, name=�ÿ���, address=����]]
Teacher [subject=2, toString()=Person [tel=017, name=Ȳ����, address=�ͻ�]]*/
	Person per = service.findPerson("017");
	
	if(per!=null) {
		System.out.println(per);
	} else {
		System.out.println("ã�� �������� ����.");
	}
	System.out.println("--------------");
	service.deletPerson("017");
	service.PrintAll();
	System.out.println("--------------");
	service.updatePerson("019", new Student("013","ũ����Ż","�Ǳ�","1"));
	service.updatePerson("011", new Student("013","ũ����Ż2","�Ǳ�","1"));
	service.PrintAll();
	
	
	
	}}
