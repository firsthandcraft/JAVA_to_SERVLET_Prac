package step1;

class Thread11 extends Thread{//���1 TreadŬ������ ����ؼ� �����带 ����
	public void run() {
		for(int i = 0; i<5;i++) {
		 	System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable{//���2 Runnable�������̽��� �����ؼ� �����带 ���� 

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
	
	
	//���2 ����
	Runnable r = new ThreadEx1_2();
	Thread t2 = new Thread(r);
	
	t1.start();
	t2.start();
	
	
}}
