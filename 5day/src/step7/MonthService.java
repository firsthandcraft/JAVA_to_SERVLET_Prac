package step7;

import java.util.Scanner;

public class MonthService {
/*�ش���� ������ ���� ����ϴ� �޼��� ����
 * 46911 -30��
 * 2- 28��
 * 135781012 - 31��
 * �׿� �߸��� �Է°�
 * */
     int i ;
     void input(Scanner sc) {
    	 System.out.println("1~12���� �ϳ��� ���ڷ� �Է��ϼ���");
    	 i = sc.nextInt();
     }
	void printIfDay() {
		if(i==4 || i==6 || i==9 || i==11) {
            System.out.println(i+"���� 30�ϱ��� �ֽ��ϴ�.");

		} else if(i==2) {
            System.out.println(i+"���� 28�ϱ��� �ֽ��ϴ�.");

		} else {
            System.out.println(i+"���� 31�ϱ��� �ֽ��ϴ�.");

		}
	}
	
	
	void printSwitchDay() {
        switch(i) {
        case 1: case 3: case 5: case 7: case 10: case 12:
            System.out.println(i+"���� 31�ϱ��� �ֽ��ϴ�.");
            break;
        case 2:
            System.out.println(i+"���� 28�ϱ��� �ֽ��ϴ�.");
            break;
        case 4: case 6: case 9: case 11:
            System.out.println(i+"���� 30�ϱ��� �ֽ��ϴ�.");
            break;  
        default:
            System.out.println("�߸��Է��Ͽ����ϴ�.");
        }
	}
	
	
}
