package step5;

import java.util.Scanner;

public class gradeInputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		gradeInput[]r=new gradeInput[3];
		
		//Ŭ������ �ٸ� ���� ������ϴµ� �ƹ��� �����ص��̸�, ������ �ٸ��� �̸������ �𸣰ڴ�.
		String name;
		int kor,eng,math,total=0,hap;
		int i=0;
		float ave;
		
		for(i=0;i<r.length;i++) {
	        System.out.println("�̸� ����, ����, ���� ���� �Է� : ");
	        r[i]=new gradeInput();
	        r[i].name=sc.next();
	        r[i].kor=sc.nextInt();
	        r[i].eng=sc.nextInt();
	        r[i].math=sc.nextInt();
	        r[i].total=r[i].kor+r[i].eng+r[i].math;
	        r[i].avg=(float)r[i].total/3;
		}
		for(i=0;i<r.length;i++) {
	        System.out.print("�̸�: "+r[i].name);
	        System.out.print("���� : "+r[i].kor);
	        System.out.print("���� : "+r[i].eng);
	        System.out.print("���� : "+r[i].math);
	        System.out.print("���� : "+r[i].total);
	        System.out.print("��� : "+r[i].avg);
			System.out.println("");
		}

	}

}
