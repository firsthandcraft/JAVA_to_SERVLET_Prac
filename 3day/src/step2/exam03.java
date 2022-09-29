package step2;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지의 숫자중 짝수를 출력하고 . 모두 출력후 그 개수를 출력
		int count=0;
		
		for( int i=1; i<101;i++) {
			if(i %2==0) {
				System.out.println(i+"\t");
				count ++;
				//count +=1;
			}	
		}
		System.out.println("짝수의 총 갯수는 :" +count+"개");
		System.out.println("-------------");
	//5의 배수 구하기 if(i %5==0) { 
		
		
		//1부터 100까지의 숫자중 짝수를 출력하고 그 숫자까지의 누적합을 출력
		int sum =0;
		for( int i=1; i<101;i++) {
			if(i %2==0) {
				System.out.println(i+"\t"+sum+"\n");
				sum += i;
			}	

		}
		System.out.println("짝수의 총 합 :" +sum+"개");
	}

}
