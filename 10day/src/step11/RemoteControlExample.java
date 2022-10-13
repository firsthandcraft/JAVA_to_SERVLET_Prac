package step11;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RemoteControl rc =null;
		RemoteControl rc ;
		rc=new Television();
		rc.turnOn();
		System.out.println("--------------");
		rc=new Audio();
		rc.turnOn();
	}

}
