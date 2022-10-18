package step4;

import step4.ServiceWorker;

class ServiceWorker extends Thread{
	private int time;
	ServiceWorker(String name,int time){
		super(name);
		this.time=time;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(time);//매개변수를 받아온다.
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(getName()+"서버 스레드 서비스..."+i);
		}
	}
}

public class TestThread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceWorker worker1 = new ServiceWorker("소지섭",1000);//2번째3번째5번째
		worker1.start();
		
		ServiceWorker worker2 = new ServiceWorker("크리스마스",3000);//4번째(3초뒤 실행)6번째...14번째18번째
		worker2.start();
		
		System.out.println("main 종료");//1번째
	}

}
