package step4;

import java.io.File;
import java.io.IOException;

public class TestFileUtil {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileUtil fu =new FileUtil();
		String fileName="C:\\java-kosta\\iotest\\step1\\data.txt";

		
		//초기 셋팅 파일 폴더 생성하기
		File dir= new File("C:\\java-kosta\\iotest");
		if(!dir.exists()) {
			System.out.println("디렉토리 생성");
			dir.mkdir();
		}
		File dir2= new File("C:\\java-kosta\\iotest\\step1");
		if(!dir2.exists()) {
			System.out.println("디렉토리 생성");
			dir2.mkdir();
		}
		
		File filei=new File("C:\\java-kosta\\files\\data.txt");
		filei.createNewFile();
		
		//
		try {
			fu.writeData(fileName, "숑태");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			fu.readFile(fileName);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		String destName="C:\\java-kosta\\iotest\\setp2\\copy_data.txt";
		try {
			fu.copyFile(fileName,destName);
		}catch(IOException e) {
			e.printStackTrace();
		
		}}

}
