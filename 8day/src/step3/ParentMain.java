package step3;

public class ParentMain {
public static void main(String[] args) {
	Parent p =new Parent();//Parent ������
	p.name="�θ�";
	p.age=50;
	p.setMoney(100000);
	p.printParentInfo();//name �θ�//age 50
	System.out.println(p.getMoney());//100000
	System.out.println("===============");
	
	Child c =new Child();//Parent ������//Child
	c.name="�ڽ�";
	c.age=200;
	c.setHobby("��Ÿ");
	c.printParentInfo();//name�ڽ�//age200//hobby��Ÿ
		
}
}

