package step2;

import java.util.ArrayList;

public class TestList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new FriendVO("����",22));
		list.add(new FriendVO("�¿�",23));
		list.add(new FriendVO("����ī",24));
		list.add(new FriendVO("����",25));
		list.add(new FriendVO("����",26));
		list.add(new FriendVO("����",27));
		list.add(new FriendVO("ȿ��",28));
		list.add(new FriendVO("���",29));
		list.add(new FriendVO("Ƽ�Ĵ�",21));
		System.out.println(list.size());//9
		//list�� toString()�� ���������� �Ǿ������� 
		//FriendVO�� ���� ���밪�� ���� ���ؼ��� 
		//FriendVO�� toString()���� �������̵� �Ǿ���Ѵ�. 
		System.out.println(list);
		//[FriendVO [name=����, age=22], FriendVO [name=�¿�, age=23], FriendVO [name=����ī, age=24], FriendVO [name=����, age=25], FriendVO [name=����, age=26], FriendVO [name=����, age=27], FriendVO [name=ȿ��, age=28], FriendVO [name=���, age=29], FriendVO [name=Ƽ�Ĵ�, age=21]]

		//FriendVO�� toString()���� �������̵� ���ش�.
		//0�� �ε����� �̸��� ���
		//list.get()�� object������ ��ȯ������ 
		//FreindVO�� getName()�� ȣ���ϱ� ���ؼ��� 
		//Object casting�� �ʿ��ϴ�. 
		FriendVO vo1=(FriendVO)list.get(0);
		System.out.println(vo1.getName());//����
		
		//�ε��� 8�� ���� ���
		//list.get(8);
		FriendVO vo2=(FriendVO)list.get(8);
		System.out.println(vo2.getAge());//����
		System.out.println("***list ���� ����� �̸��� ��� ���***");
		for(int i=0; i<list.size();i++) {
			FriendVO vo3=(FriendVO)list.get(i);
			System.out.println(vo3.getName());
			/*	����
				�¿�
				����ī
				����
				����
				����
				ȿ��
				���
				Ƽ�Ĵ�*/
		}
		System.out.println("***list ���� ����� 25�� �̻��� �̸��� ���***");
		for(int i=0; i<list.size();i++) {
			FriendVO vo3=(FriendVO)list.get(i);
			if(vo3.getAge()>25) {
			System.out.println(vo3.getName());
			/*	����
				����
				ȿ��
				���*/
				}
		}
		
		//Ÿ�� �̸� �����ϱ� down casting((FriendVO)list)�� ��������
	}}
