package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <String> al= new ArrayList <String>();
		al.add("aaa");
		al.add("bbb");
		al.add(1,"ccc");
		/*0번째요소aaa
		1번째요소ccc
		2번째요소bbb
		*/
		al.set(2,"fff");//데이터를 다시 셋팅 -- 2번째요소bbb를 바꿔줌
		
		for(int i =0; i<al.size();i++) {
			System.out.println(i+"번째요소"+al.get(i));
		
		/*0번째요소aaa
		1번째요소ccc
		2번째요소fff*/
		//set 다시 데이터를 세팅한다. 
		}
		System.out.println("검색할 값을 입력하라:");
		String srh=sc.next();
		int idx =0;
		if(al.contains(srh)) {//contain포함되어있는건지 있으면 true 없으면 false
			idx=al.indexOf(srh);//리스트에 저장된 데이터의 위치를 찾아준다.			
			System.out.println(al.indexOf(srh));
		} else {
			System.out.println("찾는 값이 없다.");
		}
		//출력
		for(int i =0; i<al.size();i++) {
			System.out.println(i+"번째요소"+al.get(i));
		}
		

		System.out.println("삭제할 값을 입력하라:");
		srh=sc.next();
		idx=0;
		if(al.contains(srh)) {//contain포함되어있는건지 있으면 true 없으면 false
			idx=al.indexOf(srh);//리스트에 저장된 데이터의 위치를 찾아준다.			
			al.remove(idx);//삭제가 된다.
		} else {
			System.out.println("찾는 값이 없다.");
		}
		//출력
		for(int i =0; i<al.size();i++) {
			System.out.println(i+"번째요소"+al.get(i));
		}
		
		//
		System.out.println("전체 삭제");
		al.removeAll(al);
		//al.clear();//도 가능하다. 
		if(al.isEmpty()) {//contain포함되어있는건지 있으면 true 없으면 false
			System.out.println("리스트가 비어있다. ");

		} else {
			//출력
			for(int i =0; i<al.size();i++) {
				System.out.println(i+"번째요소"+al.get(i));
			}
		}
		
		
	}}
