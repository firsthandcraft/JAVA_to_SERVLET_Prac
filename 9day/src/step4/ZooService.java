package step4;
public class ZooService {
	
	public void enter(Animal a){
		a.eat();
		a.play();
		
		if(a instanceof Person) {
			Person p= (Person)a;
			p.tickerting();
			((Person)a).tickerting();
		}
	}

}
