package step2;

public class GO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일반배열
		//데이터 타입이 동일한 여러개의 데이터를 저장할수 있는 공간을 만드는것
		//한번 할당한 공간의 길이는 절대 불변
		int [] score = new int [5]; 
		
		//시작점[0][1][2][3][4]
		score [0]=95;
		score [1]=70;
		score [2]=80;
		score [3]=75;
		score [4]=100;
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"th score["+i+"]"+score[i]);
		}
		
		System.out.println("--------------------");
		int [] month = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i=0; i<12;i++) {
			System.out.println((i+1)+"month"+month[i]);
			//[i]는 방의 길이를 표현
		}

		System.out.println("--------------------");
		//		
		int [] score2 = {95,70,80,75,100};
		
		
		
		//총점 평균
	
		int total =0;
		double ave=0;
		
		for(int h=0; h<score2.length;h++) {
			total +=score2[h];
			
			ave = (double)total/score2.length;

		}
		   
		System.out.println("--------------------");
		System.out.print("total"+total);
		System.out.println("Ave"+ave);
	}

}
