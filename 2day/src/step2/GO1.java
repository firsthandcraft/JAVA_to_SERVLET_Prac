package step2;

public class GO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Ϲݹ迭
		//������ Ÿ���� ������ �������� �����͸� �����Ҽ� �ִ� ������ ����°�
		//�ѹ� �Ҵ��� ������ ���̴� ���� �Һ�
		int [] score = new int [5]; 
		
		//������[0][1][2][3][4]
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
			//[i]�� ���� ���̸� ǥ��
		}

		System.out.println("--------------------");
		//		
		int [] score2 = {95,70,80,75,100};
		
		
		
		//���� ���
	
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
