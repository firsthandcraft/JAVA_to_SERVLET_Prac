package step5;

class WorkThread1 extends Thread{
	public boolean work = true;
	
	//method
	public WorkThread1(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName()+"작업처리 : ");
			} else {
				Thread.yield();
			}
		}
	}
	
	
}

public class TestThread58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorkThread workThreadA=new WorkThread("workThreadA");
		WorkThread workThreadB=new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			workThreadA.work=false;
		}
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e) {
			workThreadB.work=false;
		}

	}}
