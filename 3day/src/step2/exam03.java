package step2;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� 100������ ������ ¦���� ����ϰ� . ��� ����� �� ������ ���
		int count=0;
		
		for( int i=1; i<101;i++) {
			if(i %2==0) {
				System.out.println(i+"\t");
				count ++;
				//count +=1;
			}	
		}
		System.out.println("¦���� �� ������ :" +count+"��");
		System.out.println("-------------");
	//5�� ��� ���ϱ� if(i %5==0) { 
		
		
		//1���� 100������ ������ ¦���� ����ϰ� �� ���ڱ����� �������� ���
		int sum =0;
		for( int i=1; i<101;i++) {
			if(i %2==0) {
				System.out.println(i+"\t"+sum+"\n");
				sum += i;
			}	

		}
		System.out.println("¦���� �� �� :" +sum+"��");
	}

}
