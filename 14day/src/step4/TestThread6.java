package step4;

public class TestThread6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Thread chatThread = new Thread() {
				@Override
				public void run() {
					System.out.println(getName()+"����");
				}
			};
			chatThread.setName("chat-thread");
			chatThread.start();//chat-thread����
			
			

		

	
	}

}
