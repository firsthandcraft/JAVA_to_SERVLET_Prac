package step5;

public class TestHasA2 {
public static void main(String[] args) {
	Engineer e =new Engineer("°í½½¸µ", new Notebook("µ¨", 100));
	
	System.out.println(e.getName());//°í½½¸µ
	System.out.println(e.getNotebook().getModel());//µ¨
	System.out.println(e.getNotebook().getPrice());//100

	e.getNotebook().setPrice(200);
	e.getNotebook().setModel("´Ò");
	
	System.out.println(e.getNotebook().getPrice());//200
	System.out.println(e.getNotebook().getModel());//´Ò
}
}
