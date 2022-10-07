package step6;

import step4.Animal;
import step4.Monkey;
import step4.Person;
import step4.Tiger;

public class TestPoly7 {
public static void main(String[] args) {
	ZooService2 zoo = new ZooService2();
	Animal a[]= {new Monkey()
			
			,new Person(),new Tiger()};
	zoo.pass(a);
	
}}

