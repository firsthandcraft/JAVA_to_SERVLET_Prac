package test001;

import java.util.Scanner;

class Airplane{
	public void start() {
		System.out.println("출항합니다.");
	}
	public void land() {
		System.out.println("착륙합니다.");
	}
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	public void takeOff() {
		
		System.out.println("이륙합니다.");
	}
}
class SupersonicAirplane extends Airplane{
	//static 변하지 않는수 final 오버라이딩이 안되는메소드
	public static final int NORMAL =3;
	public static final int SUPERSONIC =5;
	public static final int STRATOSPHERE =4;
	
	
	//상태 필드 선언
	public int flyMode = NORMAL;
	
	//매소드 재정의 
	@Override
	public void fly(){
		if(flyMode==STRATOSPHERE) {
			System.out.println("성층권에 도입했습니다.");
		} else if(flyMode==SUPERSONIC){
			System.out.println("초음속 비행합니다.");
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
	 System.out.println("1-9까지의 비행속도를 입력하세요:)");
	 
	 
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
            System.out.println("잘못입력하였습니다.");
        }

	}
	 	
	 
}}


