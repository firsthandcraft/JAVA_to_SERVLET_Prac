package step1;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String name []  = new String[3];
		  boolean flag = true;
		  int i=0,number;              int j=0;
		/*1.�̸��Է�
		 * 2.���
		 * 3.����
		 * */
		  System.out.println("123�߿� �ϳ��� �Է�");

		  while(flag) {
              System.out.println("1.�̸��Է�");
              System.out.println("2.���");
              System.out.println("3.����");
              number =sc.nextInt();
              
/*              switch(number) {
	              case 1:
	            	  for( i=0; i<name.length;i++) {
	            		  System.out.println("�̸��Է�"+i);
	            		  name [i]  = sc.next();
	            		  
	            	  }
	            	  break;
	              case 2:
	            	  for( i=0; i<name.length;i++) {
	            		  System.out.println("�̸�"+i+"="+name[i]);
	            	  }
	            	  break;
	              case 3:
	            	  flag= false;
                      System.out.println("����");
	            	  break;
	            	  
	              default:
                      System.out.println("1~3���� ���ڸ� �Է��ϼ���");

              }*/
              //while �ȿ� if�� �ֱ�

              
              if(number==1) {
            	  for(j =0; j<name.length;j++) {
    		 		 System.out.println("�̸��Է�"+i);
              	 name [j]=sc.next();
		  		   }
              } else if(number==2) {
            	  for( i=0; i<name.length;i++) {
    		  System.out.println("�̸�"+i+"="+name[i]);
    	  }

              }else if(number==3) {
            	  flag = false;
            	  System.out.println("����");
            	  break;
            	  

              } else {
                  System.out.println("1~3���� ���ڸ� �Է��ϼ���");
                  
              } flag=false;
              
		  }
	
	//
	}

}
