package step2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap2 {
public static void main(String[] args) {
	
	HashMap map = new HashMap();
	map.put("a",new FriendVO("�տ���","�¸�",200));
	map.put("b",new FriendVO("ũ����Ż","�뷮������",300));
	map.put("c",new FriendVO("�����ä���","�ı�",400));
	System.out.println(map);
	//{a=FriendVO [name=�տ���, address=�¸�, money=200], b=FriendVO [name=ũ����Ż, address=�뷮������, money=300], c=FriendVO [name=�����ä���, address=�ı�, money=400]}

	FriendVO vo = (FriendVO)map.get("c");
	System.out.println(vo.getName()+""+vo.getAddress());//�����ä����ı�
	System.out.println(map.get("C"));//key���� ��ҹ��� �����Ѵ�.//null
	
	Set set=map.keySet();
	Iterator it =set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		/* a
			b
			c*/
	}
	System.out.println("map�� value�鸸 ���");
	Collection col = map.values();
	Iterator it2 =set.iterator();//�ڷᱸ���� �����ͺ� ���� �ְ� ���
	while(it2.hasNext()) {
		System.out.println(it2.next());
		/* a
			b
			c*/
	}
	
	
}}
