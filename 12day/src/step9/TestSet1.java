package step9;

import java.util.HashSet;
import java.util.Set;

public class TestSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컬렉션 : List set()
		//map : 
		//hashset
		Set set= new HashSet();
		set.add("아이유");
		set.add("보아");
		set.add("아이유");
		
		System.out.println(set.size());//2
		//set의 특징은 중복을 허용 안한다. 같은 값을 허용하지 않는다.
		System.out.println(set);//[보아, 아이유]
		set.add("산다라박");
		
		set.remove("보아");
		
		System.out.println(set);//[아이유]
		System.out.println(set.contains("산다라박"));//true
//		set.clear();
		set.removeAll(set);
		System.out.println(set);
		

		
	}

}
