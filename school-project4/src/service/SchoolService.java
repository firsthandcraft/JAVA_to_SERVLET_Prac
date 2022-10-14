package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService {
	private ArrayList<Person> list = new ArrayList<Person>();
	/**/
	//throw
	public void addPerson(Person p) throws DuplicateTelException {
		for(int i=0; i<list.size();i++) {
			Person per = list.get(i);
			if(p.getTel().equals(per.getTel())) {
				throw new DuplicateTelException("똑같은 번호가 있다. 추가x");
			} 
			
		}	
		list.add(p);//위치 에 대해 한번더 생각하기 문의 
	}
	public void PrintAll() {
		for(int i=0; i<list.size();i++) {
			Person per = list.get(i);
			System.out.println(list.get(i));
		}
	}
	public Person findPerson(String tel) throws PersonNotFoundException{
		Person p = null;
		for(int i=0; i<list.size();i++) {
			Person per = list.get(i);
			if(per.getTel().equals(tel)) {
				p=per;
			}
		}
		if(p==null) {
			throw new PersonNotFoundException("찾는사람 없다.");
		} else {
		return p;
		}
	}
	public void deletPerson(String tel) throws PersonNotFoundException{
		boolean flag=false;
		for(int i=0; i<list.size();i++) {
			Person per = list.get(i);
			if(per.getTel().equals(tel)) {
				list.remove(i);
				flag=true;
				break;
			}
			if(flag==false) {
				throw new PersonNotFoundException("삭제할 사람 없다.");
			} 
		}
	}
	public void updatePerson(String tel,Person p) throws PersonNotFoundException {
		boolean flag=false;
		for(int i=0; i<list.size();i++) {
			Person per = list.get(i);
			if(per.getTel().equals(p.getTel())) {
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
