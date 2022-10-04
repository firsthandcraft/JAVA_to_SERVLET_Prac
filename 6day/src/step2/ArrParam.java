package step2;

public class ArrParam {

	//클래스가 살아잇으면 전역변수도 같이 살아있는다. 
	//메소드는 한번 호출되고 사라진다. 
	
	//전역변수는  초기화 안해도됨
	int max; //전역변수 또는 인스턴스 변수
	int sum; 
	float avg;
	
	//메소드 만들기 
	void makeMax(int []arr){//스택
		int i;//지역변수
		//호출되고 사라진다.
		max=arr[0];
		for(i=1; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				
			}
		}
	}	

	void makeSum(int[]arr) {
		int i; //지역변수
		sum=0;
		for(i=0; i<arr.length;i++) {
			sum+= arr[i];
		}
		
	}
	
	
	void makeAvg (int []arr) {
		makeSum(arr);
		avg=(float)sum/arr.length;
	}
}
