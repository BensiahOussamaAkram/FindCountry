package Client1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;



public class SplashScreen extends JWindow {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 3174215194936510937L;
	private int duration;
	int width = 687;
	int height = 272;
	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

	public SplashScreen(int d) {
		//setUndecorated(true);
		getContentPane().setLayout(new BorderLayout());
		  
	    JPanel content = new JPanel();
	    
	    
	    getContentPane().add(content);
	    content.setBackground(Color.WHITE);
	    content.setLayout(new BorderLayout(0, 0));
	    
	    JLabel label = new JLabel("");
	    label.setIcon(new ImageIcon("C:\\Users\\cc\\eclipse-workspace1\\LocalisationRMI3\\IMG\\Spalch.png"));
	    content.add(label, BorderLayout.CENTER);
	  
	    setVisible(true);
		duration = d;

		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		this.setLocation(x, y);
		setBounds(x, y, width, height);
		

	}

	public void showSplashAndExit() {
		showSplash();
		dispose();
		// TODO Auto-generated method stub

	}

	private void showSplash() {
		try {
		      Thread.sleep(duration);
		    } 
		    catch (Exception e) {
		    }

		    setVisible(false);
		// TODO Auto-generated method stub

	}

}
