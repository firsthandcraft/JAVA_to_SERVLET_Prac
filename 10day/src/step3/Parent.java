package step3;

public abstract class Parent extends GrandParent {
	//하나만 구현 할경우 자식은 모두 상속받은것을 구현해야한다.
	//하나만 구현할 경우 빨간줄 오류가 뜨는데 
	//abstract를 parent에 붙여주면 된다.

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("parent");
		System.out.println("name"+name);
	}

	
}
