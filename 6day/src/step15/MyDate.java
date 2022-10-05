package step15;

public class MyDate {
	private int day = 3;
	private int month =3;
	private int year=1999;
	
	//기본생성자 생성
	//기본 생성자는 뚜껑 막어만 준것
	//아무것도 안하고 넘어가고 싶을때
	public MyDate() {
		super();
	}
	
	
	// 인자값 있는 상황에서 
	// overloading
	//매개변수를 가진 생성자 값을 할당 시킬수 있다. 
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//setget 메소드 만들기 
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}
