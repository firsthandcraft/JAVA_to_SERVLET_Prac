package step8;

public class TestMemberService {

	public static void main(String[] args) {
		// TODO Au
		SchoolService service = new SchoolService();
		service.addPerson(new Professor(1,"손연재","부서","주소","과목"));
		service.addPerson(new Student(2,"김연아","컴퓨터학과","군포","자바"));
		service.addPerson(new Staff(3,"홍명보","전산부","파주","개발자"));
		
		service.printAll();
		
		System.out.println("==========");
		MemberVO vo =service.findPerson("손연재");
		if(vo != null){
			System.out.println(vo);
		} else {
			System.out.println("사람x");
		}
	}

}
