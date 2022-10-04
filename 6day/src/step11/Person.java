package step11;

public class Person {
 private String name;

 //객체생성과 네임 을 매개변수를 넣기
public Person(String name) {
	super();
	this.name = name;
}


//set get 메소드 생성하기
//
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}