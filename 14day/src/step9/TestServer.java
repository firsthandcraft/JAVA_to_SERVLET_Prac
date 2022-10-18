package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TestServer { 

	public void go() throws IOException {//�������� throws IOException
		ServerSocket serverSocket = new ServerSocket(5432);
		System.out.println("*** ���� ������ ***");
		//������������ ��Ʈ�� �����ְ� 
		try {
			while(true) {
				//����ϴٰ� Ŭ���̾�Ʈ �����ϸ� ����ȴ�. �Ϲ� ������ ��ȯ�Ѵ�.
				//Ŭ���̾�Ʈ �Ϲ� �����̶� ��ȭ�Ѵ�.
				
				//socket�� ���� ����
				Socket socket = serverSocket.accept();
				InputStream is =socket.getInputStream();
				//ó���ӵ��� ���� �Ҽ� �հ�InputStreamReader
				InputStreamReader ir =new InputStreamReader(is);
				//������Ʈ�� Ű����߷��� �޾ƿ´�.
				BufferedReader br =new BufferedReader(ir);
				
				try {
					System.out.println(socket.getInetAddress()+"���� ��"+br.readLine());
				} catch(IOException ie) {
//					ie.printStackTrace();
					System.out.println(socket.getInetAddress()+"�� �����͸� ���� ������ �߻�...");
				}
				br.close();
				socket.close();
			}
		} finally {
			if(serverSocket != null) {
				serverSocket.close();
			}
		}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		TestServer ts = new TestServer();
		
		try {
			ts.go();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
//���� ����� ���� ���� ������ ���콺 ���� �� ����� �ٽ� �����ϱ�
}
