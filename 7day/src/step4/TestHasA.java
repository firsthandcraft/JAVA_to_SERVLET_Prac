package step4;

public class TestHasA {
public static void main(String[] args) {
	
	
	//Car�� ���ԵǾ��ֱ� ������ Person�� ���� �����Ѵ�. 
	Person p = new Person();//�ν��Ͻ� ���� car, name
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
