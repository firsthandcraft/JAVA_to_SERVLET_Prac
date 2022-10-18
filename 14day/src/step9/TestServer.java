package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TestServer {

	public void go() throws IOException {//예외적용 throws IOException
		ServerSocket serverSocket = new ServerSocket(5432);
		System.out.println("*** 서버 수행중 ***");
		//서버소켓으로 포트를 열어주고 
		try {
			while(true) {
				//대기하다가 클라이언트 접속하면 실행된다. 일반 소켓을 반환한다.
				//클라이언트 일반 소켓이랑 대화한다.
				
				//socket은 개별 상담원
				Socket socket = serverSocket.accept();
				InputStream is =socket.getInputStream();
				//처리속도를 빨리 할수 잇게InputStreamReader
				InputStreamReader ir =new InputStreamReader(is);
				//
				BufferedReader br =new BufferedReader(ir);
				
				try {
					System.out.println(socket.getInetAddress()+"님의 말"+br.readLine());
				} catch(IOException ie) {
//					ie.printStackTrace();
					System.out.println(socket.getInetAddress()+"의 데이터를 읽은 문제가 발생...");
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
//서버 실행시 오류 나옴 오른쪽 마우스 서버 다 지우고 다시 실행하기
}
