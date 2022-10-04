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
	
	//생성자
	
	
	//매소드
	public int add() {return x+y;}
	public int sub() {return x-y;}
	public int mul() {return x*y;}
	public float div() {return (float)x/y;}
	
	
	/*	System.out.println("두개의 숫자를 입력하여 계산기 만들기");

	System.out.println("첫 숫자를 입력하세요.");
	a = sc.nextInt();
	System.out.println("두번째 숫자를 입력하세요.");
	b = sc.nextInt();
	System.out.println("부호를 입력하세요 : ");
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
