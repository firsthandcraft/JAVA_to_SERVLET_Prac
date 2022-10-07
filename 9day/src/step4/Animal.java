package step4;

public class Animal {
	/*다양한 동물객체를 처리하기 위해 부모타입인 
	 * Animal 타입을 매개변수를 선언하낟. 
	 * 매개변수 에 넘어온 인자값(객체)은
	 * enter()내부에서 먹다와 객체 오버라이딩된
	 * play()를 호출한다.
	 *단., Person객체일 경우 반드시 먼저
	 *티켓을 구하고 먹고 놀아야한다. 
	 * */
	/* 먹다
	 * 어흥하고 놀다
	 * 먹다
	 * 나무타고 놀다
	 * 티켓을 구매하다
	 * 티켓을 구매하다
	 * */
	
	
	//메소드 선언과
	public void eat() {
		System.out.println("먹다");
	}
	
	public void play() {
		System.out.println("놀다");
	}
}
