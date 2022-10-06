package step9;

public class TestOverriding3 {
public static void main(String[] args) {
	Student s= new Student("아이유","100","판교","12");
	System.out.println(s.getDetails());
	Teacher t =new Teacher("김연아","020","군포","체육");
	System.out.println(t.getDetails());
	/*name : 아이유tel : 100address : 판교stuId : 12
	name : 김연아tel : 020address : 군포subject : 체육	*/

	//toString 을 쓰면 getDetails작업이 필요없다. 
}
}
