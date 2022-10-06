package step5;

public class PersonMain {
public static void main(String[] args) {
	Person p = new Person();
	p.setNum(1);
	p.setName("person");
	p.setDept("dept");
	p.setAddress("address");
	p.print();
	/* print 출력화면 
	num1
	nameperson
	deptdept
	addressaddress*/
	System.out.println("==============");

	Professor f =new Professor();
	f.setNum(2);
	f.setName("교수1");
	f.setDept("Computer");
	f.setAddress("독산");
	f.setSubjects(new String[] {"전산학개론","C프로그래밍","RTOS"});
	f.print();
	f.print_subj();
	/* 출력화면
	 num2
	name교수1
	deptComputer
	address독산
	교수1교수의 개설과목
	subjects전산학개론
	subjectsC프로그래밍
	subjectsRTOS*/
	System.out.println("==============");
	
	Student s =new Student();
	s.setNum(3);
	s.setName("학생");
	s.setDept("Computer2");
	s.setAddress("경기도");
	s.setSubject(new String[] {"자바프로그래밍","운영체제","컴파일러"});
	s.print();
	s.print_subj();
	/*출력화면
	num3
	name학생
	deptComputer2
	address경기도
	학생학생의 개설과목
	subject자바프로그래밍
	subject운영체제
	subject컴파일러 */
	System.out.println("==============");
	Staff sf =new Staff();
	sf.setNum(4);
	sf.setName("교원");
	sf.setDept("HR");
	sf.setAddress("인천");
	sf.setJob("교육부");
	sf.print();
	sf.print_job();
	/*출력화면
	num4
	name교원
	deptHR
	address인천
	교원교직원의 직무는교육부*/
	System.out.println("==============");

	
}
}
