package step3;

public class Child extends Parent{
	public String hobby;
	public void print() {
		System.out.println("child");
		System.out.println("name"+name);
		System.out.println("age"+age);
	}
	
//test�޼ҵ尡 ������ �ȵǾ test�޼ҵ常 ������
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("hobby"+hobby);
	}

	public void parentPrint() {
		super.print();
	}
}
