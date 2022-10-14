package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {
public static void main(String[] args) {

	SchoolService service= new SchoolService();
	
	Student s =new Student("011","크리스탈","판교","12");
	service.addPerson(s);
	
	Teacher t =new Teacher("017","황정민","익산", "국어");
	service.addPerson(t);

	Employee e=new Employee("015","시용태","수지", "전산부");
	service.addPerson(e);
	//출력할때 부모것을 가져온다.
	
	service.printAll();
	
	Person per =service.findPerson("017");
	if(per!=null) {
		System.out.println(per);
	}else {
		System.out.println("찾는구성원이 업삳.");
	}
	
	service.delPerson("017");
	service.printAll();
	service.updatePerson("015", new Student("015","보아","수지수정", "전산부수정"
			
			));
}}
