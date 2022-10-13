package step4;

import java.util.Scanner;

//공통
public class PlayGame{
	//객체 생성 가능
	private Character character;
	private int menu;
	private boolean exit;
	
	//casting
	public PlayGame(Character character) {
		this.character=character;
	}
	
	public void printMenu(Scanner sc) {
		System.out.println("1.밥먹기 2.잠재우기 3.놀아주기 4.운동하기 5.종료");		
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
			System.out.println("1-5까지만 입력하세요.");
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
