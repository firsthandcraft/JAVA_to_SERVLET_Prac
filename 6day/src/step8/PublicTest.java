package step8;

public class PublicTest {

	//메소드에 private붙이면 못사용 public 사용 -외부의 값을 받아오기
	//전역 변수에 private 사용
	
	//변수 2개 만들기 
	public int x;
	private int y;
	
	//생성자 만들기
	public PublicTest(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public void print(){
		setValue();
		System.out.println("x="+x+"y="+y);
	}

	//메소드에 private안씀 연습용
	private void setValue(){//메인에서 호출이 안된다.
		//private 외부로부터 막아주기 때문에 외부로 부터 값을 받아준다.
		//클래스 안에서만 쓴다. 밖에서 접근 불가
		
		x=100;
		y=100;	
	}
	

}
