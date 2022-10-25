package step1;

class Thread11 extends Thread{//방법1 Tread클래스를 상속해서 쓰레드를 구현
	public void run() {
		for(int i = 0; i<5;i++) {
		 	System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable{//방법2 Runnable인터페이스를 구현해서 스레드를 구현 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
}

//main
public class TestThread2 {
public static void main(String[] args) {
	Thread11 t1= new Thread11();
	
	
	//방법2 실행
	Runnable r = new ThreadEx1_2();
	Thread t2 = new Thread(r);
	
	t1.start();
	t2.start();
	
	
}}
