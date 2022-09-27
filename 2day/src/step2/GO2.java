package step2;

public class GO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 최대값 구하기 
		double[]data = {9.5,7.0,13.6,7.5,10.0};
		
			double max,min;
			max = data[0];
			min = data[0];
			
		for(int k=1; k<data.length;k++) {
			
			if(data[k]>max) {//배열의 원소가 최대값보다 크면
				max=data[k];//새로운 최대값으로 설정	
						
			} 
			if(data[k]<min){
				min=data[k];
			}//if
			
			
		}//for
		System.out.println("max"+max);
		System.out.println("min"+min);
		
	}

}
