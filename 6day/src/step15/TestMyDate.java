package step15;

public class TestMyDate {
public static void main(String[] args) {
	
	//객체 클래스 불러오기 
	MyDate date = new MyDate(1,2,3000);
	System.out.println(date.getDay());//1
	System.out.println(date.getMonth());//2
	System.out.println(date.getYear());//3000
	
	//아무것도 안하고 넘어가고 싶을때
	//기본 생성자가 있어서 메소드 없어도 됨
	MyDate d1 = new MyDate();
	System.out.println(d1.getDay());//3
	System.out.println(d1.getMonth());//3
	System.out.println(d1.getYear());//1999
	
	
}
}
