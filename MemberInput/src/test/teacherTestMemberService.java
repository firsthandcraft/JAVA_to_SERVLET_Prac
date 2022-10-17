package test;



import java.util.List;
import java.util.Vector;

public class teacherTestMemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Board> list = new Vector<>(); //Vector 컬렉션 저장
	
	//작업 스레드 객체 생성
	Thread threadA =new Thread() {
		@Override
		public void run() {
			//객체 1000개 추가
			for(int i=1; i<=1000; i++) {
				list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
			}
		}
	};
	
	//작업스레드 객체 생성
	Thread threadB = new Thread() {
		@Override
		public void run() {
			//객체 1000개 추가
			for(int i=1001; i<=2000; i++) {
				list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
			}
		}
	};
	
	//작업스레드 실행
	threadA.start();
	threadB.start();
	
	//작업 스레드들이 모두 종료될때 까지 메인 스레드를 기다리게 함
	try {
		threadA.join();
		threadB.join();
	} catch (Exception e){
		
	}
	
	//저장된 총 객체 수 얻기 
	int size = list.size();
	System.out.println("총객체 수 : "+size);
	System.out.println();
	}}
