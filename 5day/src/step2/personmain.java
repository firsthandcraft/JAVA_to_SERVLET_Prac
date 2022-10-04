package step2;

public class personmain {
	public static void main(String[] args) {
		person p =new person();//heap
		p.a=1;//q클래스 변수a에 접근해서 값을 넣어주기
		p.b=2;
		
		//클래스에 프린트한것을 호출하기
		p.print();
		
		
	}
}
