package step1;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 ���� p144
		//������
		int [] ages;
		ages =new int[3]; //new �� ���;� ��ü�� ������ �ִ�. -> ��ü�� �ּҰ�
	  // ages = �ּҰ��� �Ҵ� (������)
		System.out.println(ages);//[I@5e91993f -> 16������ �迭�� ��ġ���� �޾ƿ�
		System.out.println(ages[0]); //0 �� ��� �迭�� *����*�� ���
		System.out.println(ages.length);//3 ���� ��� �迭�� ���̰� ����
		
		//�迭�� �Ҵ��ϱ� : �ε��� 0���� ���� �Ҵ�
		ages[0]=12;
		ages[1]=22;
		ages[2]=32;
		System.out.println(ages[2]);//32�� ���
		System.out.println("for������ ���");
		for(int i =0; i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
		System.out.println("ages�迭���� 20�� �̻� ���");
		
		for(int i =0; i<ages.length;i++) {
			if(ages[i]>=20) {
			System.out.println(ages[i]);
			}
		}
		
	}

}
