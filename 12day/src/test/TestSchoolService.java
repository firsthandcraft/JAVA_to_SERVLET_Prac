package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {
public static void main(String[] args) {

	SchoolService service= new SchoolService();
	
	Student s =new Student("011","ũ����Ż","�Ǳ�","12");
	service.addPerson(s);
	
	Teacher t =new Teacher("017","Ȳ����","�ͻ�", "����");
	service.addPerson(t);

	Employee e=new Employee("015","�ÿ���","����", "�����");
	service.addPerson(e);
	//����Ҷ� �θ���� �����´�.
	
	service.printAll();
	
	Person per =service.findPerson("017");
	if(per!=null) {
		System.out.println(per);
	}else {
		System.out.println("ã�±������� ����.");
	}
	
	service.delPerson("017");
	service.printAll();
	service.updatePerson("015", new Student("015","����","��������", "����μ���"
			
			));
}}
