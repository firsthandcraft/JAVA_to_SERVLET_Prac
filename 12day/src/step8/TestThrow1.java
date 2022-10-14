package step8;

class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}

class Service{
	//Exception 발생되면 호출한 곳으로 던진다.:throws
	public void test(int age) throws MyException {
		if(age <=0) {
			throw new MyException("나이는 1세 이상이어햐바니다.");
		}
		System.out.println(age+"세");
	}
}

public class TestThrow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Service service = new Service();
	try {
//		service.test(0);//나이는 1세 이상이어햐바니다.
		service.test(13);//13세
	} catch (MyException e) {
		System.out.println(e.getMessage());
	}

}}
