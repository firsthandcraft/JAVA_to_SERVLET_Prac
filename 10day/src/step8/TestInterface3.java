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
  /*곰플레이어 동영상 재생한다.
	Mp3Player mp3 재생.
	CD 플레이어 cd 재생한다.
	-------
	곰플레이어 동영상 재생한다.
	Mp3Player mp3 재생.
	CD를 삽입한다.
	CD를 삽입한다.
	CD 플레이어 cd 재생한다.*/
}}
