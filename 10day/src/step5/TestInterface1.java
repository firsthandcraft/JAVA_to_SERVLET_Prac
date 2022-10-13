package step5;

public class TestInterface1 {
public static void main(String[] args) {
	
	
	//인터페이스 -> 계층구조 형성 -> 다형성 적용가능->표준화
	//상위 인터페이스 타입 변수로 하위 객체 참조 가능
	Flyer f1 = new SuperMan();
	f1.fly();//슈퍼맨이 날다!~ㄴㄴ
	
	Flyer f2 = new Bird();
	f2.fly();//새가 날다.
	
	//Flyer 인터페이스 타입의 배열에 하위 객체들 추가 가능
	Flyer fa[]= {f1,f2};
	for(int i =0; i<fa.length;i++) {
		fa[i].fly();
		System.out.println(f1 instanceof Flyer);
	}
	
}}
