package step4;

public class Parent2 extends GrandParent {
	 protected String job;
	 //持失切
	public Parent2() {
		System.out.println("Parent2税 持失切");
	}
	 
	public void printParentInfo() {
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("job"+job);
	}
}
