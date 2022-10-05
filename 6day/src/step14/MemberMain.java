package step14;

public class MemberMain {
public static void main(String[] args) {
	//초기화 된 내용 "basic", "a", 1
	MemberVO vo = new MemberVO("basic", "a", 1);
	
	vo.setId("java");
	System.out.println(vo.getId());//java

	vo.setPassword("absd");
	System.out.println(vo.getPassword());//absd

	vo.setMoney(2000);
	System.out.println(vo.getMoney());//2000
	

	
}
}
