package Client1;

import java.util.Date;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;




public class Main {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  SplashScreen splash = new SplashScreen(3000);
		  splash.showSplashAndExit(); splash.setAlwaysOnTop(true); 
		  new CLientGeo().frame.setVisible(true);
		 
		

	}
}
