package step10;

public class TestObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVo vo1 = new MemberVo("aaa","bbb","ddd","nnn");
		MemberVo vo2 = new MemberVo("www","ggg","aaa","sss");
	
		System.out.println(vo1);//MemberVo [id=aaa, password=bbb, name=ddd, address=nnn]
		System.out.println(vo2);//MemberVo [id=www, password=ggg, name=aaa, address=sss]
	}

}
