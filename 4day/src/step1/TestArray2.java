package step1;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �˻��ϰ� ��ġ�ϴ� �� ã�� 
		//CRUD
		int salary [] = new int[3];
		salary[0]=100;
		salary[1]=200;
		salary[2]=300;
		System.out.println("salary������ ����");

		int sum=0;
		for(int i=0; i<salary.length;i++) {
			sum+=salary[i];
			System.out.println("�迭�� ��:"+salary[i]+"\t �հ�"+sum);
		}
		
		
		System.out.println("");
		int price[]= {100,200,300,500,600};
		System.out.println("price�� ��հ��� ���ϱ�");
		
		int sum2=0;
		for(int j=0; j<price.length; j++) {
			sum2+=price[j];
		}
		System.out.println("��հ��� : "+sum2/price.length);

		

		//�ζ� ��ȣ ����� 
		//���� �����ڸ� ����random  ���� �� �ݺ�x 
		
	}

}
