package step3;

public class Child extends Parent{
	public String hobby;
	public void print() {
		System.out.println("child");
		System.out.println("name"+name);
		System.out.println("age"+age);
	}
	
//test메소드가 구현이 안되어서 test메소드만 가져온
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("hobby"+hobby);
	}

	public void parentPrint() {
		super.print();
	}
}
