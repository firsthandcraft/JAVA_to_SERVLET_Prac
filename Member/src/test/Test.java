package test;

import java.util.Scanner;

import service.SchoolService;
import vo.MemberVO;

public class Test {
public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	String id = null,name=null,tel=null,addr=null;
	boolean flag=true;
	int i =0;
	
	SchoolService service = new SchoolService();//ctrl +shift +o ����Ʈ�ϱ�
	
	while(flag) {
		System.out.println("1.��� 2.�˻� 3.��ü��� 4.���� ");
		i=sc.nextInt();
		switch(i) {
		case 1 :
			System.out.println("���̵� �Է� :");
			id=sc.next();
			System.out.println("�̸� �Է� :");
			name=sc.next();
			System.out.println("��ȭ��ȣ �Է� :");
			tel=sc.next();
			System.out.println("�ּ� �Է� :");
			addr=sc.next();
			
			service.addPerson(new MemberVO(id, name, tel, addr));
			break;
		case 2 :
			 System.out.println("��ȭ��ȣ: ");
             tel=sc.next();
             MemberVO m =service.findPerson(tel);
             System.out.println(m);

			break;
		case 3 :
			  if(id==null || name==null || tel==null || addr==null) {
                  System.out.println("����� �ۼ����ּ���");
          
              }else {
            	  service.printAll();
              }

			break;
		case 4 :
	         flag=false;
             System.out.println("����");
          break;
          
         default:
             System.out.println("1~4���� ���ڸ� �Է��ϼ���");
		}
		
		
	}
}
}
