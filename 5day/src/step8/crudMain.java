package step8;

import java.util.Scanner;

public class crudMain {
	public static void main(String[] args) {
		//등록 삭제 는 메인에서 만들기 
		//equal  사용하기 
		Scanner sc = new Scanner(System.in);
		// System.out.println("1.등록");
		//1.변수만들기
		String name= null, tel =null, addr=null;
		int i= 0,j,c=0;
		boolean flag=true, flag1 =false;
		
		//배열입력
		crudTest[] a= new crudTest[10];
		//addr
		while(flag) {
			System.out.println("1.등록");
			 System.out.println("2.검색");
			 System.out.println("3.전체출력");
             System.out.println("4.수정");
             System.out.println("5.삭제");
             System.out.println("6.종료");
             c =sc.nextInt();

			switch(c) {
				case 1:
					//for(i=0;i<a.length;i++) {}
					a[i] = new crudTest();
		             System.out.println("이름 : ");
		             a[i].name =sc.next();
		             System.out.println("전화번호 : ");
		             a[i].tel =sc.next();
		             System.out.println("주소 : ");
		             a[i].addr =sc.next();
		             i++;//10번 
					
					break;
				case 2://검색
		            System.out.println("이름 : ");
					name=sc.next();
					flag1=false;
					for(j=0;j<i;j++) {
						flag1=a[j].search(name);//해당하는 함수 찾기 search
						if (flag1) {
							a[j].print();
							break;
						}
					}
					if(!flag1) {
			             System.out.println("name 찾는값 없다.");
					}
					break;
				case 3:
					for(j=0;j<i;j++) {
						a[j].print();
						break;
					}
					break;
				case 4:
					  System.out.println("(수정)이름 : ");
			             name =sc.next();
			             System.out.println("(수정)전화번호 : ");
			             tel =sc.next();
			             System.out.println("(수정)주소 : ");
			             addr =sc.next();
						
					boolean f= false;
					for (j=0;j<i;j++) {
						f=a[j].edit(name,tel,addr);
						if(f)
							break;
					}
					if(f==false) {
			             System.out.println("없다.");
					}
		           
					break;
				case 5:
					break;
				case 6:
					flag=false;
					break;
                default:
                    System.out.println("1~3까지 숫자를 입력하세요");
                    break;
			
			}//switch
			
		}//while
	
	
	
	}
}
