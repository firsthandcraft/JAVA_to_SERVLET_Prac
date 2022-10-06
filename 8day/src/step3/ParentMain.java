package step3;

public class ParentMain {
public static void main(String[] args) {
	Parent p =new Parent();//Parent 생성자
	p.name="부모";
	p.age=50;
	p.setMoney(100000);
	p.printParentInfo();//name 부모//age 50
	System.out.println(p.getMoney());//100000
	System.out.println("===============");
	
	Child c =new Child();//Parent 생성자//Child
	c.name="자식";
	c.age=200;
	c.setHobby("기타");
	c.printParentInfo();//name자식//age200//hobby기타
		
}
}

