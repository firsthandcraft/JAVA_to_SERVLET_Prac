package step6;

import step4.Animal;
import step4.Person;

public class ZooService2 {
	public void pass(Animal [] a){
		
		for(int i =0;i<a.length;i++) {
			System.out.println();
			System.out.println(a[i]);
	
			if(a[i] instanceof Person) {
				//downcasting
				//�θ� �ڽ��� Ÿ���� �������� ���� 
				Person p= (Person)a[i];
				p.tickerting();
			}
			a[i].eat();
			a[i].play();
		}
		
		
	}
}
