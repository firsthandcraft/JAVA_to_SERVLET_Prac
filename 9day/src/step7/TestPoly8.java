package step7;

import java.util.Scanner;

public class TestPoly8 {
public static void main(String[] args) {
	Employee e = new Employee("kosta1","아이유", "판교", 200);
	Manager m = new Manager("kosta2", "홍길동","목동", 300,"영업부");
	Engineer en = new Engineer("kosta3","홍길자","판교", 400, "자바", 100);

	Employee group[] = {e,m,en};
	HrService service =new HrService();
	service.printAll(group);
	
	System.out.println("========주소값 판교만 출력=========");
	Scanner sc = new Scanner(System.in);
	service.printByAddress("판교", group);
	
	System.out.println("========salary 함수 호출=========");
	service.printAnnualSalary(e);
	service.printAnnualSalary(m);
	service.printAnnualSalary(en);

	System.out.println("========");
	service.printTotalCost(group);
}}
