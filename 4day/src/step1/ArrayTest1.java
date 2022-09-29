package step1;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열에 값넣기
		int i;
		int [] es =new int[30];//30명의 데이터 입력
		
		
		for(i=0; i<30; i++) {
			es[i]=i;
		}
		System.out.println(es[0]);
		System.out.println(es[1]);
		System.out.println(es[2]);
		System.out.println(es[3]);
		for(i=4; i<30; i++) {
			System.out.println(es[i]);
		}
		
	}

}
