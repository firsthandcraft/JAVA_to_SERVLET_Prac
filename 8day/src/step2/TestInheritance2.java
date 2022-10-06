package step2;
//class
class GrandParent{
	public GrandParent() {
		System.out.println("Grandprent");
	}
}
//class
class Parent extends GrandParent{
	Parent() {
		System.out.println("Prent");
	}
}
//class
class Child extends Parent{
	Child() {
		System.out.println("Child");
	}
}
//객체 생성되는 시점에 호출된다. 
//main
public class TestInheritance2 {
public static void main(String[] args) {
	new Child();
	//Grandprent
	//Prent
	//Child가 출력된다. 
}
}
