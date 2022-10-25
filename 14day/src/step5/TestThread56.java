package step5;

class SumThread extends Thread{
	private long sum;
	//method
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum=sum;
	}
	@Override
	public void run() {
		for(int i =0;i<=100;i++) {
			sum+=i;
		}
	}
	
	
}

public class TestThread56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumThread sumThread=new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch(InterruptedException e) {
			
		}
		System.out.println("1-100의 합"+sumThread.getSum());
		
		//1-100의 합5050

	}}
