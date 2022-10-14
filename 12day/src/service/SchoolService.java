package service;

import java.util.ArrayList;

import vo.Person;

public class SchoolService {
	private ArrayList<Person>list=new ArrayList<Person>();
	//<>���ʸ�
	
	public void addPerson(Person p) {
		boolean flag = false;
		for(int i =0; i<list.size();i++) {
			Person per = list.get(i);
			if(p.getTel().equals(per.getTel())) {
				flag=true;//������ ��ȣ ����
			}
		}
		if(flag==false) {
			list.add(p);//������ ��ȭ��ȣ�� ������ �߰�
		} else {
			System.out.println("������ ��ȣ�� �ִ�.");
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
		//������Ʈ�� ���� ���� �𸣹Ƿ� Person���� ����
		for(int i=0;i<list.size();i++) {
			Person per = list.get(i);
			if(p.getTel().startsWith(tel)) {
				list.set(i,p);
				break;
			}
		}}

}
