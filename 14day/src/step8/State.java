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
		//	vp.addElement(new Peasant()); //vector �������� Element�� ����
			vp.add(new Peasant());
		}
	}
	public void makeP() {//��� ����
		vp.add(new Peasant());
		mineral-=20;
		vp.elementAt(vp.size()-1).start();//������ ��ŭ ���� �Ѵ�. 
	}
	public void add() {//��� �̳׶� ����
		mineral+=5;
	}
	public void sub(int x) {//
		mineral-=x;
	}
	public void makeS() {//���� ����
		vs.add(new Soldier());
		mineral-=30; 
	}
	public void print() {//��� �̳׶� ����
		System.out.println("mineral : "+ mineral);
		System.out.println("��μ�  : "+ vp.size());
		System.out.println("����� : "+ vs.size());
	}
}
