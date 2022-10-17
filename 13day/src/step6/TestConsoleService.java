package step6;

import java.io.IOException;

public class TestConsoleService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleService service = new ConsoleService();
		try {
			service.order("C:\\java-kosta\\iotest\\step3\\order.txt");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
