package step12;

public class TestMemberVO {
 public static void main(String[] args) {
	
	 //��ü����
	 Member vo =new Member("java", "abcd");
	 vo.setJob("���α׷���");
	 System.err.println(vo.getId()+""+vo.getPassword()+""+vo.getJob());
	 //javaabcd���α׷���
 	}
}
