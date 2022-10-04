package step5;

public class MemberMain {
public static void main(String[] args) {
	
	
	Member m= new Member();//생성자 호출
	m.print();
	/* 생성자는 초기화 하고 끝남
	name : no name
	tel : no tel
	address : no address
	*/
	System.out.println("-----------");
	m.setMemberData("홍길동", "010-1234-4567", "독산");
	m.print();
	/*	name : 홍길동
		tel : 010-1234-4567
		address : 독산
	 */
}
}
