package step3;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���� for �� ������ �����
		 * 2*1=2	2*2=4	2*3=6	2*4=8	... 
		 * 3*1=3	3*2=6	3*3=9	3*4=12 ...
		 * */
		
		/*
		for(int a=2; a<10; a++) {
			System.out.println(a+"�� \t");
			for(int b=1; b<10; b++) {
				System.out.print(a+"*"+b+"="+a*b+"\t");
			}
			System.out.println();
		}*/
		
		System.out.println("----------------");
		// �� ���� ���� ������ �ʱ�ȭ�� 0���� �ϰ� �������� 10���� ����
		//���� ������ ���� �ʱ�ȭ�� 2�� ������ 10���� 
		
		// ���� for ���� ���� ���̵� �� ã�� ���̵� �Ÿ��� (if)������  
		for(int i=0; i<10; i++) {
				for(int j=2; j<10; j++) {
					if ( i == 0) {	
						System.out.print(j+"�� \t");
						}else {
							System.out.print(j+"*"+i+"="+(j*i+"\t"));
						}//else
				}//���� for
				System.out.println();
		}//����for
		
		System.out.println("----------------");
		/*�� ����� 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		for(int a=0; a<=4; a++) {
			for(int b=0; b<a; b++) {
				System.out.print("*");
			}//���� for
			System.out.println();
	}//����for
			
		
		
	}

}
