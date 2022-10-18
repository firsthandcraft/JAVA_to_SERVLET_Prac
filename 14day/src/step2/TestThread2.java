package step2;

import step2.Worker;

class Worker extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Worker run().."+i);
		
		try {
			Thread.sleep(1000);//1초
		} catch(InterruptedException e) {
			e.printStackTrace(); 
			}
		}
	}
}

public class TestThread2 {
public static void main(String[] args) {
	Worker w = new Worker();
	w.start();
	System.out.println("종료");// 1초마다Thread가 생성
	/*종료
		Worker run()..0
		Worker run()..1
		Worker run()..2
		Worker run()..3
		Worker run()..4
		Worker run()..5
		Worker run()..6
		Worker run()..7
		Worker run()..8
		Worker run()..9*/
}
}
