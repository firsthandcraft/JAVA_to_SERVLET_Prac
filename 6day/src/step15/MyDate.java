package step15;

public class MyDate {
	private int day = 3;
	private int month =3;
	private int year=1999;
	
	//�⺻������ ����
	//�⺻ �����ڴ� �Ѳ� ��� �ذ�
	//�ƹ��͵� ���ϰ� �Ѿ�� ������
	public MyDate() {
		super();
	}
	
	
	// ���ڰ� �ִ� ��Ȳ���� 
	// overloading
	//�Ű������� ���� ������ ���� �Ҵ� ��ų�� �ִ�. 
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//setget �޼ҵ� ����� 
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
