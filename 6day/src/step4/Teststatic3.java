package step4;
class Test{
	int i; //전역변수
	static int j;//static 변수 
	
	static void test() {
		System.out.println(j);//0
		//static은 자신의 클래스 안이라도 객체 생성해야함
		//System.out.println();static method 내부이므로
		//인스턴스 변수 i에 접근불가 --> 객제 생성 필요
		//static 은 객체 관계없이 모두 처음 메모리에 객체
	}
	void test2() {
		System.out.println(j);//0
	}
}


public class Teststatic3 {
public static void main(String[] args) {
	
	Test.test();
	Test t =new Test();
	t.test2();
}
}
