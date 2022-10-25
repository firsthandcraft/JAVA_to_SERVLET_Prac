package step2;

import java.awt.Toolkit;

public class testTread34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Thread thread = new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						Toolkit toolkit = Toolkit.getDefaultToolkit();					}
					 
				});
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try{
						Thread.sleep(900); 
					} catch (Exception e) {}
				}
				thread.start();
				
				for(int i=0;i<5;i++) {
					System.out.println("¶ò");
					try{Thread.sleep(500);} catch(Exception e) {}
				}
			}


}
