package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService2 {
	private ArrayList<Person> list = new ArrayList<Person>();

	/**
	 * �б� �������� �߰��ϴ� �޼��� ������ ��ȣ�� �������� �߰��Ƿ��� �ϸ� DuplicateTelException�� �߻�(throw)��Ű��
	 * throws �Ѵ�.
	 */

	// throw(�޼���), throws()

	//�Ű������� �Ѿ�� ��ȣ�� ����Ʈ�� ���� ����� ��ȣ�� ���Ͽ� ���� ��ȣ�� ���
	//�� ������ -1�� ��ȯ add�� -1�̸� �߰� ���� ��ȣ�� ������ �ش� �ε����� ��ȯ
	//�ε��� ���� ã�� ���ؼ� -1(���°�)�� �ִ´�. 

	private int findIndex(String tel) {
		int index=-1; 
		for(int i=0; i<list.size(); i++) {
			Person per=list.get(i); 
			if(per.getTel().equals(tel)) {
				index=i; 
				break; 
			}
		}
		 return index; 
	}
	
	
	
	
	public void addPerson(Person p) throws DuplicateTelException {
		int i=findIndex(p.getTel());
		if(i==-1) {
			list.add(p); 
		}else {
	throw new DuplicateTelException("������ ��ȣ�� �����Ƿ� �߰� �Ұ�");
		}
		
		
	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			System.out.println(list.get(i));
		}
	}

	public Person findPerson(String tel) throws PersonNotFoundException {
		Person p =null; 
		int i=findIndex(tel); //
		if(i !=-1) 
			throw new PersonNotFoundException("ã�� ����� ����.");
		p=list.get(i); 
		return p; 
	}

	public void deletePerson(String tel) throws PersonNotFoundException {
		int i=findIndex(tel);
		if(i ==-1) 
			throw new PersonNotFoundException("ã�� ����� ����.");
		list.remove(i); 
	}

// tel�� ��ġ�Ǵ� ����Ʈ ������ ������ ���� ����- addPerson()
// tel�� ��ġ�Ǵ� ����Ʈ ������ �������� �ε��� - find, delete, 
	//updatePerson()
	
	public void updatePerson(String tel,Person p) throws PersonNotFoundException {
		int i=findIndex(tel);
		if(i ==-1) 
			throw new PersonNotFoundException("ã�� ����� ����.");
		list.set(i,p); 
	}

}
