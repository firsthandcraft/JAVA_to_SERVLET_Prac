package step8;

public class PublicTestMain {
public static void main(String[] args) {
		//��ü �����ϱ� 
	
	PublicTest t= new PublicTest(10,10);//�ȿ� �Ű����� �Ⱦ��� ���� 
	t.x=20;
	
	//private �� ��������
	//t.y=20;//the field PublicTest is nor visible
	
	//t.setValue();///the field setValue is nor visible

	t.print();//x=100y=100

}
}
