package service;

import java.util.Scanner;

import vo.addres;

public class AddsService {
	
	private addres a[] = new addres[10];
	private int index ; //0
	
	//addPerson 1.등록
	//findPerson 2.검색
	//printAll 3.전체출력
	//findUpdate 4.수정	
	
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
		return search;// 메소드는 리턴 값을 반드시 넣는다. 
	}

	public void printAll() {
		for (int i= 0; i<index ; i++) {
			System.out.println(a[i]);
		}
	}
	
	public addres findUpdate(String name) {
		addres findperson = findPerson(name);
		Scanner sc =new Scanner(System.in);
		
		System.out.println("전화번호 입력 :");
		findperson.setTel(sc.next());
		System.out.println(findperson.getTel());

		System.out.println("주소 입력 :");
		findperson.setAddr(sc.next());
		System.out.println(findperson.getAddr());

		
		return findperson;
	}
}
