package step4;
//공통
public  abstract class Character {
	
	//일반 변수 
	protected int hp;
	protected int energy;
	protected int level=0;
	
	
	//추상메서드
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	
	//일반 메서드 
	public boolean checkEnergy() {
		if(energy <=0) {
			return true;
		} else {
			return false;
		}
	};
	public void printInfo() {
	System.out.println("현재 캐릭터의 정보 출력");
	System.out.println("hp="+hp);
	System.out.println("energy="+energy);
	System.out.println("level="+level);
	};
	
}
