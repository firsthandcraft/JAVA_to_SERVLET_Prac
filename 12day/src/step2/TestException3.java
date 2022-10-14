package step2;

public class TestException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"크리스탈","소지섭","황정민"};
	
		try {
		System.out.println(names[1]);//
		System.out.println(names[2]);
		
		String s =null;
		System.out.println(s.length());
		} catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("인덱스 범위 초과");
			
		} catch(Exception e) {
			e.printStackTrace();//Exception 메세지와 발생경로를 출력
		}
		System.out.println("장상수행");
}}
