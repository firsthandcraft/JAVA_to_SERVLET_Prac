package step1;

public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		
		try {//Exception이 발생될 것으로 예상되는 코드 블럭
			System.out.println(s.length());//값이 없다.
			// 위코드라인에서 Exception이 발생되면 바로 catch로 
			//Exception 발생 안되면 아래 코드라인 수행된다.
			System.out.println("수행??????여부확인");//안나옴
			//JVM 이 던진 Exception을 받아서 적절한 대안으로 처리
			//Exception 을 처리
		}catch(NullPointerException ne) {
			System.out.println("null이므로 길이를 구할수 없다.");
		}
	
	
	
	}}
