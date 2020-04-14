package Client11;


import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class ClientGui {

		private JFrame frame;
		JTextField XP1;
		JTextField XP2;
		JTextField YP1;
		JTextField YP2; 
		JLabel Result;
		JButton Calcul;
		
		private JLabel lblNewLabel;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientGui window = new ClientGui();
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
	public ClientGui() {
		initialize();
		
		new ClientOpiration(XP1, XP2, YP1, YP2, Result, Calcul).start(); {
		
		}
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 653, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("LatLong2019");
		
		
		Panel panel = new Panel();
		panel.setBackground(new Color(22, 243, 197));
		panel.setBounds(10, 6, 617, 161);
	
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		XP1 = new JTextField();
		XP1.setBounds(128, 38, 101, 32);
		panel.add(XP1);
		XP1.setColumns(10);
		
		XP2 = new JTextField();
		XP2.setBounds(128, 81, 101, 32);
		panel.add(XP2);
		XP2.setColumns(10);
		
		YP1 = new JTextField();
		YP1.setBounds(264, 38, 101, 32);
		panel.add(YP1);
		YP1.setColumns(10);
		
		YP2 = new JTextField();
		YP2.setBounds(264, 81, 101, 32);
		panel.add(YP2);
		YP2.setColumns(10);
		
		JLabel lblX = new JLabel("Latitude");
		lblX.setFont(new Font("MV Boli", Font.PLAIN, 16));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(128, 9, 101, 23);
		panel.add(lblX);
		
		JLabel lblY = new JLabel("Longitude");
		lblY.setFont(new Font("MV Boli", Font.PLAIN, 16));
		lblY.setHorizontalAlignment(SwingConstants.CENTER);
		lblY.setBounds(264, 4, 101, 32);
		panel.add(lblY);
		
		JLabel lblPoint = new JLabel("Point 1 ");
		lblPoint.setFont(new Font("MV Boli", Font.PLAIN, 16));
		lblPoint.setBounds(56, 41, 62, 23);
		panel.add(lblPoint);
		
		JLabel lblPoint_1 = new JLabel("Point 2");
		lblPoint_1.setFont(new Font("MV Boli", Font.PLAIN, 16));
		lblPoint_1.setBounds(56, 88, 62, 14);
		panel.add(lblPoint_1);
		
		Calcul = new JButton("Find");
		Calcul.setFont(new Font("MV Boli", Font.PLAIN, 15));
		Calcul.setForeground(Color.WHITE);
		Calcul.setBounds(403, 57, 89, 36);
		panel.add(Calcul);
		Calcul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Calcul.setBackground(new Color(30, 144, 255));
		Calcul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		Result = new JLabel("");
		Result.setHorizontalAlignment(SwingConstants.CENTER);
		Result.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		Result.setBounds(24, 373, 585, 37);
		frame.getContentPane().add(Result);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\cc\\eclipse-workspace1\\LocalisationRMI2\\IMG\\earth.png"));
		lblNewLabel.setBounds(10, 173, 617, 272);
		frame.getContentPane().add(lblNewLabel);
	}
}
