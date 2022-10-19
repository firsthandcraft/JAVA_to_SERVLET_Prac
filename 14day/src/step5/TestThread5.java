package step5;

class Worker implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			//���� ����ó�� Thread�� ��ӹ��� �ʾ����Ƿ� �ٷ� getName()ȣ���Ҽ� ����. 
			//currentThread()ȣ�� �Ҽ� ����. 
			//currentThread()�� �����ؼ� ������ worker run 0
			//String name= Thread.currentThread().getName();
			//static�̹Ƿ�Thread Ŭ���� ������ ����
					
			System.out.println(Thread.currentThread().getName()+"worker run..."+i);
		}
	} 
}

public class TestThread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker worker1 = new Worker();
		Thread t1 = new Thread(worker1,"������");
		//�켱��
		//1-10���� ���� �� ���� ���� �켱��
		System.out.println("�켱����"+t1.getPriority());//�⺻������ 5�� ���õȴ�.�켱����5
		
		Thread t2 = new Thread(worker1,"-------");
		t2.setPriority(Thread.MAX_PRIORITY);//10
		t1.start();
		t2.start();
		System.out.println("main");
		/*�켱����5
		main
		-------worker run...0
		-------worker run...1
		������worker run...0
		-------worker run...2
		������worker run...1
		-------worker run...3
		������worker run...2
		-------worker run...4
		������worker run...3
		-------worker run...5
		������worker run...4
		-------worker run...6
		������worker run...5
		-------worker run...7
		-------worker run...8
		-------worker run...9
		������worker run...6
		������worker run...7
		������worker run...8
		������worker run...9
		 	*/
	}}
