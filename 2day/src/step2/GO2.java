package step2;

public class GO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭�� �ִ밪 ���ϱ� 
		double[]data = {9.5,7.0,13.6,7.5,10.0};
		
			double max,min;
			max = data[0];
			min = data[0];
			
		for(int k=1; k<data.length;k++) {
			
			if(data[k]>max) {//�迭�� ���Ұ� �ִ밪���� ũ��
				max=data[k];//���ο� �ִ밪���� ����	
						
			} 
			if(data[k]<min){
				min=data[k];
			}//if
			
			
		}//for
		System.out.println("max"+max);
		System.out.println("min"+min);
		
	}

}
