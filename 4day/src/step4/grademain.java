package step4;

public class grademain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grade g =new grade();
		float tot;
		//Ŭ������ ���Ҵ��Ű��
		g.name="ȫ�浿";
		g.kor=100;
		g.eng=90;
		g.math=80;
		tot=g.total=100+90+80;
		g.avg=tot/3;
		System.out.println(g.name);
		System.out.println(g.kor);
		System.out.println(g.eng);
		System.out.println(g.math);
		System.out.println(g.total);
		System.out.println(g.avg);
	}

}
