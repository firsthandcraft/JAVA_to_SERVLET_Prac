package test;

import java.util.Scanner;

import javax.print.ServiceUI;

import service.AddsService;
import vo.addres;

public class TestService {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	int i=0;
	String name,tel,addr;
	AddsService service = new AddsService();
	
	while(flag) {
		System.out.println("1.��� 2.�˻� 3.��ü��� 4.���� 5.���� ");
		i=sc.nextInt();
		switch(i) {
		
		case 1:
			System.out.println("1.�̸� �Է� ");
			name=sc.next();
			System.out.println("2.��ȣ �Է� ");
			tel=sc.next();
			System.out.println("3.�ּ� �Է� ");
			addr=sc.next();
			service.addPerson(new addres(name,tel,addr));
			break;
				
		case 2:
			System.out.println("�̸� �˻� ");
			name=sc.next();
			addres find = service.findPerson(name);
			System.out.println(find);
			
			
			break;
		case 3:
			service.printAll();
			
			break;
		case 4:
			name=sc.next();
			service.findUpdate(name);
			break;
		case 5:
			flag=false;
			System.out.println("����");
			
			break;			
		
		
		
		}
		
		
		
		
	}



}
}
