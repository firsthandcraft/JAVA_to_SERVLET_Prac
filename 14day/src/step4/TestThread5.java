package step4;

public class TestThread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �̸� �ٲٱ�
		Thread mainthread = Thread.currentThread();
		
		for(int i= 0; i<3;i++){
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName()+"����"); 
				}
				
			};
			threadA.start();
		}//Thread-0���� Thread-2����  Thread-1����
	
			Thread chatThread = new Thread() {
				@Override
				public void run() {
					System.out.println(getName()+"����");
				}
			};
			chatThread.setName("chat-thread");
			chatThread.start();//chat-thread����
			
			
		System.out.println(mainthread.getName()+"����");//main����
		

	
	}

}
