package step6;

import java.util.Scanner;

//����ó�� �����
public class ScoreBoard {
	int i;
	void input(Scanner sc) {//Scanner sc�� �Ű����� �Է±��
		System.out.println("������ �Է��ϼ��� : ");
		i =sc.nextInt();
	}
	public void prinrScore() {
		//�������� 
		String str = null;
		if(i>=90 && i<=100) {
		    str ="A";
		} else if(i>=80 && i<=89) {
			str ="B";
		} else if(i>=70 && i<=79) {
			str ="C";
		} else if(i>=60 && i <=69) {
			str ="D";
		} else {
			str ="F";
		}
	    System.out.println(str);

	}
	//��������
	
}
