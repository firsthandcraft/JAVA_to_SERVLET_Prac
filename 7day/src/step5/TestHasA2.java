package step5;

public class TestHasA2 {
public static void main(String[] args) {
	Engineer e =new Engineer("����", new Notebook("��", 100));
	
	System.out.println(e.getName());//����
	System.out.println(e.getNotebook().getModel());//��
	System.out.println(e.getNotebook().getPrice());//100

	e.getNotebook().setPrice(200);
	e.getNotebook().setModel("��");
	
	System.out.println(e.getNotebook().getPrice());//200
	System.out.println(e.getNotebook().getModel());//��
}
}
