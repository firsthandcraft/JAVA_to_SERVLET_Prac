package step11;

public class TestConstructor {
public static void main(String[] args) {
	Person p =new Person("������");
	
	System.err.println(p.getName());
	p.setName("����");
	//�����ڸ� ���� ���� �Ҵ��ϵ�  set�޼ҵ带 ���� �Ҵ��ϵ� ���� ����.
	//�����ڸ� ���� �Ҵ�� setmethod�� ���� �Ҵ��� ��������� ����
	//�뵵�� �־� ���̴�?
	//�����ڿ��� ����� ���ڰ��� �Է����� ������ ������ ���� �� ��ü������ 
	//������ ���ڰ� �ִ� �����ڿ��� �䱸�Ѵ�. 
	//�����ڴ� �ʼ���
	//setmethod �� ������ �Ǵ� �������� 
	//�����ڴ� ���� �Ҵ�- ��ü ������ �ʼ��� ���
	//setMethod �� ���� �Ҵ� - �������� ���
	System.err.println(p.getName());
}
}
