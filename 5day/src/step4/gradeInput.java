package step4;

import java.util.Scanner;

public class gradeInput {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int hap;
	float avg;

	void input(Scanner sc) {//Scanner sc�� �Ű����� �Է±��
		System.out.println("�̸�");
		name =sc.next();
		System.out.println("����");
		kor=sc.nextInt();
		System.out.println("����");
		eng=sc.nextInt();
		System.out.println("����");
		math=sc.nextInt();
	}
	void tot() {//����̶� �Ű� ������ �ʿ����. 
		total=kor+eng+math;
	}
	void avg() {
		avg = (float)total/3;

	}
	void print() {//�ڷ����� ����.  ��±��
		System.out.println(name+":"+kor+eng+math);
		System.out.println(total);
		System.out.println(avg);

	}

}
