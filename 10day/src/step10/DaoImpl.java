package step10;

public class DaoImpl implements Dao{
	private int index;
	private MemberVo p[]=new MemberVo[10];
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("DaoImp1이 접속했습니다.");
	}

	@Override
	public void addPerson(MemberVo p) {
		// TODO Auto-generated method stub
		this.p[index]=p;
		index++;
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		for(int i =0;i<index;i++) {
			System.out.println(p[i]);
		}
	}

	@Override
	public MemberVo findPerson(String name) {
		// TODO Auto-generated method stub
		MemberVo per=null;
		for(int i=0; i<index;i++) {
			if(p[i].getName().equals(name)) {
				per=p[i];
			}
		}
		return per;
	}
}
