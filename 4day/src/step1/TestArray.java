package step1;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rain [] [] =new int [2][3];
		
		System.out.println(rain.length);//2
		System.out.println(rain[0].length);//3
		System.out.println("-------------");
		rain[0][0]=10;
		rain[0][1]=10;
		rain[1][0]=10;
		System.out.println(rain[0][1]);//10
		int [][] arr= {{1,2,3},{4,5,6}};
		int i,j;
		for(i=0; i<arr.length;i++) {
			for(j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
