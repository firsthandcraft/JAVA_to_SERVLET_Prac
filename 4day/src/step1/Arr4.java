package step1;

import java.util.Scanner;

public class Arr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num;
		boolean flag= false;
		Scanner sc = new Scanner(System.in);
		int [] arr= new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("�˻��� ���ڸ� �Է��ϼ���");
        num=sc.nextInt();

        for(i=0;i<arr.length;i++) {
        	if(num==arr[i]) {
        		flag=true;
                System.out.println("index"+i+"���� �˻�");
                break;
        	}
        }
        if(!flag) {
            System.out.println("iã�°��� ����.");

        }
        	
        
	}

}
