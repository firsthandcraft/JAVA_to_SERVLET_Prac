package step7;

class Service{
	public void test(String name) {
		//Exception발생시 자동 throws
		System.out.println("이름이"+name.length()+"자로 구성");
	}
}

public class TestThrows2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service s = new Service();
		
		try {
			s.test(null);
		} catch(NullPointerException ne) {//간단한 Exception메세지
			System.out.println(ne.getMessage());//Exception발생경로 및ㅊ 메세지를 보여준다.
		}
		System.out.println("정상수행");
	}}
