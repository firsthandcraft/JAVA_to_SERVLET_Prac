package step4;

public class TestThread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스레드 이름 바꾸기
		Thread mainthread = Thread.currentThread();
		
		for(int i= 0; i<3;i++){
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName()+"실행"); 
				}
				
			};
			threadA.start();
		}//Thread-0실행 Thread-2실행  Thread-1실행
	
			Thread chatThread = new Thread() {
				@Override
				public void run() {
					System.out.println(getName()+"실행");
				}
			};
			chatThread.setName("chat-thread");
			chatThread.start();//chat-thread실행
			
			
		System.out.println(mainthread.getName()+"실행");//main실행
		

	
	}

}
