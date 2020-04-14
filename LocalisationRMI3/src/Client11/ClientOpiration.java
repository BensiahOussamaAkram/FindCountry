package Client11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;


public class ClientOpiration extends Thread {
	 JTextField XP1;
	 JTextField XP2;
	 JTextField YP1;
	 JTextField YP2;
	 JLabel Result;
	 JButton Calcul;
	 
	 public ClientOpiration(JTextField XP1,JTextField XP2,JTextField YP1,JTextField YP2,JLabel Result,JButton Calcul) {
		// TODO Auto-generated constructor stub
		 this.XP1=XP1;
		 this.XP2=XP2;		
		 this.YP1=YP1;
		 this.YP2=YP2;
		 this.Calcul=Calcul;
		 this.Result=Result;
	 }
	 

	
	 public void run() {	
		try {
			while(true) {
				Serveur1.Operations stub=(Serveur1.Operations)Naming.lookup("rmi://localhost:456/ben");
				               			
				Calcul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)  {
							    
								String x1 = XP1.getText();
							    String x2 = XP2.getText();
							    String y1 = YP1.getText();
							    String y2 = YP2.getText();

									
								double xx1= Double.parseDouble(x1);
								double xx2= Double.parseDouble(x2);
								double yy1= Double.parseDouble(y1);
								double yy2= Double.parseDouble(y2);
								double result;
								try {
									result = stub.distanceBetweenTwoPoints(xx1, xx2, yy1, yy2);
									String str = Double.toString(result);
									Result.setText(str+" KM"); 
								} catch (RemoteException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
							}
						}); 
		           
		           
				
				
						}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	

}


