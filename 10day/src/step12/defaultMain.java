package step12;


interface RemoteControl {
	//���
	int MAX_VOLUME=10;
	int MIN_VOLUME =0;
	
	//�߻�޼ҵ�
	void turnOn();
	void turnOff();
	void SetVolume(int volume);

	//����Ʈ �ν��Ͻ� �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ�.");
		} else{
			System.out.println("���������մϴ�.");
		}
	}
}
 class Television implements RemoteControl{
	 int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetVolume(int volume) {
		// TODO Auto-generated method stub
		//�߻� �޼ҵ� �������̵�
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		System.out.println("���� Audio ����"+volume);
	}
	//�߰� �ʵ� ����
	private int memoryVolume;
	@Override
	public 	void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume=this.volume;
			System.out.println("����ó���մϴ�.");
			SetVolume(RemoteControl.MIN_VOLUME);
		} else{
			System.out.println("���������մϴ�.");
			SetVolume(this.memoryVolume);
		}
	}

}


public class defaultMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̽� ���� ����
		RemoteControl rc;
		
		//Television ��ü�� �����ϰ� �������̽� ������ ����
		rc = new Television();
		rc.setMute(true);//����ó���մϴ�.
		rc.setMute(false);//���������մϴ�.
		
		System.out.println();
		
		
		rc.turnOn();
		rc.SetVolume(0);
		rc.setMute(true);
		rc.setMute(false);
	}

}
