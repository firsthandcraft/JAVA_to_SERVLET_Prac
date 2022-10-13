package step6;
//다중 상속
public class MyImplements implements MyInterface1,MyInterface2{

	@Override
	public int add() {
		// TODO Auto-generated method stub
		int i , sum =1;
		for(i=0;i<SIZE;i++) {
			sum+=i;
		}
		return sum;

	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int i , result =1;
		for(i=2;i<MAX;i++) {
			result*=i;
		}
		System.out.println("mul()의 구현 결과 = "+result);
	}

	
}
