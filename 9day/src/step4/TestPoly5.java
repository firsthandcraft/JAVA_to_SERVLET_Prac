package step4;



public class TestPoly5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZooService zoo =new ZooService();
		zoo.enter(new Tiger());
		System.out.println("------------");
		zoo.enter(new Monkey());
		System.out.println("------------");
		zoo.enter(new Person());
		System.out.println("------------");
	
	}}
