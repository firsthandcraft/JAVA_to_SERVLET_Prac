package step8;

public class TestInterface3 {
public static void main(String[] args) {

	Player p1= new GomPlayer();
	Player p2= new Mp3Player();
	Player p3= new Cdplayer();
	
	PlayerService service = new PlayerService();
	service.simpleplay(p1);
	service.simpleplay(p2);
	service.simpleplay(p3);
	System.out.println("-------");
	Player pa[]= {p1,p2,p3};
	service.allplay(pa);
  /*���÷��̾� ������ ����Ѵ�.
	Mp3Player mp3 ���.
	CD �÷��̾� cd ����Ѵ�.
	-------
	���÷��̾� ������ ����Ѵ�.
	Mp3Player mp3 ���.
	CD�� �����Ѵ�.
	CD�� �����Ѵ�.
	CD �÷��̾� cd ����Ѵ�.*/
}}
