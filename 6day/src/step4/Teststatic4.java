package step4;

public class Teststatic4 {
public static void main(String[] args) {
	
	String s1="1";
	//���ڿ�(���� ������ ���ڿ�)�� ������ ��ȯ �ϴ°�
	//static �޼��� �̹Ƿ� Ŭ������.�޼���()�� ����
	//wraper class
	int i = Integer.parseInt(s1);
	
	String s2="8";
	int j= Integer.parseInt(s2);
	System.out.println(s1+s2);//18
	System.out.println(i+j);//9
	
}
}
