package step8;

public class PublicTest {

	//�޼ҵ忡 private���̸� ����� public ��� -�ܺ��� ���� �޾ƿ���
	//���� ������ private ���
	
	//���� 2�� ����� 
	public int x;
	private int y;
	
	//������ �����
	public PublicTest(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public void print(){
		setValue();
		System.out.println("x="+x+"y="+y);
	}

	//�޼ҵ忡 private�Ⱦ� ������
	private void setValue(){//���ο��� ȣ���� �ȵȴ�.
		//private �ܺηκ��� �����ֱ� ������ �ܺη� ���� ���� �޾��ش�.
		//Ŭ���� �ȿ����� ����. �ۿ��� ���� �Ұ�
		
		x=100;
		y=100;	
	}
	

}
