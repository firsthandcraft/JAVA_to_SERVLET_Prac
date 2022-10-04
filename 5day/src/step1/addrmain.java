package step1;

import java.util.Scanner;

public class addrmain {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		addr[] a= new addr[10];
		
		 //메인에서만 사용할 변수 왜 실행은 메인에서 하니까
		String name,Tel,address;
		boolean flag = true;
		int c=0, cnt=0;
		int i=0;
		
		while(flag) {
	        System.out.println("입력");
	        System.out.println("출력");
	        System.out.println("종료");

			switch (c) {
			case 1: 
				//배열에 할당
				a[cnt]=new addr();
		        System.out.println("name");
		        a[cnt].name=sc.next();
		        System.out.println("tell");
		        a[cnt].Tel=sc.next();
		        System.out.println("add");
		        a[cnt].address=sc.next();
				
		        cnt++;
		        break;
			case 2: 
				for(i=0;i<cnt;i++){
					System.out.println(a[i].name);
					System.out.println(a[i].Tel);
					System.out.println(a[i].address);
				}
				break;
			case 3:
				flag =false;
				
				break;
		
			default:
				throw new IllegalArgumentException("Unexpected value: " + 2);
			}
		}

//		
	}
}
