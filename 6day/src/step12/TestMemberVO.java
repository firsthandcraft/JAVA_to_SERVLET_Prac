package step12;

public class TestMemberVO {
 public static void main(String[] args) {
	
	 //객체생성
	 Member vo =new Member("java", "abcd");
	 vo.setJob("프로그래머");
	 System.err.println(vo.getId()+""+vo.getPassword()+""+vo.getJob());
	 //javaabcd프로그래머
 	}
}
