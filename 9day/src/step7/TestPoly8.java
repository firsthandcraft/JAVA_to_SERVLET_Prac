package step7;

import java.util.Scanner;

public class TestPoly8 {
public static void main(String[] args) {
	Employee e = new Employee("kosta1","������", "�Ǳ�", 200);
	Manager m = new Manager("kosta2", "ȫ�浿","��", 300,"������");
	Engineer en = new Engineer("kosta3","ȫ����","�Ǳ�", 400, "�ڹ�", 100);

	Employee group[] = {e,m,en};
	HrService service =new HrService();
	service.printAll(group);
	
	System.out.println("========�ּҰ� �Ǳ��� ���=========");
	Scanner sc = new Scanner(System.in);
	service.printByAddress("�Ǳ�", group);
	
	System.out.println("========salary �Լ� ȣ��=========");
	service.printAnnualSalary(e);
	service.printAnnualSalary(m);
	service.printAnnualSalary(en);

	System.out.println("========");
	service.printTotalCost(group);
}}
