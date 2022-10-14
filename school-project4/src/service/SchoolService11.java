package service;

import java.util.ArrayList;

import vo.Person;
import vo.Student;
import exception.DuplicateTelException;
import exception.PersonNotFoundException;

public class SchoolService {
	private ArrayList<Person> list = new ArrayList<Person>();

	/**
	 * 학교 구성원을 추가하는 메서드 동일한 번호의 구성원이 추가되려고 하면 DuplicateTelException을 발생(throw)시키고
	 * throws 한다.
	 */

	// throw(메세지), throws()

	public void addPerson(Person p) throws DuplicateTelException {
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			if (p.getTel().equals(per.getTel())) {
				throw new DuplicateTelException("똑같은 번호가 있다.추가X");
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
			throw new PersonNotFoundException("찾는 사람이 업다.");
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
			throw new PersonNotFoundException("삭제할 사람이 없다.");
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
			throw new PersonNotFoundException("수정할 사람 없다.");
		}
	}


}
