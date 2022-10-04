package step4;



public class Teststatic6 {
public static void main(String[] args) {
	

	System.out.println("main수행");//1

	
}
	
	static {
		//프로그램 실행전 사전 작업이 필요할때
		System.out.println("static초기화 블럭");
		}//드라이버 설치 같은 것에 사용



}
// 실행 화면 (static 이 먼저 실행된다.)

//static초기화 블럭
//main수행