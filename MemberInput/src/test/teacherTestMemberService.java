package test;



import java.util.List;
import java.util.Vector;

public class teacherTestMemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Board> list = new Vector<>(); //Vector �÷��� ����
	
	//�۾� ������ ��ü ����
	Thread threadA =new Thread() {
		@Override
		public void run() {
			//��ü 1000�� �߰�
			for(int i=1; i<=1000; i++) {
				list.add(new Board("����"+i,"����"+i,"�۾���"+i));
			}
		}
	};
	
	//�۾������� ��ü ����
	Thread threadB = new Thread() {
		@Override
		public void run() {
			//��ü 1000�� �߰�
			for(int i=1001; i<=2000; i++) {
				list.add(new Board("����"+i,"����"+i,"�۾���"+i));
			}
		}
	};
	
	//�۾������� ����
	threadA.start();
	threadB.start();
	
	//�۾� ��������� ��� ����ɶ� ���� ���� �����带 ��ٸ��� ��
	try {
		threadA.join();
		threadB.join();
	} catch (Exception e){
		
	}
	
	//����� �� ��ü �� ��� 
	int size = list.size();
	System.out.println("�Ѱ�ü �� : "+size);
	System.out.println();
	}}
