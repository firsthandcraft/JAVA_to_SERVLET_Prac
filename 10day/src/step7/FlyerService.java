package step7;

import step5.Flyer;

public class FlyerService {
	//넘어오는 모든 객체를 다 fly()시킨다.
	public void enter(Flyer f) {
		f.fly();
	}
	//
	public void enter(Flyer[] f) {
		for(int i=0; i<f.length;i++) {
			f[i].fly();
		}
	}
}
