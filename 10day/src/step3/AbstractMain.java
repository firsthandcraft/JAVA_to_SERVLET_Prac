package step3;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GrandParent gp = new Child();
		gp.name="grand papa";
		gp.age=90;
		gp.print();
		gp.test();
		System.out.println("===============");
		
		
		Child c = new Child();
		c.name="child momo";
		c.age=10;
		c.print();
		System.out.println("===============");
		c.test();
		System.out.println("===============");
		c.parentPrint();
		/*child
		namegrand papa
		age90
		hobbynull
		===============
		child
		namechild momo
		age10
		===============
		hobbynull
		===============
		parent
		namechild momo
		*/
	}

}
