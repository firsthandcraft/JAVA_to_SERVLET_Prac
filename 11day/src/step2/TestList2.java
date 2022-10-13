package step2;

import java.util.ArrayList;

public class TestList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new FriendVO("윤아",22));
		list.add(new FriendVO("태연",23));
		list.add(new FriendVO("제시카",24));
		list.add(new FriendVO("유리",25));
		list.add(new FriendVO("서현",26));
		list.add(new FriendVO("수영",27));
		list.add(new FriendVO("효연",28));
		list.add(new FriendVO("써니",29));
		list.add(new FriendVO("티파니",21));
		System.out.println(list.size());//9
		//list의 toString()은 오버라이팅 되어있지만 
		//FriendVO의 실제 내용값을 보기 위해서는 
		//FriendVO의 toString()또한 오버라이딩 되어야한다. 
		System.out.println(list);
		//[FriendVO [name=윤아, age=22], FriendVO [name=태연, age=23], FriendVO [name=제시카, age=24], FriendVO [name=유리, age=25], FriendVO [name=서현, age=26], FriendVO [name=수영, age=27], FriendVO [name=효연, age=28], FriendVO [name=써니, age=29], FriendVO [name=티파니, age=21]]

		//FriendVO의 toString()또한 오버라이딩 해준다.
		//0번 인덱스의 이름만 출력
		//list.get()은 object형으로 반환함으로 
		//FreindVO의 getName()을 호출하기 위해서는 
		//Object casting이 필요하다. 
		FriendVO vo1=(FriendVO)list.get(0);
		System.out.println(vo1.getName());//윤아
		
		//인덱스 8의 나이 출력
		//list.get(8);
		FriendVO vo2=(FriendVO)list.get(8);
		System.out.println(vo2.getAge());//윤아
		System.out.println("***list 안의 요소의 이름을 모두 출력***");
		for(int i=0; i<list.size();i++) {
			FriendVO vo3=(FriendVO)list.get(i);
			System.out.println(vo3.getName());
			/*	윤아
				태연
				제시카
				유리
				서현
				수영
				효연
				써니
				티파니*/
		}
		System.out.println("***list 안의 요소중 25세 이상인 이름만 출력***");
		for(int i=0; i<list.size();i++) {
			FriendVO vo3=(FriendVO)list.get(i);
			if(vo3.getAge()>25) {
			System.out.println(vo3.getName());
			/*	서현
				수영
				효연
				써니*/
				}
		}
		
		//타입 미리 설정하기 down casting((FriendVO)list)이 귀찮을때
	}}
