package test;



import java.util.Scanner;

import service.teacherMS;
import vo.TwoMembervo;

public class teacherTestMemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name,id,tel,add;

		boolean flag = true;
		int i=0;
		teacherMS service = new teacherMS();
		while(flag) {
			System.out.println("1.��� 2.�˻� 3.���� 4.���� 5.��ü��� 6.����");
			i=sc.nextInt();
			switch(i) {
			case 1:
				//���
				TwoMembervo m2=  new TwoMembervo(id,name, tel, add);

	            service.addMemberVO(m2);
				break;
			case 2:
				//�˻�
				System.out.println("���̵� �Է� :");
				id=sc.next();
				
				service.findMemberVO(id);
				break;
			case 3:
				//����
				
				break;
			case 4:
				//����
				break;
			case 5:
				//����
				service.printAll();
				break;
			case 6:
				System.out.println("����");
				 flag=false;
				break;
			default:
				System.out.println("�ٽ� 1-6���Է�");
		}
			
		}
	}}
