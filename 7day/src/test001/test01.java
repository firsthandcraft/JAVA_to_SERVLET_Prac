package test001;

import java.util.Scanner;

class Airplane{
	public void start() {
		System.out.println("�����մϴ�.");
	}
	public void land() {
		System.out.println("�����մϴ�.");
	}
	public void fly() {
		System.out.println("�Ϲ� �����մϴ�.");
	}
	public void takeOff() {
		
		System.out.println("�̷��մϴ�.");
	}
}
class SupersonicAirplane extends Airplane{
	//static ������ �ʴ¼� final �������̵��� �ȵǴ¸޼ҵ�
	public static final int NORMAL =3;
	public static final int SUPERSONIC =5;
	public static final int STRATOSPHERE =4;
	
	
	//���� �ʵ� ����
	public int flyMode = NORMAL;
	
	//�żҵ� ������ 
	@Override
	public void fly(){
		if(flyMode==STRATOSPHERE) {
			System.out.println("�����ǿ� �����߽��ϴ�.");
		} else if(flyMode==SUPERSONIC){
			System.out.println("������ �����մϴ�.");
		}else {
			super.fly();
		}
	} 
	}
	



public class test01 {
 public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 SupersonicAirplane sa = new SupersonicAirplane();
	 int num;
	 System.out.println("1-9������ ����ӵ��� �Է��ϼ���:)");
	 
	 
	boolean flag =true;
	while(flag) {
		num=sc.nextInt();
		switch(num) {
		case 1:
			sa.start();
			break;
		case 2:
			sa.takeOff();
			break;
		case 3:
			sa.fly();
			break;
		case 4:
			sa.flyMode = SupersonicAirplane.STRATOSPHERE;
			sa.fly();
			break;
		case 5:
			sa.flyMode = SupersonicAirplane.SUPERSONIC;
			sa.fly();
			break;
		case 6:
			sa.land();
			break;
		default:
            System.out.println("�߸��Է��Ͽ����ϴ�.");
        }

	}
	 	
	 
}}


