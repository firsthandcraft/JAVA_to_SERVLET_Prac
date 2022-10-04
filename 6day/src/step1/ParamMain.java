package step1;

public class ParamMain {
 public static void main(String[] args) {
	
	Add a = new Add();
	int result_int;
	float result_float ,x=3.2f,y=8.5f;
	String result_string;
	
	result_int = a.add_int(3,5);
	System.out.println(result_int);//8
	
	result_float = a.add_float(x,y);
	System.out.println(result_float);//11.7
	
	result_string=a.add_string("aaa","bbb");
	System.out.println(result_string);//aaabbb
 }
}
