package step7;

import java.util.Scanner;

public class TestMonth {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	MonthService service = new MonthService();
	service.input(sc);
	service.printIfDay();
//	service.printIfDay(2); Scanner �Ⱦ���� Ŭ������ void printIfDay(int i)����
	service.printSwitchDay();
}
}
