package step10;

public class TestMemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao service= new DaoImpl();
		
		service.connect();
		service.addPerson(new MemberVo(1, "�տ���", "�μ�","�ּ�"));
		service.addPerson(new MemberVo(2,"�迬��","��ǻ��","����"));
		service.addPerson(new MemberVo(3,"ȫ��","�����","����"));
		service.printAll();
		System.out.println("-----------");
		MemberVo vo= service.findPerson("�տ���");

		if(vo != null) {
			System.out.println(vo);
		}else {
			System.out.println("ȸ���� �ƴմϴ�.");
		}
		System.out.println("-----------");

		
		Dao service1= new DaoImpl2();  
		service1.connect();
		service1.addPerson(new MemberVo(4, "ȫ�浿", "�λ��","����"));
		service1.addPerson(new MemberVo(5,"�ֱ浿","�����","��õ"));
		service1.addPerson(new MemberVo(6,"�̱浿","������","�Ǳ�"));

		service1.printAll();

		System.out.println("-----------");
		MemberVo vo2= service1.findPerson("�̱浿");

		if(vo2 != null) {
			System.out.println(vo2);
		}else {
			System.out.println("ȸ���� �ƴմϴ�.");
		}
	}}
