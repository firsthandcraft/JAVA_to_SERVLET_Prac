package step8;

public class crudTest {

/* ���
 * �˻�
 * ��ü���
 * ����
 * ����--> ���߿�
 * ����
 * */
	//Ŭ�������� �����
	//���� name. tel addr
	String name;
	String tel;
	String addr;
	
	//�޼ҵ� ����� 
	// search �˻�
	boolean search(String name) {
		if(name.equals(name)) {
			return true;			
		} else {
			return false;
		}
	}
	//�˻��� ������ ���
	//print  ��ü���
	void print() {
		System.out.println(name);
		System.out.println(tel);
		System.out.println(addr);
	}
	
	//edit  ����
	boolean edit(String name, String tel, String addr) {//
		boolean f;
		f =search(name);//f�� name �� ��´�. 
		if(f==true) {
			this.tel = tel;//this �� ���� ���� �� ���δ�. 
			this.addr=addr;
		}
		return f;
		
	}
	
	
}
