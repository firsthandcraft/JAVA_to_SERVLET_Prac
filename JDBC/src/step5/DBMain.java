package step5;

import java.util.Scanner;


public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB d= new DB();
		Scanner sc = new Scanner(System.in);
		boolean flag= true;
		int i =0;
		
		while(flag) {
			System.out.println("1.등록  2.출력  3.검색  4.수정  5.삭제  6. 종료");
			i = sc.nextInt();
			switch(i) {
			case 1:
				d.enroll();
				break;
			case 2:
				d.print();
				break;
			case 3:
				System.out.println("검색할 번호 입력 : ");
				int j = sc.nextInt();
				d.search(j);
				break;
			case 4:
				d.update();
				break;
			case 5:
				d.delete();
				break;
			case 6: flag = false;
				break;
			default:
				System.out.println("1-6숫자만 입력");
			}
			
		}
		flag=false;
	}}
