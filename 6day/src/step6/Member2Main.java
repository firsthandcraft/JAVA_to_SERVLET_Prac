package step6;

public class Member2Main {
public static void main(String[] args) {
	
	Member2 m1= new Member2();
	m1.print();
	/*  nameno name
		telno tel
		addressno address*/
	
	Member2 m2= new Member2("������");
	m2.print();
	/*  name������
		telon tel
		addressno address*/
	Member2 m3= new Member2("������","010-3210-3210","����");
	m3.print();
	/*  name������
		tel010-3210-3210
		address���� */
	
	//Member2 m4= new Member2("","123-456");
	//m2.print();
	//������
	
}
}
