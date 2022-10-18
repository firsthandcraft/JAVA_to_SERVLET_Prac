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
				Thread.sleep(time);//�Ű������� �޾ƿ´�.
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(getName()+"���� ������ ����..."+i);
		}
	}
}

public class TestThread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceWorker worker1 = new ServiceWorker("������",1000);//2��°3��°5��°
		worker1.start();
		
		ServiceWorker worker2 = new ServiceWorker("ũ��������",3000);//4��°(3�ʵ� ����)6��°...14��°18��°
		worker2.start();
		
		System.out.println("main ����");//1��°
	}

}
