package step4;

import java.util.Scanner;

//����
public class PlayGame{
	//��ü ���� ����
	private Character character;
	private int menu;
	private boolean exit;
	
	//casting
	public PlayGame(Character character) {
		this.character=character;
	}
	
	public void printMenu(Scanner sc) {
		System.out.println("1.��Ա� 2.������ 3.����ֱ� 4.��ϱ� 5.����");		
		menu = sc.nextInt();
		play();
	}
	
	public void play() {
		switch(menu) {
		case 1:
			character.eat();
			System.out.println("");
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			exit = character.play();
			break;
		case 4:
			exit= character.train();
			break;
		case 5:
			exit= true;
			break;
		default:
			System.out.println("1-5������ �Է��ϼ���.");
			;
		}
		character.printInfo();
	}
	//setgetmethod
	public Character getCharacter() {
			return character;
		}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}
	


}
