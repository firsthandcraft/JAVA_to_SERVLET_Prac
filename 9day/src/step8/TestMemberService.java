package step8;

public class TestMemberService {

	public static void main(String[] args) {
		// TODO Au
		SchoolService service = new SchoolService();
		service.addPerson(new Professor(1,"�տ���","�μ�","�ּ�","����"));
		service.addPerson(new Student(2,"�迬��","��ǻ���а�","����","�ڹ�"));
		service.addPerson(new Staff(3,"ȫ��","�����","����","������"));
		
		service.printAll();
		
		System.out.println("==========");
		MemberVO vo =service.findPerson("�տ���");
		if(vo != null){
			System.out.println(vo);
		} else {
			System.out.println("���x");
		}
	}

}
