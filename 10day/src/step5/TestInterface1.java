package step5;

public class TestInterface1 {
public static void main(String[] args) {
	
	
	//�������̽� -> �������� ���� -> ������ ���밡��->ǥ��ȭ
	//���� �������̽� Ÿ�� ������ ���� ��ü ���� ����
	Flyer f1 = new SuperMan();
	f1.fly();//���۸��� ����!~����
	
	Flyer f2 = new Bird();
	f2.fly();//���� ����.
	
	//Flyer �������̽� Ÿ���� �迭�� ���� ��ü�� �߰� ����
	Flyer fa[]= {f1,f2};
	for(int i =0; i<fa.length;i++) {
		fa[i].fly();
		System.out.println(f1 instanceof Flyer);
	}
	
}}
