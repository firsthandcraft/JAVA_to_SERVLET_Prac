package step3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c����̺꿡 java-costa ���� ����
		//java-costa ������ output4.txt�����
		//output4.txt ��test��
		
//		FileReader(2byte)
//		FileWriter
//		InputStream()//stream =����//�����״�� ���� �ѱ��� ����
//		OutputStream
//		InputStreamReader//ä�ý� ���, ���� �ѱ� �ν�
		//close();//�� ��� �־�����Ѵ�. 
		
		try{
			FileReader fr =new FileReader("C:\\java-kosta\\output4.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			while(str!=null) {
				System.out.println(str);
				str = br.readLine();
			}
			br.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}}
