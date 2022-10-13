package step9;

public class OracleImpl implements DbInterface {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("oracle 연결 ");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("oracle 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("oracle 추가");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("oracle 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("oracle 삭제");
	}
	
	

}
