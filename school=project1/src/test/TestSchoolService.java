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
		 
	      Student s = new Student("011", "크리스탈", "판교", "12");
		 service.addPerson(s);
		 
	      Teacher t = new Teacher("012", "개구리", "익산", "국어");
	      service.addPerson(t);
	      
	      Employee e = new Employee("018","용용","수지","전산");
	      service.addPerson(e);
	      
	      service.printAll();
	      
	      System.out.println("찾는고자 하는 tel 값을 입력하세요");
	      j=sc.next();
	      Person per = service.findPerson(j);
	      
	      
	      if(per != null) {
	         System.out.println(per);
	      }
	      else {
	         System.out.println("없다");
	         }
	   }

	
	
}
