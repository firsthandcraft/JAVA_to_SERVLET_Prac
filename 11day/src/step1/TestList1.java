package step1;

import java.util.ArrayList;

public class TestList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist ��ü ����
		ArrayList list = new ArrayList();
		list.add("IU");//������ �߰�
		list.add("����");
		list.add("�迬��");
		//
		System.out.println(list.size());//3
		//�迭������ length�� ���� ���� arraylist�� size�� �������� ����
		System.out.println(list);//[IU, ����, �迬��]
		//arraylist���� tostring�� overriding�Ǿ��մ�. 
		System.out.println(list.get(0));//IU
		//0��° ���� �� IU ���
		
		list.add(2);//1.5���� �̻� ���� �ڵ����� ��ȯ wrapper class�ڵ����� �� �ִ�. 
		list.add(new Integer(1));// wrapper class ->�ڷ����� �ϳ��� Ŭ���� ó�� ����� ������
		//�ڷḦ �ϳ��� Ŭ������ ��� �����ְڴ�. ������ �ս� �߻��� ���� 
		
		System.out.println(list);//[IU, ����, �迬��, 2, 1]
		
		list.remove(4);
		System.out.println(list);//[IU, ����, �迬��, 1]
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		/*IU
		����
		�迬��
		2*/
		
		//list.clear();
		//System.out.println(list);//[]�� ������
		
		//list.removeAll(list);
		//System.out.println(list);//[]�� ������

	}

}
