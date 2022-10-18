package step1;

class Worker extends Thread{ 
	public void run() {
		for(int i = 0; i<10;i++) {
		 	System.out.println("work run()...."+i);
		}
	}
}

class Test{
	public void test() {
		for(int i = 0; i<10;i++) {
			System.out.println("Test test()...."+i);
		}
	}
}


public class TestThread1 {
public static void main(String[] args) {
	
	Test t = new Test();
	t.test();
	
	Worker w = new Worker();
	w.start();
	
	System.out.println("main종료");
	
	//main Test 클래스가 먼저 실행되고 추후 thread가 있는 Work가 실행된다.
	/*Test test()....0
		Test test()....1
		Test test()....2
		Test test()....3
		Test test()....4
		Test test()....5
		Test test()....6
		Test test()....7
		Test test()....8
		Test test()....9
		main종료
		work run()....0
		work run()....1
		work run()....2
		work run()....3
		work run()....4
		work run()....5
		work run()....6
		work run()....7
		work run()....8
		work run()....9*/
}}
