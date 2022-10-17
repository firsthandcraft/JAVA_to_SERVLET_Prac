package service;

import java.util.HashMap;
import java.util.Iterator;

import vo.Person;

public class SchoolService {
	private HashMap map = new HashMap();

	public void addPerson (Person p){
		if(map.containsKey(p.getTel())) {
			System.out.println(p.getTel()+"동일번호 잇디");
		}else {
			map.put(p.getTel(),p);
		}
	}
	public void PrintAll() {
		Iterator it =map.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public Person findPerson(String tel){
		Person p= (Person)map.get(tel);
		return p;
	}
	public void deletPerson(String tel){
		map.remove(tel);
	}
	public void updatePerson(String tel,Person p){
		if(map.containsKey(tel)) {
			map.remove(tel);
			this.addPerson(p);
			
		}else {
			System.out.println(p.getTel()+"update할 필요 없다.");
		}
		}

}
