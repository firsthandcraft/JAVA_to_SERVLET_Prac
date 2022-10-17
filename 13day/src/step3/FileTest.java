package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	//IO 는 반드시 예외처리 하기  throws IOException
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//메모장 자동 생성
		//fileTest파일을 지우고 실행시 생성된다.
		File file=new File("C:\\java-kosta\\fileTest.txt");
		//
		if(!file.exists()){
			System.out.println("파일을 생성합니다.");
			file.createNewFile();
			BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			
			int ch; 
			String path=file.getPath();
			System.out.println("path"+path);
			if(file.canWrite()) {
				System.out.println("쓰기 기능 파일");
				bw.write("hello");
				bw.flush();//출력
			}
			if(file.canRead()) {
				System.out.println("읽기 기능 파일");
				while((ch=br.read()) !=-1) {
					System.out.println((char)ch);
				}
			}
			if(file.canExecute()) {
				System.out.println("실행가능파일");
			}
			if(file.isFile()) {
				System.out.println("파일입니다.");
			}
			if(file.isHidden()) {
				System.out.println("숨김속성입니다.");
			}
			
			long size =file.length();
			System.out.println("파일크기 : "+size);
			System.out.println(path+"파일을삭제한다.");
			
			file.delete();
			File dir= new File("C:\\java-kosta\\files");
			if(!dir.exists()) {
				System.out.println("디렉토리 생성");
				dir.mkdir();
			}
			
			String []  fileNames = dir.list();
			System.out.println("파일 목록");
			
			for(ch=0; ch<fileNames.length;ch++) {
				System.out.println(fileNames[ch]);
				
			}
			br.close();
			bw.close();
		}
	}}
