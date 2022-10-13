package step8;

public class PlayerService {
	public void simpleplay(Player p) {
		p.play();
	}
	public void allplay(Player [] pa) {
		for(int i=0;i<pa.length;i++) {
			if(pa[i] instanceof Cdplayer) {
				
				Player p =(Player)pa[i];
				((Cdplayer)p).insertCd();
				((Cdplayer)pa[i]).insertCd();
			}
			pa[i].play();
		}
	}
	
}
