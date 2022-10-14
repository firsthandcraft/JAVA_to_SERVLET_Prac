package step10;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {
    /*�ζǹ�ȣ ���� 
     * 1.treeset����
     * 2.random ����
     * 3.while ():set�� ����� 6���� ���� ����
     * 1-45���� ������ �� 6���� �����ֳ�. 
     * set�� �߰� 
     * ����) �ߺ����� ������ �ʿ����.
     * */
    /*���� 1 ) ���η� 6���� ���ڰ� ����
    ���� 2 ) �� ���� 1) �� ���ڵ��� �ߺ��Ǿ�� �� ��
     * */
	
	public TreeSet getLottoSet() {
        Random r = new Random(); // new �޸��� ��ġ�� �� ��
        TreeSet set= new TreeSet();
        while(set.size()<6) {
        	int i = r.nextInt(45)+1;
        	set.add(i);
        }
        return set;
	}




//
}
