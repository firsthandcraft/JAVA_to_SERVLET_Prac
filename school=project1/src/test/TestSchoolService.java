package test;

import java.util.Scanner;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String j=null;
		SchoolService service= new SchoolService();
		
		
//		 System.out.println(service.toString());
		 
	      Student s = new Student("011", "ũ����Ż", "�Ǳ�", "12");
		 service.addPerson(s);
		 
	      Teacher t = new Teacher("012", "������", "�ͻ�", "����");
	      service.addPerson(t);
	      
	      Employee e = new Employee("018","���","����","����");
	      service.addPerson(e);
	      
	      service.printAll();
	      
	      System.out.println("ã�°��� �ϴ� tel ���� �Է��ϼ���");
	      j=sc.next();
	      Person per = service.findPerson(j);
	      
	      
	      if(per != null) {
	         System.out.println(per);
	      }
	      else {
	         System.out.println("����");
	         }
	   }

	
	
}
