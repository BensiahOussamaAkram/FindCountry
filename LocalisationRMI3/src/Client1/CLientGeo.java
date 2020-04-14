package Client1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import ServeurGeo.Opiration;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CLientGeo {

	JFrame frame;
	int c = 1;
    String s;
    int i=42;
    int ii= 85;
    JLabel lblNewLabel_1 ;
    private JTextField tf1;
    private JLabel lblNewLabel;
   private JLabel label_1;
    private JLabel lblGoTo;
    ServeurGeo.Opiration stub;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CLientGeo window = new CLientGeo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CLientGeo() {
		initialize();
		try {
	           stub=(Opiration)Naming.lookup("rmi://localhost:1994/akram");
			} catch (MalformedURLException | RemoteException | NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(160, 30, 978, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setTitle("Serching");
		 
		 label_1 = new JLabel("");
		 label_1.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		String x1 = tf1.getText();
		 		String result[];
		 		try {
					result = stub.Map(x1);
					i = Integer.parseInt(result[0]) ;  
					ii = Integer.parseInt(result[1]) ;  
					String str11 = result[2];
					lblNewLabel_1.setBounds(i, ii, 35, 40);
					lblNewLabel.setText(str11);
					
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane a = new JOptionPane();
					JOptionPane.showMessageDialog(frame, "You must wirte a valid country name" + "\n" + e1.getCause(), "Warning",
							JOptionPane.ERROR_MESSAGE);
				}	
		 	}
		 });
		 label_1.setIcon(new ImageIcon("C:\\Users\\cc\\Pictures\\452369.png"));
		 label_1.setBackground(Color.YELLOW);
		 label_1.setBounds(43, 11, 20, 40);
		 frame.getContentPane().add(label_1);
		 lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\cc\\Pictures\\Picture1.png"));
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setBounds(i, ii, 35, 40);

		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(54, 426, 171, 187);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\cc\\eclipse-workspace1\\LocalisationRMI3\\IMG\\Map.jpg"));
		label.setBounds(10, 64, 942, 575);
		frame.getContentPane().add(label);
		
		tf1 = new JTextField();
		tf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				tf1.setText("");
			}
			
		});
		tf1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 13));
		tf1.setText("Serach Here");
		tf1.setBounds(77, 24, 239, 29);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		lblGoTo = new JLabel("Go To");
		lblGoTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoTo.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblGoTo.setBounds(31, 50, 46, 14);
		frame.getContentPane().add(lblGoTo);
	}
}
