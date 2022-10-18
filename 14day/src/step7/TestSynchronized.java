package step7;
class Threrater implements Runnable{
	private boolean seat= false;
	/*synchronized ����ȭ 
	 *�ϳ��� �¼� ���� �ǽð� Ƽ���� �ϴ� �� ����
	 *��Ƽ ������ ��� ������ �����ϱ� ���� ���� �����带 ������*/
	@Override
	public void run() {
		// TODO Auto-generated method stub
		reserve();
	}
	//Rock() �ɱ�
	public synchronized void reserve() {
		String name= Thread.currentThread().getName();
		System.out.println(name+"������ ����ó�� ���� ...");
		//false�̸� ���� ����
		if(seat== false) {
			System.out.println(name+"������ ���ż���");
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			seat = true;
			
		}  else {
			System.out.println(name+"������ ���� ����");
		}
	}


}

public class TestSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threrater th = new Threrater();
		Thread t1 = new Thread(th,"������");
		Thread t2 = new Thread(th,"��ڻ�");
		t1.start();
		t2.start();
		/*������������ ����ó�� ���� ...
		������������ ���ż���
		��ڻ罺���� ����ó�� ���� ...
		��ڻ罺���� ���� ����
		*/
	}}
