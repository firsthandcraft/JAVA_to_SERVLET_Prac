package test;

import java.util.Scanner;

import service.AddresService;
import vo.addres;


public class TestService {
 public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		String name=null,tel=null,addr=null;
		boolean flag=true;
		int i =0;
		
		AddresService service = new AddresService();//ctrl +shift +o ����Ʈ�ϱ�
		
		while(flag) {
			System.out.println("1.��� 2.�˻� 3.��ü��� 4.���� 5.���� ");
			i=sc.nextInt();
			switch(i) {
			case 1 :
				System.out.println("�̸� �Է� :");
				name=sc.next();
				System.out.println("��ȭ��ȣ �Է� :");
				tel=sc.next();
				System.out.println("�ּ� �Է� :");
				addr=sc.next();
				
				service.addPerson(new addres(name, tel, addr));
				break;
			case 2 :
				 System.out.println("�̸�: ");
	             name=sc.next();
	             addres m =service.findPerson(name);
	             System.out.println(m);

				break;
			case 3 :
				  if( name==null || tel==null || addr==null) {
	                  System.out.println("����� �ۼ����ּ���");
	          
	              }else {
	            	  service.printAll();
	              }

				break;
			case 4 ://����
				 System.out.println("�̸�: ");
	             name=sc.next();
	             service.findUpdate(name);

	          break;
	          
			case 5 :
				flag=false;
				System.out.println("����");
				break;
	          
	         default:
	             System.out.println("1~4���� ���ڸ� �Է��ϼ���");
			}
			
			
		}
 
 
 }
}
