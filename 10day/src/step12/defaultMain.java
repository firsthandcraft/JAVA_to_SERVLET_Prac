package step12;


interface RemoteControl {
	//상수
	int MAX_VOLUME=10;
	int MIN_VOLUME =0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void SetVolume(int volume);

	//디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else{
			System.out.println("무음해제합니다.");
		}
	}
}
 class Television implements RemoteControl{
	 int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetVolume(int volume) {
		// TODO Auto-generated method stub
		//추상 메소드 오버라이딩
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		System.out.println("현재 Audio 볼륨"+volume);
	}
	//추가 필드 선언
	private int memoryVolume;
	@Override
	public 	void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume=this.volume;
			System.out.println("무음처리합니다.");
			SetVolume(RemoteControl.MIN_VOLUME);
		} else{
			System.out.println("무음해제합니다.");
			SetVolume(this.memoryVolume);
		}
	}

}


public class defaultMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.setMute(true);//무음처리합니다.
		rc.setMute(false);//무음해제합니다.
		
		System.out.println();
		
		
		rc.turnOn();
		rc.SetVolume(0);
		rc.setMute(true);
		rc.setMute(false);
	}

}
