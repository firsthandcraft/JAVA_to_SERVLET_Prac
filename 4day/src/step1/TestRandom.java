package step1;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jdk에서 제공하는기능
		Random r = new Random(); // new 메모리의 위치값 을 힙
		int i = r.nextInt(3);//3개의 숫자 0-2까지 
        System.out.println(i);
        for(int j = 0; j<10; j++) {
        	i=r.nextInt(3);
            System.out.println(i);

        }

	}

}
