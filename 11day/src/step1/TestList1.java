package step1;

import java.util.ArrayList;

public class TestList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist 객체 생성
		ArrayList list = new ArrayList();
		list.add("IU");//데이터 추가
		list.add("보아");
		list.add("김연아");
		//
		System.out.println(list.size());//3
		//배열했을때 length는 방의 길이 arraylist의 size는 데이터의 갯수
		System.out.println(list);//[IU, 보아, 김연아]
		//arraylist에는 tostring이 overriding되어잇다. 
		System.out.println(list.get(0));//IU
		//0번째 들어가는 방 IU 출력
		
		list.add(2);//1.5버전 이상 부터 자동으로 변환 wrapper class자동으로 들어가 있다. 
		list.add(new Integer(1));// wrapper class ->자료형을 하나의 클래스 처럼 만들고 싶을떄
		//자료를 하나의 클래스로 잡고 막아주겠다. 데이터 손실 발생을 방지 
		
		System.out.println(list);//[IU, 보아, 김연아, 2, 1]
		
		list.remove(4);
		System.out.println(list);//[IU, 보아, 김연아, 1]
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		/*IU
		보아
		김연아
		2*/
		
		//list.clear();
		//System.out.println(list);//[]다 없어짐
		
		//list.removeAll(list);
		//System.out.println(list);//[]다 없어짐

	}

}
