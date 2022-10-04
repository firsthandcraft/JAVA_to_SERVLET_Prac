package step4;

class Company{//한 클래스당 하나씩 선언 . static은 공간을 만듬 . 
	//데이터 베이스 에서 많이 쓴다. 
	
	
	static int i=1;
	static int v=1;
	
	//매소드 만들기
	static void test() {
		//static은 new를 안사용하고 바로 접근이 가능함
		System.out.println("static test");
	}
}


public class TestStatic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company.test();//static test
		System.out.println(Company.i);
		
		
	}

}
