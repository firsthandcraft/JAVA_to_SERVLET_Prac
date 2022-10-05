package service;

import java.util.Scanner;

import vo.addres;

public class AddresService {

	//매소드 제작
	

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
		System.out.println("전화번호 입력 :");
		up.setTel(sc.next());
		System.out.println("주소 입력");
		up.setAddr(sc.next());
        System.out.println("이름"+up.getName()+ "수정된 전화번호 :"+up.getTel()+"수정된 주소"+up.getAddr());

		return up;
	}
	
	

}
