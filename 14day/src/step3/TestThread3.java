package step3;

class Worker extends Thread{
	Worker(String name){
		super(name);
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"worker run..."+i);
		}
	}
}

public class TestThread3 {
public static void main(String[] args) { 

	Worker w = new Worker("소지섭");//3번째5번째 
	w.start();
	
	Worker w2 = new Worker("시용태");//2번째4번째...
	w2.start();
	
	System.out.println("main 종료");//1번째
	/*  main 종료
		시용태worker run...0
		소지섭worker run...0
		시용태worker run...1
		소지섭worker run...1
		시용태worker run...2
		소지섭worker run...2
		시용태worker run...3
		소지섭worker run...3*/
	
}}
