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
	map.put("address","����� ���絿");
	//key = name.tel,address
	String key="";
	System.out.println("���� Ȯ���ϰ� ���� key�� �Է��ϼ��� : ");
	key=sc.next();
	if(map.containsKey(key)) {
		System.out.println("key"+key+"�� �� :"+map.get(key));
	} else {
		System.out.println("��ġ�Ǵ� key�� ����.");
	}
	
	
	System.out.println("==========================");
	System.out.println("\n map�� ��ü value��� 1");

	Object[] values=map.values().toArray();
	for(i=0;i<values.length;i++) {
		System.out.println((String)values[i]);
		/*����� ���絿
		aaa
		111*/
	}
	System.out.println("\n map�� ��ü value��� 2");
	Object[] keys=map.keySet().toArray();
	for(i=0;i<keys.length;i++) {
		System.out.println((String)keys[i]);
		/*address
		name
		tel*/
	}
	
	
}}

