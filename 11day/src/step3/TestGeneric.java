package step3;

import java.util.ArrayList;

import step2.FriendVO;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ÿ�� �̸� �����ϱ� down casting((FriendVO)list)�� ��������
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("��ڻ�",200));
		list.add(new Person("Ȳ����",300));
		list.add(new Person("ũ����Ż",400));
		System.out.println(list);//[Person [name=��ڻ�, money=200], Person [name=Ȳ����, money=300], Person [name=ũ����Ż, money=400]]

		Person vo1=list.get(0);
		System.out.println(vo1.getName());//��ڻ�
	}

}
