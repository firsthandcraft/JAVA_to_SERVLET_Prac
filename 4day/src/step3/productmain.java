package step3;

public class productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p =new product();//heap의 영역에 위치값을 생성하고 p에 할당한다. 
		p.name="라면";
		p.Co=101010;
		p.price=1000;
		
		System.out.println(p.name);
		System.out.println(p.Co);
		System.out.println(p.price);
	}

}
