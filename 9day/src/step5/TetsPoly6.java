package step5;
class Vehicle{
	public void go() {
		System.out.println("����");
	}
}
class Car extends Vehicle{
	public void go() {
		System.out.println("�������� ����");
	}
}
class Airplane extends Vehicle{
	public void go() {
		System.out.println("����� �� go �Լ��� ����");
	}
	public void fly() {
		System.out.println("����Ⱑ ����");
	}
}




public class TetsPoly6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//up CASTING
		//�������� ����ǹǷ� Vehicle �θ�Ÿ���� �迭�� �ڽ��� ��ü��Ҹ� �߰� ����
		//vihicle �θ�� go�ۿ� ����. 
		//casting�� �ذ͸� �����ü� �ִ�. 
		Vehicle va [] = {new Vehicle(),new Car(),new Airplane()};
		
		//for ���� �̿��Ͽ� �迭�� ��� ��ҿ� goȣ��
		for(int i =0;i<va.length;i++) {
			va[i].go();
			//����
			//�������� ����
			//����� �� go �Լ��� ����
			if(va[i] instanceof Airplane) {
				Airplane a = (Airplane)va[i];
				a.fly();//����Ⱑ ����
			}
			
		}
		
	}

}
