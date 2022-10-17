package step4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtil {
//C:\\java-kosta\\iotest\\setp1\\data.txt
	String fileName="C:\\java-kosta\\iotest\\step1\\data.txt";

	

		public void writeData(String fileName,String content)throws IOException{
			File file=new File(fileName);
			
			File dir = new File(file.getParent());//상위에 넣겠다. java-costa
			dir.mkdir();
			
			FileWriter fw= new FileWriter(file,true);
			PrintWriter pw =new PrintWriter(fw,true);
			pw.println(content);
			pw.close();
			
			System.out.println();
			
		}
		public void readFile(String fileName) throws IOException{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String str=br.readLine();
			while(str!=null) {
				System.out.println();
				str=br.readLine();
			}
		br.close();
		}
		
		public void copyFile(String fileName,String destName) throws IOException {
			File file=new File(destName);
			file.getParentFile().mkdirs();
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			PrintWriter pw =new PrintWriter(new FileWriter(file,true),true);
			String str =br.readLine();
			while(str !=null) {
				pw.print(str);
				str=br.readLine();
			}
			pw.close();
			br.close();
		}
}
