package step3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestInput {
	//c드라이브에 java-costa 폴더 생성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw =new FileWriter("C:\\java-kosta\\output4.txt");
			PrintWriter pw = new PrintWriter(fw,true);//true는 누적
			pw.println("크리스탈2");
			System.out.println("데이터기록");
			pw.close();
		}catch(IOException e) {
			e.printStackTrace(); 
		}
	}

}
