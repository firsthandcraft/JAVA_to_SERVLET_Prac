package step9;
class Person{//extends object
	private String name;//캡슐화 은닉성을 위해 뚜껑 막길위해

	//Person(){}//디폴트 생성자
	public Person(String name) {//생성자 생성자 오버로딩
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
	//객체캐스팅 부모타입으로 참조 upCasting
	Person p =new Student("아이유", "12");
	System.out.println(p.getName());//아이유
	System.out.println(p.toString());//Student [studId=12, getName()=아이유]
	//객체 캐스팅 필요 p는 부모 타입까지만 인식
	System.out.println(((Student)p).getStudId());//12//downcasting 자식타입으로 변경
	System.out.println(p);//Student [studId=12, getName()=아이유]

	if(p instanceof Student)
		System.out.println("나는학생이다.");//나는학생이다.
	if(p instanceof Person)
		System.out.println("나는 사람이다.");//나는 사람이다.
	if(p instanceof Object)
		System.out.println("나는 객체이다.");//나는 객체이다. 
}}
