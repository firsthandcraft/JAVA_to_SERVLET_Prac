package step4;
//����
public class Picachu extends Character{

	//�޸� �ʱ�ȭ ������ �����
	public Picachu() {
		hp=30;
		energy=45;
		System.out.println("��ī�߰� �����Ǿ����ϴ�.");
		printInfo();
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		energy+=20;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		energy+=15;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		energy -=20;
		hp+=20;
		levelUp();		
		return checkEnergy();
	}

	@Override
	public boolean train() {
		// TODO Auto-generated method stub
		energy -=20;
		hp+=25;
		levelUp();		
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		if(55 <= hp) {
			level++;
			hp-=40;
		}
	}

}
