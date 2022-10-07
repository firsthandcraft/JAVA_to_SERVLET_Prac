package step9;
class Person{//extends object
	private String name;//ĸ��ȭ ���м��� ���� �Ѳ� ��������

	//Person(){}//����Ʈ ������
	public Person(String name) {//������ ������ �����ε�
		super();
		this.name = name;
	}
	
	//GETSET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}

class Student extends Person{
	private String studId;
	public Student(String name,String studId) {
		super(name);
		this.studId=studId;
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", getName()=" + getName() + "]";
	}




	
}
public class TestReview {
public static void main(String[] args) {
	//��üĳ���� �θ�Ÿ������ ���� upCasting
	Person p =new Student("������", "12");
	System.out.println(p.getName());//������
	System.out.println(p.toString());//Student [studId=12, getName()=������]
	//��ü ĳ���� �ʿ� p�� �θ� Ÿ�Ա����� �ν�
	System.out.println(((Student)p).getStudId());//12//downcasting �ڽ�Ÿ������ ����
	System.out.println(p);//Student [studId=12, getName()=������]

	if(p instanceof Student)
		System.out.println("�����л��̴�.");//�����л��̴�.
	if(p instanceof Person)
		System.out.println("���� ����̴�.");//���� ����̴�.
	if(p instanceof Object)
		System.out.println("���� ��ü�̴�.");//���� ��ü�̴�. 
}}
