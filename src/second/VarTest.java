package second;

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a =true;
		byte b =10;
		short c =20;
		
		int d = 30;
		long e = 40;
		
		//한글자만 가능
		char h ='k';
		String i = "hello java";
		
		//소수점
		float f =12.5f;
		//int 정수형에 소수점을 붙이면 빨간줄 오류가 뜬다. 
//		int d = 31.2;
		//소숫점 두개까지 가능
		double g = 34.56;
		
		System.out.println("boolean :"+a);
		System.out.println("byte :"+b);
		System.out.println("short :"+c);
		System.out.println("int :"+d);
		System.out.println("long :"+e);
		System.out.println("float :"+f);
		System.out.println("bouble :"+g);
		System.out.println("char :"+h);
		System.out.println("String :"+i);
		

	}

}
