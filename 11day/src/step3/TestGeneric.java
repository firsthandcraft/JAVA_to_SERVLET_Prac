package step3;

import java.util.ArrayList;

import step2.FriendVO;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입 미리 설정하기 down casting((FriendVO)list)이 귀찮을때
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("백박사",200));
		list.add(new Person("황정민",300));
		list.add(new Person("크리스탈",400));
		System.out.println(list);//[Person [name=백박사, money=200], Person [name=황정민, money=300], Person [name=크리스탈, money=400]]

		Person vo1=list.get(0);
		System.out.println(vo1.getName());//백박사
	}

}
