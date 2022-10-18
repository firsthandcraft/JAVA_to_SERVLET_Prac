package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient { 

	public void go() throws UnknownHostException, IOException {
//		Socket socket = new Socket("192.168.7.230",5432); ���� �ǹ��̴�. 
		Socket socket = new Socket("localhost",5432);
		 OutputStream os =socket.getOutputStream();
		 PrintWriter pw =new PrintWriter(os,true);
		 InputStream is =System.in;
		 InputStreamReader ir =new InputStreamReader(is);
		 BufferedReader br = new BufferedReader(ir);
		 System.out.println("������ ������ �Է��ϼ��� : ");
		 String mess = br.readLine();
		 pw.print(mess);
		 System.out.println(""+mess+"������ ����");
		br.close();
		pw.close();
		socket.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClient ts =new TestClient();
		try {
			ts.go();
		} catch(UnknownHostException ue) {
			ue.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
