//class ���p286

package step11;

 class Phone{
	//�ʵ� ���� 
	private String model;
	private String color;
	
	//������ ����
	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	//�޼ҵ�
	public void bell() {
		System.out.println("bzzzzzzzzzzzz");
	}
	public void sendVoice(String message) {
		System.out.println("�ڱ� :"+message);
	}
	public void receiveVoice(String message) {
		System.out.println("���� �︳�ϴ�."+message);
	}
	public void hangUp() {
		System.out.println("hangup");
	}
//	public void info() {
//        System.out.println("model : "+model+"\t color: "+color);//super�θ� ����Ų��. 
//        
//    }
	@Override
	public String toString() {
		return "model=" + model + "\t color=" + color;
	}
	

}
//class ����2
 class SmartPhone extends Phone{
	private boolean wifi;
	//������ ����
	public SmartPhone(String model,String color,boolean wifi) {
		super(model, color);
		this.wifi = wifi;
	}
	//�޼ҵ� ����
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("�������� ���¸� �����߽��ϴ�. ");
	}
	
	public void internet(){
		System.out.println("���ͳݿ� �����մϴ�.");
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
	
	//iphone���� ���� ��ӹ��� �ʵ� �б�
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
