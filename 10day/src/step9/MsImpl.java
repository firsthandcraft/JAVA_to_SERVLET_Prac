package step9;

public class MsImpl implements DbInterface{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL ���� ");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL �˻�");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL �߰�");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL ����");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL ����");
	}

}
