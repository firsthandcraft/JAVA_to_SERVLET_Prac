package service;

import java.util.Scanner;

import vo.addres;

public class AddsService {
	
	private addres a[] = new addres[10];
	private int index ; //0
	
	//addPerson 1.���
	//findPerson 2.�˻�
	//printAll 3.��ü���
	//findUpdate 4.����	
	
	public void addPerson(addres a) {
		this.a[index] =a;
		index++;
	}
	
	public addres findPerson(String name) {
		addres search = null;
		for(int i=0; i<index;i++) {
			if(a[i].getName().equals(name)) {
				search=a[i];
			}
		}
		return search;// �޼ҵ�� ���� ���� �ݵ�� �ִ´�. 
	}

	public void printAll() {
		for (int i= 0; i<index ; i++) {
			System.out.println(a[i]);
		}
	}
	
	public addres findUpdate(String name) {
		addres findperson = findPerson(name);
		Scanner sc =new Scanner(System.in);
		
		System.out.println("��ȭ��ȣ �Է� :");
		findperson.setTel(sc.next());
		System.out.println(findperson.getTel());

		System.out.println("�ּ� �Է� :");
		findperson.setAddr(sc.next());
		System.out.println(findperson.getAddr());

		
		return findperson;
	}
}
