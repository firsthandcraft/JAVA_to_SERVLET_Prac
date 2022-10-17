package step2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap2 {
public static void main(String[] args) {
	
	HashMap map = new HashMap();
	map.put("a",new FriendVO("손연재","태릉",200));
	map.put("b",new FriendVO("크리스탈","노량지ㅏㄴ",300));
	map.put("c",new FriendVO("소지ㅓㅅㅂ","파교",400));
	System.out.println(map);
	//{a=FriendVO [name=손연재, address=태릉, money=200], b=FriendVO [name=크리스탈, address=노량지ㅏㄴ, money=300], c=FriendVO [name=소지ㅓㅅㅂ, address=파교, money=400]}

	FriendVO vo = (FriendVO)map.get("c");
	System.out.println(vo.getName()+""+vo.getAddress());//소지ㅓㅅㅂ파교
	System.out.println(map.get("C"));//key값은 대소문자 구별한다.//null
	
	Set set=map.keySet();
	Iterator it =set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		/* a
			b
			c*/
	}
	System.out.println("map의 value들만 출력");
	Collection col = map.values();
	Iterator it2 =set.iterator();//자료구조의 데이터블만 들어갈수 있게 출력
	while(it2.hasNext()) {
		System.out.println(it2.next());
		/* a
			b
			c*/
	}
	
	
}}
