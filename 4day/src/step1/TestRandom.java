package step1;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jdk���� �����ϴ±��
		Random r = new Random(); // new �޸��� ��ġ�� �� ��
		int i = r.nextInt(3);//3���� ���� 0-2���� 
        System.out.println(i);
        for(int j = 0; j<10; j++) {
        	i=r.nextInt(3);
            System.out.println(i);

        }

	}

}
