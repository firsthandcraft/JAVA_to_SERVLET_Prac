package step10;// 참고

import java.util.Random;

public class TestLottoSet2 {
public static void main(String[] args) {

        // TODO Auto-generated method stub
        /*로또번호 생성 
         * 1-45까지 임의의 수 6개를 보여주낟. 
         * 조건) 중복없고 정렬은 필요없다.
         * */
        /*조건 1 ) 가로로 6개의 숫자가 나열
        조건 2 ) 위 조건 1) 의 숫자들은 중복되어서는 안 됨
         * */
        Random r = new Random(); // new 메모리의 위치값 을 힙
        int[] lotto= new int[6];
        int num;
        //비교 랜덤 숫자 배열에 넣어주기 - 조건 /빼주기
       
        //이차원 배열 [2][3]만들기
        for(int l =0; l<5; l++) {
            for(int j = 0; j<lotto.length; j++) {
                num= r.nextInt(45)+1;
                //for중복 검사후 중복되면다시 nextInt() 수행해 검사
                //k>i현재 추가된 로또배열 요소와 현재 생성한 num을 비교하기 위한 코드
                for(int k=0; k<j;k++) {
                    if(lotto[k]==num) {
                        //다시 번호 생성
                        //다시 비교하기(for)수행
                        num= r.nextInt(45)+1;
                        k=-1;
                    }
                }
                lotto[j]=num;
            }
                //로또 번호 생성 후 배열요소 출력
                for(int j = 0; j<lotto.length; j++) {
                    System.out.print(lotto[j]+"\t");
                }
                System.out.println("");
        }


}}
