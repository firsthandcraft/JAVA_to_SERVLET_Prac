package step3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c드라이브에 java-costa 폴더 생성
		//java-costa 폴더에 output4.txt만들기
		//output4.txt 에test씀
		
//		FileReader(2byte)
//		FileWriter
//		InputStream()//stream =빨대//원형그대로 나옴 한글이 깨짐
//		OutputStream
//		InputStreamReader//채팅시 사용, 문자 한글 인식
		//close();//를 모두 넣어줘야한다. 
		
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
