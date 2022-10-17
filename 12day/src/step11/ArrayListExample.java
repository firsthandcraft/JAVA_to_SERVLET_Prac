package step11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList �÷��� ����
		List<p643Board> list = new ArrayList<>();
		
		//��ü �߰� 
		list.add(new p643Board("����1", "����1", "�۾���1"));
		list.add(new p643Board("����2", "����2", "�۾���2"));
		list.add(new p643Board("����3", "����3", "�۾���3"));
		list.add(new p643Board("����4", "����4", "�۾���4"));
		list.add(new p643Board("����5", "����5", "�۾���5"));
		
		//����� �� ��ü �� ���
		int size = list.size();
		System.out.println("�Ѱ�ü ��"+size);//�Ѱ�ü�� 5
		System.out.println(list);//[step11.p643Board@379619aa, step11.p643Board@cac736f, step11.p643Board@5e265ba4, step11.p643Board@156643d4, step11.p643Board@123a439b]
		//ToString�� �ȼ��� �ҽ� �ּҰ��� ���´�. 
		System.out.println(list.toString());
		
		//Ư�� �ε����� ��ü �������� 
		p643Board board = list.get(2);
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
		//����3	����3	�۾���3
		System.out.println("------------");
		
		//��� ��ü�� �ϳ��� ��������
		for(int i=0;i<list.size();i++) {
			p643Board b=list.get(i);
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
			/*����1	����1	�۾���1
			����2	����2	�۾���2
			����3	����3	�۾���3
			����4	����4	�۾���4
			����5	����5	�۾���5*/
			
		}
	
	
	
	}
	}
