package step7;

public class Engineer extends Employee{
	
	private String skill;
	private int bonus;
	public Engineer(String empId, String name, String address, int salary,String skill,int bonus) {
		super(empId, name, address, salary);
		// TODO Auto-generated constructor stub
		this.skill=skill;
		this.bonus=bonus;
	}
	///setget method
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	//tostring
	@Override
	public String toString() {
		return super.toString()+"skill"+skill+"bonus"+bonus;
	}

}
