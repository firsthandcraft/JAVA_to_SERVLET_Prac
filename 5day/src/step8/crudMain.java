package step8;

import java.util.Scanner;

public class crudMain {
	public static void main(String[] args) {
		//��� ���� �� ���ο��� ����� 
		//equal  ����ϱ� 
		Scanner sc = new Scanner(System.in);
		// System.out.println("1.���");
		//1.���������
		String name= null, tel =null, addr=null;
		int i= 0,j,c=0;
		boolean flag=true, flag1 =false;
		
		//�迭�Է�
		crudTest[] a= new crudTest[10];
		//addr
		while(flag) {
			System.out.println("1.���");
			 System.out.println("2.�˻�");
			 System.out.println("3.��ü���");
             System.out.println("4.����");
             System.out.println("5.����");
             System.out.println("6.����");
             c =sc.nextInt();

			switch(c) {
				case 1:
					//for(i=0;i<a.length;i++) {}
					a[i] = new crudTest();
		             System.out.println("�̸� : ");
		             a[i].name =sc.next();
		             System.out.println("��ȭ��ȣ : ");
		             a[i].tel =sc.next();
		             System.out.println("�ּ� : ");
		             a[i].addr =sc.next();
		             i++;//10�� 
					
					break;
				case 2://�˻�
		            System.out.println("�̸� : ");
					name=sc.next();
					flag1=false;
					for(j=0;j<i;j++) {
						flag1=a[j].search(name);//�ش��ϴ� �Լ� ã�� search
						if (flag1) {
							a[j].print();
							break;
						}
					}
					if(!flag1) {
			             System.out.println("name ã�°� ����.");
					}
					break;
				case 3:
					for(j=0;j<i;j++) {
						a[j].print();
						break;
					}
					break;
				case 4:
					  System.out.println("(����)�̸� : ");
			             name =sc.next();
			             System.out.println("(����)��ȭ��ȣ : ");
			             tel =sc.next();
			             System.out.println("(����)�ּ� : ");
			             addr =sc.next();
						
					boolean f= false;
					for (j=0;j<i;j++) {
						f=a[j].edit(name,tel,addr);
						if(f)
							break;
					}
					if(f==false) {
			             System.out.println("����.");
					}
		           
					break;
				case 5:
					break;
				case 6:
					flag=false;
					break;
                default:
                    System.out.println("1~3���� ���ڸ� �Է��ϼ���");
                    break;
			
			}//switch
			
		}//while
	
	
	
	}
}
