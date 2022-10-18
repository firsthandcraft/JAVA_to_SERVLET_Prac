package step5;

class Worker implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			//이전 예제처럼 Thread를 상속받지 않았으므로 바로 getName()호출할수 없다. 
			//currentThread()호출 할수 없다. 
			//currentThread()를 응용해서 소지섭 worker run 0
			//String name= Thread.currentThread().getName();
			//static이므로Thread 클래스 명으로 접근
					
			System.out.println(Thread.currentThread().getName()+"worker run..."+i);
		}
	}
}

public class TestThread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker worker1 = new Worker();
		Thread t1 = new Thread(worker1,"소지섭");
		//우선권
		//1-10까지 숫자 가 높을 수록 우선권
		System.out.println("우선순위"+t1.getPriority());//기본세팅이 5로 세팅된다.
		
		Thread t2 = new Thread(worker1,"-------");
		t2.setPriority(Thread.MAX_PRIORITY);//10
		t1.start();
		t2.start();
		System.out.println("main");
		/*우선순위5
		main
		-------worker run...0
		-------worker run...1
		소지섭worker run...0
		-------worker run...2
		소지섭worker run...1
		-------worker run...3
		소지섭worker run...2
		-------worker run...4
		소지섭worker run...3
		-------worker run...5
		소지섭worker run...4
		-------worker run...6
		소지섭worker run...5
		-------worker run...7
		-------worker run...8
		-------worker run...9
		소지섭worker run...6
		소지섭worker run...7
		소지섭worker run...8
		소지섭worker run...9
		 	*/
	}}
