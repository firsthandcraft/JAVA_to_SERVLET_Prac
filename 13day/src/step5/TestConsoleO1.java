package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestConsoleO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			while(true) {
			System.out.println("ģ���̸��� ������");
			String str = br.readLine();
			if(str.equals("�׸�")) {
				break;
			}
			System.out.println("��������"+str);
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
