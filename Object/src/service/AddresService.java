package service;

import java.util.Scanner;

import vo.addres;

public class AddresService {

	//�żҵ� ����
	

	private int index;
	private addres a[] =new addres[10];
	
	public void addPerson(addres a) {
		this.a[index]=a;
		index++;
		//index=index+1;
	}
	
	public void printAll() {
		for (int i=0; i<index;i++) {
			System.out.println(a[i]);
		}
	}

	public addres findPerson(String name) {
		// TODO Auto-generated method stub
		addres find = null;
		for(int i=0; i<index;i++) {
			if(a[i].getName().equals(name)) {
				find=a[i];
			}
		}
		return find;
	}
		
	public addres findUpdate(String name){
		addres up = findPerson(name);
		Scanner sc =new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է� :");
		up.setTel(sc.next());
		System.out.println("�ּ� �Է�");
		up.setAddr(sc.next());
        System.out.println("�̸�"+up.getName()+ "������ ��ȭ��ȣ :"+up.getTel()+"������ �ּ�"+up.getAddr());

		return up;
	}
	
	

}
