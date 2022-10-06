package step1;
//class만들기
class Animal{//extend Object(생략되어있음)
	int age=1;
	public void eat() {
		System.out.println("먹다");
		
	}
	
}
//class 만들기 2
class Person extends Animal{//자식
	
	public void study() {
		System.out.println("공부하다");
	}
}

//main
public class TestInheritance1 {
public static void main(String[] args) {
	//객체생성
	Person p  = new Person();
	p.study();
	p.eat();
	System.out.println(p.age);//변수도 접근 가능하다.
}
}
