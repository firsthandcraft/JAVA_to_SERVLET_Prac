package step8;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.util.Vector;

public class State {
	public int mineral;
	public Vector<Peasant>vp;
	public Vector<Soldier>vs;

	public State() {
		mineral =0;
		vp= new Vector<Peasant>();
		vs = new Vector<Soldier>();
		for(int i =0; i<3;i++) {
		//	vp.addElement(new Peasant()); //vector 옛날에는 Element를 붙임
			vp.add(new Peasant());
		}
	}
	public void makeP() {//농부 생성
		vp.add(new Peasant());
		mineral-=20;
		vp.elementAt(vp.size()-1).start();//사이즈 만큼 감소 한다. 
	}
	public void add() {//농부 미네랄 추출
		mineral+=5;
	}
	public void sub(int x) {//
		mineral-=x;
	}
	public void makeS() {//군인 생성
		vs.add(new Soldier());
		mineral-=30; 
	}
	public void print() {//농부 미네랄 추출
		System.out.println("mineral : "+ mineral);
		System.out.println("농부수  : "+ vp.size());
		System.out.println("군사수 : "+ vs.size());
	}
}
