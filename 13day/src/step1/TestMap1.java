package step1;

import java.util.HashMap;

public class TestMap1 {
public static void main(String[] args) {
	HashMap map=new HashMap();
	map.put("IU","������");
	map.put("boa","����");
	System.out.println(map.size());//2
	System.out.println(map);//{boa=����, IU=������}
	System.out.println(map.get("boa"));//����
	map.put("IU","����");
	System.out.println(map);//{boa=����, IU=����}
	
	//key �� ���� ������ true/false�� ����
	boolean flag = map.containsKey(map);
	System.out.println(flag);//false
	map.remove("IU");
	System.out.println(map.isEmpty());//false
	System.out.println(map);//{boa=����}
	map.clear();
	System.out.println(map);//{}
}}
