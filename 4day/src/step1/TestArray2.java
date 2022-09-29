package step1;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//데이터 검색하고 일치하는 값 찾기 
		//CRUD
		int salary [] = new int[3];
		salary[0]=100;
		salary[1]=200;
		salary[2]=300;
		System.out.println("salary베열의 총합");

		int sum=0;
		for(int i=0; i<salary.length;i++) {
			sum+=salary[i];
			System.out.println("배열의 방:"+salary[i]+"\t 합계"+sum);
		}
		
		
		System.out.println("");
		int price[]= {100,200,300,500,600};
		System.out.println("price의 평균가격 구하기");
		
		int sum2=0;
		for(int j=0; j<price.length; j++) {
			sum2+=price[j];
		}
		System.out.println("평균가격 : "+sum2/price.length);

		

		//로또 번호 만들기 
		//숫자 여섯자리 난수random  같은 수 반복x 
		
	}

}
