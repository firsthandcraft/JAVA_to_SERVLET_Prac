package step4;

import java.util.Scanner;

//����
public class GameMain {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	Character character = null;
	PlayGame pg = null;
	System.out.println("���ϴ� ĳ���͸� �����Ͻÿ�\n 1.��ī�� 2.������ 3.�̻��ؾ�");
	int x= sc.nextInt();
	
	
	switch(x) {
		case 1:
			character = new Picachu();
			break;
		case 2:
			character = new Gobook();
			break;
		case 3:
			character = new Lee();
			break;
		default:System.out.println("1-3�� ���ڸ� �Է¹ٶ�");
	}
	
	if(character==null) {
		System.out.println("������ �����մϴ�.");
		return; 
	
	} else {
		pg = new PlayGame(character);
	}

	while (true) {
		pg.printMenu(sc);
		
		if(pg.isExit()) {
			System.out.println("������ �����մϴ�.");
			break;
		} 
	}


}}
