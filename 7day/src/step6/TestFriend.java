package step6;

public class TestFriend {
public static void main(String[] args) {
	
	Friend f = new Friend("������",20);
	FriendService service = new FriendService();
	service.changeRef(f);
	System.out.println(f.getName()+""+f.getAge());//������ 20
	System.out.println(f.getName()+""+f.getAge());//������ 20
	
	service.changeValue(f);
	System.out.println(f.getName()+""+f.getAge());//���� 20
	
	
}
}
