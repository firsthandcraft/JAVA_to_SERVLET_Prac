package step12;
//p294
class Calculator{
	//�޼ҵ� ����
	public double areaCircle(double r) {
		System.out.println("Calcualtor ��ü�� areaCircle() ����");
		return 3.14159*r*r;
	}
}
class Computer extends Calculator{

	@Override
	public double areaCircle(double r) {
		System.out.println("computet��ü�� areacircle()����");
		return Math.PI*r*r;
	}




	
}




public class ch07Sec04Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=10;
		Calculator calculator =new Calculator();
		System.out.println("�� ����"+calculator.areaCircle(r));
		System.out.println();
	}

}
