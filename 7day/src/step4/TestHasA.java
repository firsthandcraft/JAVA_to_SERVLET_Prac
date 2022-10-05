package step4;

public class TestHasA {
public static void main(String[] args) {
	
	
	//Car가 포함되어있기 때문에 Person을 먼저 생성한다. 
	Person p = new Person();//인스턴스 변수 car, name
	p.setName("IU");
	p.setCar(new Car("k5","red"));
	System.out.println(p.getName());//IU
	System.out.println(p.getCar());//step4.Car@379619aa
	System.out.println(p.getCar().getModel());//k5
	System.out.println(p.getCar().getColor());//red
	
	p.getCar().setModel("sm5");
	p.getCar().setColor("black");
	System.out.println(p.getCar().getModel());//sm5
	System.out.println(p.getCar().getColor());//black
	
}
}
