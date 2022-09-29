package step3;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*이중 for 문 구구단 만들기
		 * 2*1=2	2*2=4	2*3=6	2*4=8	... 
		 * 3*1=3	3*2=6	3*3=9	3*4=12 ...
		 * */
		
		/*
		for(int a=2; a<10; a++) {
			System.out.println(a+"단 \t");
			for(int b=1; b<10; b++) {
				System.out.print(a+"*"+b+"="+a*b+"\t");
			}
			System.out.println();
		}*/
		
		System.out.println("----------------");
		// 단 상의 포문 변수는 초기화를 0으로 하고 조건절은 10으로 설정
		//하의 포문의 변수 초기화는 2로 조건은 10으로 
		
		// 이중 for 문은 같은 아이디 를 찾고 아이디 거르기 (if)문으로  
		for(int i=0; i<10; i++) {
				for(int j=2; j<10; j++) {
					if ( i == 0) {	
						System.out.print(j+"단 \t");
						}else {
							System.out.print(j+"*"+i+"="+(j*i+"\t"));
						}//else
				}//하위 for
				System.out.println();
		}//상위for
		
		System.out.println("----------------");
		/*별 만들기 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		for(int a=0; a<=4; a++) {
			for(int b=0; b<a; b++) {
				System.out.print("*");
			}//하위 for
			System.out.println();
	}//상위for
			
		
		
	}

}
