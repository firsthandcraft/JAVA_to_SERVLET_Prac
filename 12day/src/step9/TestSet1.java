package step9;

import java.util.HashSet;
import java.util.Set;

public class TestSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�÷��� : List set()
		//map : 
		//hashset
		Set set= new HashSet();
		set.add("������");
		set.add("����");
		set.add("������");
		
		System.out.println(set.size());//2
		//set�� Ư¡�� �ߺ��� ��� ���Ѵ�. ���� ���� ������� �ʴ´�.
		System.out.println(set);//[����, ������]
		set.add("��ٶ��");
		
		set.remove("����");
		
		System.out.println(set);//[������]
		System.out.println(set.contains("��ٶ��"));//true
//		set.clear();
		set.removeAll(set);
		System.out.println(set);
		

		
	}

}
