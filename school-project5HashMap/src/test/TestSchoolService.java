package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {

	public static void main(String[] args) {
	SchoolService service =new SchoolService();
	Student s2= new Student("011","크리스탈","판교","1");
	service.addPerson(s2);
	Teacher t = new Teacher("017","황정민","익산","2");
	Employee e =new Employee("019","시용태","수지", "전산부");
	service.addPerson(t);
	service.addPerson(e);
	service.PrintAll();
	System.out.println("--------------");
	/*Student [stuId=1, toString()=Person [tel=011, name=크리스탈, address=판교]]
Employee [dept=전산부, toString()=Person [tel=019, name=시용태, address=수지]]
Teacher [subject=2, toString()=Person [tel=017, name=황정민, address=익산]]*/
	Person per = service.findPerson("017");
	
	if(per!=null) {
		System.out.println(per);
	} else {
		System.out.println("찾는 구성원이 없다.");
	}
	System.out.println("--------------");
	service.deletPerson("017");
	service.PrintAll();
	System.out.println("--------------");
	service.updatePerson("019", new Student("013","크리스탈","판교","1"));
	service.updatePerson("011", new Student("013","크리스탈2","판교","1"));
	service.PrintAll();
	
	
	
	}}
