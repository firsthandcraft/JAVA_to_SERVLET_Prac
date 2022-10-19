package step6;
class ReadWorker implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("서버에서 데이터 읽는 스레드.."+i);
			try {
				Thread.sleep(1000);//1초
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
} 
class WrinteReadWorker implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("-------서버에서 데이터 쓰는 스레드.."+i);
			try {
				Thread.sleep(2000);//2초
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class TestThread6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadWorker rworker = new ReadWorker();
		Thread t1 = new Thread(rworker);
		Thread t2 = new Thread(new WrinteReadWorker());
		
		t1.start();
		try {
			t1.join();//t1스레트 수행 완료시까지 다른 스레드대기//메인도 대기함
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		System.out.println("main====end");
	}} 
