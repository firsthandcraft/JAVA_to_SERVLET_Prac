package step10;

public class protectedTest2 {

	//protected 불러오기 같은 패키지
	public void method() {
		protectedTest01 a= new protectedTest01();
		a.field="value";
		a.method();
	}
}
