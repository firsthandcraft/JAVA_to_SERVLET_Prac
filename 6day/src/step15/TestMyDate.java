package step15;

public class TestMyDate {
public static void main(String[] args) {
	
	//��ü Ŭ���� �ҷ����� 
	MyDate date = new MyDate(1,2,3000);
	System.out.println(date.getDay());//1
	System.out.println(date.getMonth());//2
	System.out.println(date.getYear());//3000
	
	//�ƹ��͵� ���ϰ� �Ѿ�� ������
	//�⺻ �����ڰ� �־ �޼ҵ� ��� ��
	MyDate d1 = new MyDate();
	System.out.println(d1.getDay());//3
	System.out.println(d1.getMonth());//3
	System.out.println(d1.getYear());//1999
	
	
}
}
