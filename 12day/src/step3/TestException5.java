package step3;

public class TestException5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		try {
		System.out.println(4/i);
		
		} catch(NullPointerException ne) {
			System.out.println("Null이므로 수행불가");
		} finally {
			System.out.println("finally");
		}
		System.out.println("정상수행");
		
}}
