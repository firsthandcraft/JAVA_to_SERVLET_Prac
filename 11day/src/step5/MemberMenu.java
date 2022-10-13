package step5;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	private Scanner sc =new Scanner(System.in);
	private int menu;
	boolean flag =true;
	private String menuStr="1.�߰� 2.�˻� 3.���� 4.���� 5.��ü��� 6.����";
	//2.
	public void menuProcess(ArrayList<Member>data) {
		//ArrayList�����ϰ� �޾ƿ��°�
		int idx=0;
		while(flag) {
			System.out.println(menuStr);
			menu=sc.nextInt();
			switch(menu) {
				case 1:
					
					data.add(infoInput());
					
					break;
				case 2:
					idx=search(data);
					printMember(data.get(idx));
					break;
				case 3:
					editMember(data);
					
					break;
				case 4:
					delMember(data);
					break;
				case 5:
					for(idx=0;idx<data.size();idx++) {
						printMember(data.get(idx));
					}
					break;
				case 6:
					flag= false;
					break;
				
			}
			
		}
	}
	//1.
	public Member infoInput() {
		System.out.println("�̸�:");
		String name = sc.next();
		System.out.println("��ȭ��ȣ:");
		String tel = sc.next();
		System.out.println("�ּ�:");
		String address = sc.next();
		return new Member(name, tel, address);//���ڿ� �϶� return null�� 
	}
	
	public int search(ArrayList<Member>data) {
		System.out.println("�̸�:");
		//������ �ޱ� ���� ���� 
		String name = sc.next();

		for(int i =0; i<data.size();i++) {
			if(name.equals(data.get(i).getName())) {
				return i;
			}
		}
		return 0;//�����϶� return 0���� 
	}
	
	public void editMember(ArrayList<Member>data) {
		int idx = search(data);
		System.out.println("�� ��ȭ��ȣ:");
		String tel = sc.next();
		
		sc.nextLine();//�Է��� ���� 
	
		System.out.println("�� �ּ�:");
		String address = sc.next();
		data.set(idx, new Member(data.get(idx).getName(),tel,address));
		
	}
	
	public void delMember(ArrayList<Member>data) {
		int idx = search(data);
		data.remove(idx);
	}
	
	public void printMember(Member m) {
		System.out.println(m);
	}

}

