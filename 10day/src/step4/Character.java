package step4;
//����
public  abstract class Character {
	
	//�Ϲ� ���� 
	protected int hp;
	protected int energy;
	protected int level=0;
	
	
	//�߻�޼���
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	
	//�Ϲ� �޼��� 
	public boolean checkEnergy() {
		if(energy <=0) {
			return true;
		} else {
			return false;
		}
	};
	public void printInfo() {
	System.out.println("���� ĳ������ ���� ���");
	System.out.println("hp="+hp);
	System.out.println("energy="+energy);
	System.out.println("level="+level);
	};
	
}
