package step1;

import java.util.Scanner;

public class For6Dia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//마름모 만들기 
        // TODO Auto-generated method stub
        //마름모 만들기 
        int dia;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자을 입력 ");
        dia =sc.nextInt();
        String textLine="";
        String textLine2="";
        
        
        for(int i= 0; i<dia; i++) {
            textLine +='*';    
            System.out.println(textLine);
        }
        for(int i= 0; i<dia-1; i++) { 
        	System.out.println(textLine2);
        	for (int j = 0; j < i; j++) {
        		textLine2+='*';

	        } //for 
        	break;
        }
        
	
		
		
	}

}
