package step1;

import java.util.Scanner;

public class Arr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num;
		boolean flag= false;
		Scanner sc = new Scanner(System.in);
		int [] arr= new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("검색할 숫자를 입력하세요");
        num=sc.nextInt();

        for(i=0;i<arr.length;i++) {
        	if(num==arr[i]) {
        		flag=true;
                System.out.println("index"+i+"에서 검색");
                break;
        	}
        }
        if(!flag) {
            System.out.println("i찾는값이 없다.");

        }
        	
        
	}

}
