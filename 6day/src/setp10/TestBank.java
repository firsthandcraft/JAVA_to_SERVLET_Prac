package setp10;

import bank.hana.HanaBank;
import bank.kb.KbBank;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KbBank kb = new KbBank();//
		kb.deposit(500);//500�ԱݿϷ�
		
		HanaBank hana =new HanaBank();
		int result=hana.withdraw();
		System.out.println(result);
	}

}
