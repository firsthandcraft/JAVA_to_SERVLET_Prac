package step3;

public abstract class Parent extends GrandParent {
	//�ϳ��� ���� �Ұ�� �ڽ��� ��� ��ӹ������� �����ؾ��Ѵ�.
	//�ϳ��� ������ ��� ������ ������ �ߴµ� 
	//abstract�� parent�� �ٿ��ָ� �ȴ�.

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("parent");
		System.out.println("name"+name);
	}

	
}
