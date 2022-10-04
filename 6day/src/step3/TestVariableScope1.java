package step3;

public class TestVariableScope1 {
	int i;//전역변수는 기본세팅이 0으로 된다.
	void test1() {
		System.out.println(i);
	}
	void test2() {
		int i = 1;
		System.out.println("test2지역변수 :"+i);
		System.out.println(this.i);//this 항상 전역변수에 주는것
		
	}
	//매게변수 만들기  // call by reference 값이 직접적으로 들어가는것이 아닌 복사해서 들어가는 것. 간접접근
	void test3(int i) {
		System.out.println("test3지역변수 : "+i);
		this.i =i;
		System.out.println(this.i);//this 항상 전역변수에 주는것 //2
	}
	
	void test4() {
		int j =3;
	}

	
	void test5() {
		this.i =i;
		System.out.println("test5:"+i);	
		//System.out.println(j);	
	}
	
	void test6() {
		//전역변수는 초기화 하지 x 셋팅0
		int k=0;
		String s= null;
		System.out.println(k);
		System.out.println(s);
	}
}
