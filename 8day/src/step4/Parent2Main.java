package step4;

public class Parent2Main {
public static void main(String[] args) {
	GrandParent gp =new GrandParent();
	//GrandParent�� ������
	gp.name ="���θ�";
	gp.age=80;
	gp.printGrandParentInfo();//name���θ�//age80
	
	System.out.println("===============");

	Parent2 p = new Parent2();
	//GrandParent�� ������//Parent2�� ������
	p.name="�θ�";
	p.age=50;
	p.job="ȸ���";
	p.printGrandParentInfo();//name�θ�//age50
	p.printParentInfo();//name�θ�//age50//jobȸ���
	
	System.out.println("===============");

	Child2 c = new Child2();
	//GrandParent�� ������//Parent2�� ������//Child2 ������
	c.name="�ڽ�";
	c.age=20;
	c.job="�л�";
	c.hobby="Ŭ���̹�";
	c.printGrandParentInfo();//name�ڽ�//age20
	c.printParentInfo();//name�ڽ�//age20//job�л�
	c.printChildInfo();//name�ڽ�//age20//job�л�//hobbyŬ���̹�
}
}
