package step10;// ����

import java.util.Random;

public class TestLottoSet2 {
public static void main(String[] args) {

        // TODO Auto-generated method stub
        /*�ζǹ�ȣ ���� 
         * 1-45���� ������ �� 6���� �����ֳ�. 
         * ����) �ߺ����� ������ �ʿ����.
         * */
        /*���� 1 ) ���η� 6���� ���ڰ� ����
        ���� 2 ) �� ���� 1) �� ���ڵ��� �ߺ��Ǿ�� �� ��
         * */
        Random r = new Random(); // new �޸��� ��ġ�� �� ��
        int[] lotto= new int[6];
        int num;
        //�� ���� ���� �迭�� �־��ֱ� - ���� /���ֱ�
       
        //������ �迭 [2][3]�����
        for(int l =0; l<5; l++) {
            for(int j = 0; j<lotto.length; j++) {
                num= r.nextInt(45)+1;
                //for�ߺ� �˻��� �ߺ��Ǹ�ٽ� nextInt() ������ �˻�
                //k>i���� �߰��� �ζǹ迭 ��ҿ� ���� ������ num�� ���ϱ� ���� �ڵ�
                for(int k=0; k<j;k++) {
                    if(lotto[k]==num) {
                        //�ٽ� ��ȣ ����
                        //�ٽ� ���ϱ�(for)����
                        num= r.nextInt(45)+1;
                        k=-1;
                    }
                }
                lotto[j]=num;
            }
                //�ζ� ��ȣ ���� �� �迭��� ���
                for(int j = 0; j<lotto.length; j++) {
                    System.out.print(lotto[j]+"\t");
                }
                System.out.println("");
        }


}}
