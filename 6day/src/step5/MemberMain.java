package step5;

public class MemberMain {
public static void main(String[] args) {
	
	
	Member m= new Member();//������ ȣ��
	m.print();
	/* �����ڴ� �ʱ�ȭ �ϰ� ����
	name : no name
	tel : no tel
	address : no address
	*/
	System.out.println("-----------");
	m.setMemberData("ȫ�浿", "010-1234-4567", "����");
	m.print();
	/*	name : ȫ�浿
		tel : 010-1234-4567
		address : ����
	 */
}
}
