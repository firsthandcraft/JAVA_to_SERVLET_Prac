package step1;

import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교하기
		int i , max,min;
		int[] arr=new int[10];
        System.out.println("10개의 숫자를 입력 : ");
        Scanner sc =new Scanner(System.in);
        for(i=0;i<arr.length;i++) {
        	arr[i]= sc.nextInt();
          //  System.out.println(arr[i]);
        }
        max= arr[0];
        min= arr[1];
        for(i=0;i<arr.length;i++) {
        	if(max> arr[i]) {
        		max= arr[i];}
//        	else if(max== arr[i]){
//        		 System.out.println("==");
//        	}else {
//        		min= arr[i];
//        	} 
        	System.out.println("max"+max);
   	 	//	System.out.println("min"+min);
        }
        	

	
	}	

}
