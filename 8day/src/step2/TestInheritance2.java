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
//��ü �����Ǵ� ������ ȣ��ȴ�. 
//main
public class TestInheritance2 {
public static void main(String[] args) {
	new Child();
	//Grandprent
	//Prent
	//Child�� ��µȴ�. 
}
}
