package step6;

public class Member2Main {
public static void main(String[] args) {
	
	Member2 m1= new Member2();
	m1.print();
	/*  nameno name
		telno tel
		addressno address*/
	
	Member2 m2= new Member2("아이유");
	m2.print();
	/*  name아이유
		telon tel
		addressno address*/
	Member2 m3= new Member2("아이유","010-3210-3210","가산");
	m3.print();
	/*  name아이유
		tel010-3210-3210
		address가산 */
	
	//Member2 m4= new Member2("","123-456");
	//m2.print();
	//오류뜸
	
}
}
