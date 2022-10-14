package step10;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {
    /*로또번호 생성 
     * 1.treeset생성
     * 2.random 생성
     * 3.while ():set의 사이즈가 6보다 작을 동안
     * 1-45까지 임의의 수 6개를 보여주낟. 
     * set에 추가 
     * 조건) 중복없고 정렬은 필요없다.
     * */
    /*조건 1 ) 가로로 6개의 숫자가 나열
    조건 2 ) 위 조건 1) 의 숫자들은 중복되어서는 안 됨
     * */
	
	public TreeSet getLottoSet() {
        Random r = new Random(); // new 메모리의 위치값 을 힙
        TreeSet set= new TreeSet();
        while(set.size()<6) {
        	int i = r.nextInt(45)+1;
        	set.add(i);
        }
        return set;
	}




//
}
