package step5;

public class PersonMain {
public static void main(String[] args) {
	Person p = new Person();
	p.setNum(1);
	p.setName("person");
	p.setDept("dept");
	p.setAddress("address");
	p.print();
	/* print ���ȭ�� 
	num1
	nameperson
	deptdept
	addressaddress*/
	System.out.println("==============");

	Professor f =new Professor();
	f.setNum(2);
	f.setName("����1");
	f.setDept("Computer");
	f.setAddress("����");
	f.setSubjects(new String[] {"�����а���","C���α׷���","RTOS"});
	f.print();
	f.print_subj();
	/* ���ȭ��
	 num2
	name����1
	deptComputer
	address����
	����1������ ��������
	subjects�����а���
	subjectsC���α׷���
	subjectsRTOS*/
	System.out.println("==============");
	
	Student s =new Student();
	s.setNum(3);
	s.setName("�л�");
	s.setDept("Computer2");
	s.setAddress("��⵵");
	s.setSubject(new String[] {"�ڹ����α׷���","�ü��","�����Ϸ�"});
	s.print();
	s.print_subj();
	/*���ȭ��
	num3
	name�л�
	deptComputer2
	address��⵵
	�л��л��� ��������
	subject�ڹ����α׷���
	subject�ü��
	subject�����Ϸ� */
	System.out.println("==============");
	Staff sf =new Staff();
	sf.setNum(4);
	sf.setName("����");
	sf.setDept("HR");
	sf.setAddress("��õ");
	sf.setJob("������");
	sf.print();
	sf.print_job();
	/*���ȭ��
	num4
	name����
	deptHR
	address��õ
	������������ �����±�����*/
	System.out.println("==============");

	
}
}
