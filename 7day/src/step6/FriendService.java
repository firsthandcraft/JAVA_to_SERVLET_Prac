package step6;

public class FriendService {//입력 출력 삭제 수정등, 기능을 구현하는것 

	
	public void changeRef(Friend f) {
		f =new Friend("보아",25);
	}
	
	public void changeValue(Friend f) {
		f.setName("유이");//참조변수 f(주소값)

	}

}
