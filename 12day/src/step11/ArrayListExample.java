package step11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList 컬렉션 생성
		List<p643Board> list = new ArrayList<>();
		
		//객체 추가 
		list.add(new p643Board("제목1", "내용1", "글쓴이1"));
		list.add(new p643Board("제목2", "내용2", "글쓴이2"));
		list.add(new p643Board("제목3", "내용3", "글쓴이3"));
		list.add(new p643Board("제목4", "내용4", "글쓴이4"));
		list.add(new p643Board("제목5", "내용5", "글쓴이5"));
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총객체 수"+size);//총객체수 5
		System.out.println(list);//[step11.p643Board@379619aa, step11.p643Board@cac736f, step11.p643Board@5e265ba4, step11.p643Board@156643d4, step11.p643Board@123a439b]
		//ToString을 안선언 할시 주소값이 나온다. 
		System.out.println(list.toString());
		
		//특정 인덱스의 객체 가져오기 
		p643Board board = list.get(2);
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
		//제목3	내용3	글쓴이3
		System.out.println("------------");
		
		//모든 객체를 하나씩 가져오기
		for(int i=0;i<list.size();i++) {
			p643Board b=list.get(i);
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
			/*제목1	내용1	글쓴이1
			제목2	내용2	글쓴이2
			제목3	내용3	글쓴이3
			제목4	내용4	글쓴이4
			제목5	내용5	글쓴이5*/
			
		}
	
	
	
	}
	}
