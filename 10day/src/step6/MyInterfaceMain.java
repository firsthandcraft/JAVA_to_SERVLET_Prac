package step6;

public class MyInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyImplements m = new MyImplements();
		m.mul();
		
		System.out.println("add()�� ������� = "+m.add());
		/*mul()�� ���� ��� = 24
		  add()�� ������� = 46*/
		System.out.println(MyInterface1.SIZE);//10
		System.out.println(MyInterface2.MAX);//5
	}}
