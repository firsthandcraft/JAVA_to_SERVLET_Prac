package step3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestInput {
	//c����̺꿡 java-costa ���� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw =new FileWriter("C:\\java-kosta\\output4.txt");
			PrintWriter pw = new PrintWriter(fw,true);//true�� ����
			pw.println("ũ����Ż2");
			System.out.println("�����ͱ��");
			pw.close();
		}catch(IOException e) {
			e.printStackTrace(); 
		}
	}

}
