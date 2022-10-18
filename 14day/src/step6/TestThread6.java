package step6;
class ReadWorker implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("�������� ������ �д� ������.."+i);
			try {
				Thread.sleep(1000);//1��
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
			System.out.println("-------�������� ������ ���� ������.."+i);
			try {
				Thread.sleep(2000);//2��
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
			t1.join();//t1����Ʈ ���� �Ϸ�ñ��� �ٸ� ��������//���ε� �����
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		System.out.println("main====end");
	}} 
