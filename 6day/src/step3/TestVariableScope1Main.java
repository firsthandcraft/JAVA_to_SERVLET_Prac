package step3;

public class TestVariableScope1Main {
 public static void main(String[] args) {
	
	 TestVariableScope1 t =new TestVariableScope1();
	 t.test1();//0 
	 t.test2();//test2�������� :1 0
	 t.test3(2);//�ȿ� �Ű� ���� 2�� �־�� ������ �ȶ��.
	 // test3�������� :2 2
	 t.test4();//���� ����. 
	 //t.test5();
	 //test4�� ���������� ������ �������� ���. 
	 t.test6(); // 0 null
	 
	 
 }
}

