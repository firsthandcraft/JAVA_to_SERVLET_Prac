package step4;

public class Parent2Main {
public static void main(String[] args) {
	GrandParent gp =new GrandParent();
	//GrandParent의 생성자
	gp.name ="조부모";
	gp.age=80;
	gp.printGrandParentInfo();//name조부모//age80
	
	System.out.println("===============");

	Parent2 p = new Parent2();
	//GrandParent의 생성자//Parent2의 생성자
	p.name="부모";
	p.age=50;
	p.job="회사원";
	p.printGrandParentInfo();//name부모//age50
	p.printParentInfo();//name부모//age50//job회사원
	
	System.out.println("===============");

	Child2 c = new Child2();
	//GrandParent의 생성자//Parent2의 생성자//Child2 생성자
	c.name="자식";
	c.age=20;
	c.job="학생";
	c.hobby="클라이밍";
	c.printGrandParentInfo();//name자식//age20
	c.printParentInfo();//name자식//age20//job학생
	c.printChildInfo();//name자식//age20//job학생//hobby클라이밍
}
}
