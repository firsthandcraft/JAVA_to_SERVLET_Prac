package test;

import java.util.Scanner;

import javax.print.ServiceUI;

import service.AddsService;
import vo.addres;

public class TestService {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	int i=0;
	String name,tel,addr;
	AddsService service = new AddsService();
	
	while(flag) {
		System.out.println("1.등록 2.검색 3.전체출력 4.수정 5.종료 ");
		i=sc.nextInt();
		switch(i) {
		
		case 1:
			System.out.println("1.이름 입력 ");
			name=sc.next();
			System.out.println("2.번호 입력 ");
			tel=sc.next();
			System.out.println("3.주소 입력 ");
			addr=sc.next();
			service.addPerson(new addres(name,tel,addr));
			break;
				
		case 2:
			System.out.println("이름 검색 ");
			name=sc.next();
			addres find = service.findPerson(name);
			System.out.println(find);
			
			
			break;
		case 3:
			service.printAll();
			
			break;
		case 4:
			name=sc.next();
			service.findUpdate(name);
			break;
		case 5:
			flag=false;
			System.out.println("종료");
			
			break;			
		
		
		
		}
		
		
		
		
	}



}
}
