package step5;

import java.util.Scanner;


public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB d= new DB();
		Scanner sc = new Scanner(System.in);
		boolean flag= true;
		int i =0;
		
		while(flag) {
			System.out.println("1.���  2.���  3.�˻�  4.����  5.����  6. ����");
			i = sc.nextInt();
			switch(i) {
			case 1:
				d.enroll();
				break;
			case 2:
				d.print();
				break;
			case 3:
				System.out.println("�˻��� ��ȣ �Է� : ");
				int j = sc.nextInt();
				d.search(j);
				break;
			case 4:
				d.update();
				break;
			case 5:
				d.delete();
				break;
			case 6: flag = false;
				break;
			default:
				System.out.println("1-6���ڸ� �Է�");
			}
			
		}
		flag=false;
	}}
