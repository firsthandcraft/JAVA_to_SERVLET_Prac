package service;

import java.util.ArrayList;

import vo.Person;
import vo.Student;
import exception.DuplicateTelException;
import exception.PersonNotFoundException;

public class SchoolService {
	private ArrayList<Person> list = new ArrayList<Person>();

	/**
	 * �б� �������� �߰��ϴ� �޼��� ������ ��ȣ�� �������� �߰��Ƿ��� �ϸ� DuplicateTelException�� �߻�(throw)��Ű��
	 * throws �Ѵ�.
	 */

	// throw(�޼���), throws()

	public void addPerson(Person p) throws DuplicateTelException {
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			if (p.getTel().equals(per.getTel())) {
				throw new DuplicateTelException("�Ȱ��� ��ȣ�� �ִ�.�߰�X");
			}
		}
		list.add(p);
	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			System.out.println(list.get(i));
		}
	}

	public Person findPerson(String tel) throws PersonNotFoundException {
		Person p = null;
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			if (per.getTel().equals(tel)) {
				p = per;
			}
		}
		if (p == null) {
			throw new PersonNotFoundException("ã�� ����� ����.");
		} else {
			return p;
		}
	}

	public void deletePerson(String tel) throws PersonNotFoundException {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			if (per.getTel().equals(tel)) {
				list.remove(i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			throw new PersonNotFoundException("������ ����� ����.");
		}
	}

  
	public void updatePerson(String tel,Person p) throws PersonNotFoundException {
		boolean flag=false; 
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			if (per.getTel().equals(p.getTel())) {
				list.set(i, p);
				flag=true; 
				break; 
				
			}
		}
		
		if(flag=false) {
			throw new PersonNotFoundException("������ ��� ����.");
		}
	}


}
