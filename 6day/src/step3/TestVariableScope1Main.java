package step3;

public class TestVariableScope1Main {
 public static void main(String[] args) {
	
	 TestVariableScope1 t =new TestVariableScope1();
	 t.test1();//0 
	 t.test2();//test2지역변수 :1 0
	 t.test3(2);//안에 매게 변수 2를 넣어야 오류가 안뜬다.
	 // test3지역변수 :2 2
	 t.test4();//값이 없다. 
	 //t.test5();
	 //test4의 지역변수를 가져와 오류값이 뜬다. 
	 t.test6(); // 0 null
	 
	 
 }
}

