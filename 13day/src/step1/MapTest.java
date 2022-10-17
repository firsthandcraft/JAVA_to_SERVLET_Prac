package step1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i;
	Map<String,String>map=new HashMap<String,String>();
	map.put("name","aaa");
	map.put("tel","111");
	map.put("address","서울시 양재동");
	//key = name.tel,address
	String key="";
	System.out.println("값을 확인하고 싶은 key를 입력하세요 : ");
	key=sc.next();
	if(map.containsKey(key)) {
		System.out.println("key"+key+"의 값 :"+map.get(key));
	} else {
		System.out.println("일치되는 key가 없다.");
	}
	
	
	System.out.println("==========================");
	System.out.println("\n map의 전체 value출력 1");

	Object[] values=map.values().toArray();
	for(i=0;i<values.length;i++) {
		System.out.println((String)values[i]);
		/*서울시 양재동
		aaa
		111*/
	}
	System.out.println("\n map의 전체 value출력 2");
	Object[] keys=map.keySet().toArray();
	for(i=0;i<keys.length;i++) {
		System.out.println((String)keys[i]);
		/*address
		name
		tel*/
	}
	
	
}}

