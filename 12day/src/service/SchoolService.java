package service;

import java.util.ArrayList;

import vo.Person;

public class SchoolService {
	private ArrayList<Person>list=new ArrayList<Person>();
	//<>제너릭
	
	public void addPerson(Person p) {
		boolean flag = false;
		for(int i =0; i<list.size();i++) {
			Person per = list.get(i);
			if(p.getTel().equals(per.getTel())) {
				flag=true;//동일한 번호 존재
			}
		}
		if(flag==false) {
			list.add(p);//동일한 전화번호가 없을때 추가
		} else {
			System.out.println("동일한 번호가 있다.");
		}
	}
	public void printAll() {
		for(int i =0; i<list.size();i++) {
			Person p = list.get(i);
			System.out.println(p);
			System.out.println("---------------");
		}
	}
	
	public Person findPerson(String tel) {
		Person per =null;
		for(int i=0;i<list.size();i++) {
			Person p = list.get(i);
			if(p.getTel().startsWith(tel)) {
				per=p;
				break;
			}
		}
		return per;
	}
	public void delPerson(String tel) {
		for(int i=0;i<list.size();i++) {
			Person p = list.get(i);
			if(p.getTel().startsWith(tel)) {
				list.remove(i);
				break;
			}
		}
	}
	public void updatePerson(String tel,Person p) {
		//업데이트가 뭘로 될지 모르므로 Person으로 정의
		for(int i=0;i<list.size();i++) {
			Person per = list.get(i);
			if(p.getTel().startsWith(tel)) {
				list.set(i,p);
				break;
			}
		}}

}
