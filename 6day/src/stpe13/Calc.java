package stpe13;

public class Calc {
	private int x;
	private int y;
	private String c;
	
	public Calc(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		
	}
	
	//������
	
	
	//�żҵ�
	public int add() {return x+y;}
	public int sub() {return x-y;}
	public int mul() {return x*y;}
	public float div() {return (float)x/y;}
	
	
	/*	System.out.println("�ΰ��� ���ڸ� �Է��Ͽ� ���� �����");

	System.out.println("ù ���ڸ� �Է��ϼ���.");
	a = sc.nextInt();
	System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
	b = sc.nextInt();
	System.out.println("��ȣ�� �Է��ϼ��� : ");
	c = sc.next();
	if(c.equals("+")) {
	    System.out.println(a+b);
	} else if(c.equals("-")) {
	    System.out.println(a-b);
	} else if(c.equals("*")) {
	    System.out.println(a*b);
	} else if(c.equals("/")) {
	    System.out.println((float)a/b);
	}
	
	}

	 * */
}
