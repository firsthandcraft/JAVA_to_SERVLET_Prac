package step1;

import java.util.HashMap;

public class TestMap1 {
public static void main(String[] args) {
	HashMap map=new HashMap();
	map.put("IU","아이유");
	map.put("boa","보아");
	System.out.println(map.size());//2
	System.out.println(map);//{boa=보아, IU=아이유}
	System.out.println(map.get("boa"));//보아
	map.put("IU","현아");
	System.out.println(map);//{boa=보아, IU=현아}
	
	//key 의 존재 유무를 true/false로 리턴
	boolean flag = map.containsKey(map);
	System.out.println(flag);//false
	map.remove("IU");
	System.out.println(map.isEmpty());//false
	System.out.println(map);//{boa=보아}
	map.clear();
	System.out.println(map);//{}
}}
