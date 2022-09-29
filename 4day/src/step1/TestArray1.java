package step1;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언 p144
		//정수형
		int [] ages;
		ages =new int[3]; //new 가 나와야 객체와 관련이 있다. -> 객체와 주소값
	  // ages = 주소값을 할당 (힙영역)
		System.out.println(ages);//[I@5e91993f -> 16진수의 배열의 위치값을 받아옴
		System.out.println(ages[0]); //0 이 출력 배열의 *길이*로 출력
		System.out.println(ages.length);//3 개가 출력 배열의 길이가 나옴
		
		//배열에 할당하기 : 인덱스 0부터 시작 할당
		ages[0]=12;
		ages[1]=22;
		ages[2]=32;
		System.out.println(ages[2]);//32가 출력
		System.out.println("for문으로 출력");
		for(int i =0; i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
		System.out.println("ages배열에서 20대 이상만 출력");
		
		for(int i =0; i<ages.length;i++) {
			if(ages[i]>=20) {
			System.out.println(ages[i]);
			}
		}
		
	}

}
