package step7;

public class HrService {
	
	//toString()�� �������̵� �����Ƿ� ��ü�� ���� ���
	public void printAll(Employee[]group) {
		for(int i =0;i<group.length;i++) {
			System.out.println(group[i].toString());
		}
	}
	//address�� �ش��ϴ� �迭���� ����鸸 ���
	//printByAddress
	//address group.length
	public void printByAddress(String Address, Employee[]group) {
		
		for(int i =0;i<group.length;i++) {
			if(group[i].getAddress().equals(Address)) {
				System.out.println(group[i].toString());
			}
		}
		
	}
	
	//�ڽİ�ü�� �θ� Ÿ���� ��������(���⼺)
	//��� Employee�� �ڽ��̴�. �׷��Ƿ� Employee�� �޴´�. 
	public void printAnnualSalary(Employee e) {
		System.out.println(e.getSalary()*12);
	}
	public void printTotalCost(Employee [] group) {
		int sum=0;
		for(int i =0;i<group.length;i++) {
			sum+=group[i].getSalary()+12;
			if(group[i] instanceof Engineer) {
				Engineer en =(Engineer)group[i];
				sum+=en.getBonus()*12;
			}
		}
		System.out.println(sum);
	}
	
}
