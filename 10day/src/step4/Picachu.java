package step4;
//공통
public class Picachu extends Character{

	//메모리 초기화 생성자 만들기
	public Picachu() {
		hp=30;
		energy=45;
		System.out.println("피카추가 생성되었습니다.");
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
