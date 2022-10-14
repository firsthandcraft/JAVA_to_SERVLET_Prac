package test;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import service.SchoolService2;
import vo.Person;
import vo.Student;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SchoolService service =new SchoolService();
		SchoolService2 service =new SchoolService2();
		try {
			service.addPerson(new Student("011","아이유","종로","12"));
			System.out.println("add ok");
		} catch(DuplicateTelException de) {
			System.out.println(de.getMessage());
		}
		
		try {
			service.addPerson(new Student("101","보아","가산","1012"));
			System.out.println("add ok");
		} catch(DuplicateTelException de) {
			System.out.println(de.getMessage());
		}
		try {
			service.addPerson(new Student("010","에이","판교","012"));
			System.out.println("add ok");
		} catch(DuplicateTelException de) {
			System.out.println(de.getMessage());
		}
		
		service.PrintAll();

		
		try {
			Person p= service.findPerson("010");
			System.out.println("find"+p);
		} catch(PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}		
		
		try {
			service.deletPerson("010");
			System.out.println("delete");
		} catch(PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			service.updatePerson("011",new Student("019","ddd","sss","aaa"));
			System.out.println("update");
		} catch(PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
}}
