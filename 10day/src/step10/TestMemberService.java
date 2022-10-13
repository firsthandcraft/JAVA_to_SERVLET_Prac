package step10;

public class TestMemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao service= new DaoImpl();
		
		service.connect();
		service.addPerson(new MemberVo(1, "손연재", "부서","주소"));
		service.addPerson(new MemberVo(2,"김연아","컴퓨터","군포"));
		service.addPerson(new MemberVo(3,"홍명보","전산부","파주"));
		service.printAll();
		System.out.println("-----------");
		MemberVo vo= service.findPerson("손연재");

		if(vo != null) {
			System.out.println(vo);
		}else {
			System.out.println("회원이 아닙니다.");
		}
		System.out.println("-----------");

		
		Dao service1= new DaoImpl2();  
		service1.connect();
		service1.addPerson(new MemberVo(4, "홍길동", "인사과","강남"));
		service1.addPerson(new MemberVo(5,"최길동","전산과","인천"));
		service1.addPerson(new MemberVo(6,"이길동","영업부","판교"));

		service1.printAll();

		System.out.println("-----------");
		MemberVo vo2= service1.findPerson("이길동");

		if(vo2 != null) {
			System.out.println(vo2);
		}else {
			System.out.println("회원이 아닙니다.");
		}
	}}
