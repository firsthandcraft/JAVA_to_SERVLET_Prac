package step7;

import java.util.Scanner;


public class MemberMain {
public static void main(String[] args) {
	Member m= new Member();
	Scanner sc = new Scanner(System.in);
	boolean flag= true;
	int i = 0;
	while(flag) {
		System.out.println("1.����  2.���  3.�˻�  4.������Ʈ  5.����  6. ����");
		i = sc.nextInt();
		switch(i) {
		case 1: 
			m.MemberInsert();
			break;
		case 2:
			m.MemberPrint();
			break;
		case 3:
			System.out.println("�˻��� �̸� �Է� : ");
			String j = sc.next();
			m.Search(j);
			
			break;
		case 4:
			m.update();
			break;
		case 5:
			m.delete();
			break;
			//�ֹ��ϸ� product ���� order���� �ֹ���  ������ŭ����
		case 6: flag = false;
			break;
		default:
			System.out.println("1-6���ڸ� �Է�");
		
		}
	
	}
	flag=false;
}}
