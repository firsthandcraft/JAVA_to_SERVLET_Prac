package step7;
class Threrater implements Runnable{
	private boolean seat= false;
	/*synchronized 동기화 
	 *하나의 좌석 정보 실시간 티켓팅 하는 거 제작
	 *멀티 스레드 당시 문제를 예방하기 위해 단일 스레드를 제한함*/
	@Override
	public void run() {
		// TODO Auto-generated method stub
		reserve();
	}
	//Rock() 걸기
	public synchronized void reserve() {
		String name= Thread.currentThread().getName();
		System.out.println(name+"스레드 예매처리 시작 ...");
		//false이면 예매 성공
		if(seat== false) {
			System.out.println(name+"스레드 예매성공");
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			seat = true;
			
		}  else {
			System.out.println(name+"스레드 예매 실패");
		}
	}


}

public class TestSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threrater th = new Threrater();
		Thread t1 = new Thread(th,"소지섭");
		Thread t2 = new Thread(th,"백박사");
		t1.start();
		t2.start();
		/*소지섭스레드 예매처리 시작 ...
		소지섭스레드 예매성공
		백박사스레드 예매처리 시작 ...
		백박사스레드 예매 실패
		*/
	}}
