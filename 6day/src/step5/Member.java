package step5;

public class Member {
	String name;
	String tel;
	String address;
	
	//�ƹ��͵� ���� ������
	public Member() {//source -> generate Constructor using field -���� üũ ����
		super();
		name="no name";
		tel ="no tel";
		address = "no address";
	}
	
	//������
	/*public Member(String name, String tel, String address) {
	 * //source -> generate Constructor using field -���� ��ü üũ
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}*/
	//�޼��� �߰� 
	void setMemberData(String _name,String _tel,String _address) {
		name=_name;
		tel=_tel;
		address=_address;
		
		//���� �Ű����� ������ �ȸ��߸� ���� ������ ����.
		//�ʼ� �׸� �����׸��� ������ 
		//�����׸� ���� ������ �ȳ��� ���� �����ڴ�default�� �ְ� ������ �ִ�. 
		//over loading https://hyoje420.tistory.com/14
	}
	
	//�޼ҵ� �߰� 
	void print() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
	
	

}
