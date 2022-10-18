package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Socket;
import java.net.SocketException;

public class TestClient2 {

	private Socket socket;
	private BufferedReader sysbr;//�ַܼ� ���� �Է¹޴� ��Ʈ��
	private PrintWriter pw; // ������ �����͸� ����ϴ� ��Ʈ��
	private BufferedReader serverBr;//�������� ���� �����͸� �Է¹޴� ��Ʈ��
	
	public void go() throws IOException{
		
		try {
			socket = new Socket("localhost",5432);
			sysbr = new BufferedReader(new InputStreamReader(System.in));
			serverBr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 pw= new PrintWriter(socket.getOutputStream(),true);
				
			while(true) {

				String mess=sysbr.readLine(); 
				if(mess.equals("exit")) {
					System.out.println("�۾�����");
					break;
				}
				pw.println(mess);
				System.out.println(serverBr.readLine());

			}
				
		} finally {
			closeAll();
		}
	}
	public void closeAll() throws IOException{
		if(serverBr != null) 
			serverBr.close();
		if(sysbr != null) 
			sysbr.close();
		if(pw != null) 
			pw.close();
		if(socket !=null)
			socket.close();
	
	}
	
	
	
public static void main(String[] args) {
	TestClient2 ts= new TestClient2();
	try {
		ts.go();
	} catch(IOException e) {
		e.printStackTrace();
	}
}
}
