//class 상속p286

package step11;

 class Phone{
	//필드 선언 
	private String model;
	private String color;
	
	//생성자 생성
	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	//메소드
	public void bell() {
		System.out.println("bzzzzzzzzzzzz");
	}
	public void sendVoice(String message) {
		System.out.println("자기 :"+message);
	}
	public void receiveVoice(String message) {
		System.out.println("벨이 울립니다."+message);
	}
	public void hangUp() {
		System.out.println("hangup");
	}
//	public void info() {
//        System.out.println("model : "+model+"\t color: "+color);//super부모를 가리킨다. 
//        
//    }
	@Override
	public String toString() {
		return "model=" + model + "\t color=" + color;
	}
	

}
//class 선언2
 class SmartPhone extends Phone{
	private boolean wifi;
	//생성자 선언
	public SmartPhone(String model,String color,boolean wifi) {
		super(model, color);
		this.wifi = wifi;
	}
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다. ");
	}
	
	public void internet(){
		System.out.println("인터넷에 연결합니다.");
	}
	@Override
	public String toString() {
		return super.toString() + "\t wifi =" + wifi;
	}
	
}
 
public class ch07Sec02 {
public static void main(String[] args) {
	Phone phone = new Phone("iphone", "spaceGray");
	SmartPhone myPhone=new SmartPhone("galaxy", "silver",false);
	
	//iphone으로 부터 상속받은 필드 읽기
	System.out.println(myPhone.toString());
	myPhone.bell();
	myPhone.sendVoice("hello");
	myPhone.receiveVoice("Hey I'm Han");
	myPhone.sendVoice("Hey~ hang on a minutes");
	myPhone.hangUp();
	myPhone.setWifi(true);
	myPhone.internet();
	
}
}
