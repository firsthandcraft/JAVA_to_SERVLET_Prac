package step7;

import step5.Flyer;

public class FlyerService {
	//�Ѿ���� ��� ��ü�� �� fly()��Ų��.
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
