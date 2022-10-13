package step4;
//공통
public class Lee extends Character {
	public Lee() {
		hp=20;
		energy=60;
		System.out.println("이상해씨가 생성되었습니다.");
		printInfo();
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		energy+=5;
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		energy+=20;
	}
	
	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		energy -=15;
		hp+=10;
		levelUp();		
		return checkEnergy();
	}
	
	@Override
	public boolean train() {
		// TODO Auto-generated method stub
		energy -=30;
		hp+=35;
		levelUp();		
		return checkEnergy();
	}
	
	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		if(45 <= hp) {
			level++;
			hp-=45;
		}
}


}
