package step7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Cont {

	public String date; 
	
	
	public void write() {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> v = new ArrayList<String>( ); 
		Calendar c =Calendar.getInstance();//static 
		
		FileWriter fos=null;
		System.out.println("1. ����   2. ������"); 
		int a=sc.nextInt(); 
		int y=0, m=0, dd=0; 
		
		if(a==1) {
			y=c.get(Calendar.YEAR); 
			m=c.get(Calendar.MONTH); 
			dd=c.get(Calendar.DATE); 
			date=y+"��"+m+"��"+dd+"��";
			System.out.println(date); 
			 
		}else {
			System.out.println("��¥�� �Է��϶�.");
			date=sc.next(); 
		}
		v.add(date); 
		System.out.println("����");
		
		while(true) {
			String x=null; 
			x=sc.next(); 
			
			if(x.equals("��")) {
				break; 
			}
			v.add(x); 
		}
		
	    File f = new File("C:\\java-kosta\\iotest\\step3\\MyDiary");
	    if(!f.exists())
	    	f.mkdir(); 
	   try {
		   fos=new FileWriter("C:\\java-kosta\\iotest\\step3\\MyDiary"+date+".txt"); 
		   for(int i=0; i<v.size();i++) {
			   fos.write("\n"); 
			   fos.write(v.get(i));
		   }
		   fos.close(); 
	   }catch(Exception e) {
		   System.out.println(e); 
	   }
	
	
	}
	
	public void read() {
		File f = new File("C:\\java-kosta\\iotest\\step3\\MyDiary");
		File[]fs=f.listFiles(); 
		String date; 
		FileReader fr=null; 
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("�ϱ���");
		 for(int i=0; i<fs.length; i++) {
			 System.out.println(fs[i].getName());
		 }
		 System.out.println("���ϴ� ��¥�� �Է��ϼ���");
		 date=sc.next(); 
		 try {
			 fr=new FileReader("C:\\java-kosta\\iotest\\step3\\MyDiary"+date+".txt"); 
			 int i; 
			 
			 while((i=fr.read()) !=-1) {
				 System.out.println((char)i);
			 }
			 fr.close();
		 }catch(Exception e) {
			 System.out.println(e); 
		 }
		 
		 
		
		
	}
}
