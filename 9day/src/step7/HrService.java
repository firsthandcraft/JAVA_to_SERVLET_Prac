package step7;

public class HrService {
	
	//toString()을 오버라이딩 했으므로 객체의 내용 출력
	public void printAll(Employee[]group) {
		for(int i =0;i<group.length;i++) {
			System.out.println(group[i].toString());
		}
	}
	//address에 해당하는 배열안의 사원들만 출력
	//printByAddress
	//address group.length
	public void printByAddress(String Address, Employee[]group) {
		
		for(int i =0;i<group.length;i++) {
			if(group[i].getAddress().equals(Address)) {
				System.out.println(group[i].toString());
			}
		}
		
	}
	
	//자식객체를 부모 타입이 참조가능(다향성)
	//모두 Employee의 자식이다. 그러므로 Employee로 받는다. 
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
