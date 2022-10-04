package step7;

import java.util.Scanner;

public class TestMonth {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	MonthService service = new MonthService();
	service.input(sc);
	service.printIfDay();
//	service.printIfDay(2); Scanner 안쓸경우 클래스에 void printIfDay(int i)지정
	service.printSwitchDay();
}
}
