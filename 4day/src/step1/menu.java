package step1;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String name []  = new String[3];
		  boolean flag = true;
		  int i=0,number;              int j=0;
		/*1.이름입력
		 * 2.출력
		 * 3.종료
		 * */
		  System.out.println("123중에 하나를 입력");

		  while(flag) {
              System.out.println("1.이름입력");
              System.out.println("2.출력");
              System.out.println("3.종료");
              number =sc.nextInt();
              
/*              switch(number) {
	              case 1:
	            	  for( i=0; i<name.length;i++) {
	            		  System.out.println("이름입력"+i);
	            		  name [i]  = sc.next();
	            		  
	            	  }
	            	  break;
	              case 2:
	            	  for( i=0; i<name.length;i++) {
	            		  System.out.println("이름"+i+"="+name[i]);
	            	  }
	            	  break;
	              case 3:
	            	  flag= false;
                      System.out.println("종료");
	            	  break;
	            	  
	              default:
                      System.out.println("1~3까지 숫자를 입력하세요");

              }*/
              //while 안에 if로 넣기

              
              if(number==1) {
            	  for(j =0; j<name.length;j++) {
    		 		 System.out.println("이름입력"+i);
              	 name [j]=sc.next();
		  		   }
              } else if(number==2) {
            	  for( i=0; i<name.length;i++) {
    		  System.out.println("이름"+i+"="+name[i]);
    	  }

              }else if(number==3) {
            	  flag = false;
            	  System.out.println("종료");
            	  break;
            	  

              } else {
                  System.out.println("1~3까지 숫자를 입력하세요");
                  
              } flag=false;
              
		  }
	
	//
	}

}
