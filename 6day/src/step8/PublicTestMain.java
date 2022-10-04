package step8;

public class PublicTestMain {
public static void main(String[] args) {
		//객체 생성하기 
	
	PublicTest t= new PublicTest(10,10);//안에 매개변수 안쓰면 오류 
	t.x=20;
	
	//private 라서 오류나옴
	//t.y=20;//the field PublicTest is nor visible
	
	//t.setValue();///the field setValue is nor visible

	t.print();//x=100y=100

}
}
