package step12;
//p294
class Calculator{
	//메소드 선언
	public double areaCircle(double r) {
		System.out.println("Calcualtor 객체의 areaCircle() 실행");
		return 3.14159*r*r;
	}
}
class Computer extends Calculator{

	@Override
	public double areaCircle(double r) {
		System.out.println("computet객체의 areacircle()실행");
		return Math.PI*r*r;
	}




	
}




public class ch07Sec04Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=10;
		Calculator calculator =new Calculator();
		System.out.println("원 면적"+calculator.areaCircle(r));
		System.out.println();
	}

}
