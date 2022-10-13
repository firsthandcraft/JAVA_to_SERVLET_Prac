package step9;

public class MsImpl implements DbInterface{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL 연결 ");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL 추가");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MS-SQL 삭제");
	}

}
