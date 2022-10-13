package step5;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	private Scanner sc =new Scanner(System.in);
	private int menu;
	boolean flag =true;
	private String menuStr="1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.종료";
	//2.
	public void menuProcess(ArrayList<Member>data) {
		//ArrayList생성하고 받아오는거
		int idx=0;
		while(flag) {
			System.out.println(menuStr);
			menu=sc.nextInt();
			switch(menu) {
				case 1:
					
					data.add(infoInput());
					
					break;
				case 2:
					idx=search(data);
					printMember(data.get(idx));
					break;
				case 3:
					editMember(data);
					
					break;
				case 4:
					delMember(data);
					break;
				case 5:
					for(idx=0;idx<data.size();idx++) {
						printMember(data.get(idx));
					}
					break;
				case 6:
					flag= false;
					break;
				
			}
			
		}
	}
	//1.
	public Member infoInput() {
		System.out.println("이름:");
		String name = sc.next();
		System.out.println("전화번호:");
		String tel = sc.next();
		System.out.println("주소:");
		String address = sc.next();
		return new Member(name, tel, address);//문자열 일때 return null로 
	}
	
	public int search(ArrayList<Member>data) {
		System.out.println("이름:");
		//데이터 받기 위한 변수 
		String name = sc.next();

		for(int i =0; i<data.size();i++) {
			if(name.equals(data.get(i).getName())) {
				return i;
			}
		}
		return 0;//숫자일때 return 0으로 
	}
	
	public void editMember(ArrayList<Member>data) {
		int idx = search(data);
		System.out.println("새 전화번호:");
		String tel = sc.next();
		
		sc.nextLine();//입력한 값을 
	
		System.out.println("새 주소:");
		String address = sc.next();
		data.set(idx, new Member(data.get(idx).getName(),tel,address));
		
	}
	
	public void delMember(ArrayList<Member>data) {
		int idx = search(data);
		data.remove(idx);
	}
	
	public void printMember(Member m) {
		System.out.println(m);
	}

}

