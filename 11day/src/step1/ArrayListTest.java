package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <String> al= new ArrayList <String>();
		al.add("aaa");
		al.add("bbb");
		al.add(1,"ccc");
		/*0��°���aaa
		1��°���ccc
		2��°���bbb
		*/
		al.set(2,"fff");//�����͸� �ٽ� ���� -- 2��°���bbb�� �ٲ���
		
		for(int i =0; i<al.size();i++) {
			System.out.println(i+"��°���"+al.get(i));
		
		/*0��°���aaa
		1��°���ccc
		2��°���fff*/
		//set �ٽ� �����͸� �����Ѵ�. 
		}
		System.out.println("�˻��� ���� �Է��϶�:");
		String srh=sc.next();
		int idx =0;
		if(al.contains(srh)) {//contain���ԵǾ��ִ°��� ������ true ������ false
			idx=al.indexOf(srh);//����Ʈ�� ����� �������� ��ġ�� ã���ش�.			
			System.out.println(al.indexOf(srh));
		} else {
			System.out.println("ã�� ���� ����.");
		}
		//���
		for(int i =0; i<al.size();i++) {
			System.out.println(i+"��°���"+al.get(i));
		}
		

		System.out.println("������ ���� �Է��϶�:");
		srh=sc.next();
		idx=0;
		if(al.contains(srh)) {//contain���ԵǾ��ִ°��� ������ true ������ false
			idx=al.indexOf(srh);//����Ʈ�� ����� �������� ��ġ�� ã���ش�.			
			al.remove(idx);//������ �ȴ�.
		} else {
			System.out.println("ã�� ���� ����.");
		}
		//���
		for(int i =0; i<al.size();i++) {
			System.out.println(i+"��°���"+al.get(i));
		}
		
		//
		System.out.println("��ü ����");
		al.removeAll(al);
		//al.clear();//�� �����ϴ�. 
		if(al.isEmpty()) {//contain���ԵǾ��ִ°��� ������ true ������ false
			System.out.println("����Ʈ�� ����ִ�. ");

		} else {
			//���
			for(int i =0; i<al.size();i++) {
				System.out.println(i+"��°���"+al.get(i));
			}
		}
		
		
	}}
