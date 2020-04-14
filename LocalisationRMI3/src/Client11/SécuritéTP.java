package Client11;

import java.awt.EventQueue;
import java.util.*; 
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class SécuritéTP {

	JFrame frame;
	JTextArea l ;
	//JTextPane l;
	JButton open;
	JButton save;
	 Scanner sc ;
	 JLabel der;
	 JTextField l1;
	 String d; 
	 JScrollPane scroll;
	 File file;
	 String textOnBinary;
	 String textOnLettres;
	 
	 
	 
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SécuritéTP window = new SécuritéTP();
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
	public SécuritéTP() {
		initialize();
	}
	public class CustomOutputStream extends OutputStream {
	    private JTextArea textArea;

	    public CustomOutputStream(JTextArea textArea) {
	        this.textArea = textArea;
	    }

	    @Override
	    public void write(int b) throws IOException {
	        // redirects data to the text area
	        textArea.append(String.valueOf((char)b));
	        // scrolls the text area to the end of data
	        textArea.setCaretPosition(textArea.getDocument().getLength());
	        // keeps the textArea up to date
	        textArea.update(textArea.getGraphics());
	    }
	}
	static void strToBinary(String s) 
    { 
        int n = s.length(); 
  
        for (int i = 0; i < n; i++)  
        { 
    
            int val = Integer.valueOf(s.charAt(i)); 
  
            String bin = ""; 
            while (val > 0)  
            { 
                if (val % 2 == 1) 
                { 
                    bin += '1'; 
                } 
                else
                    bin += '0'; 
                val /= 2; 
            } 
            bin = reverse(bin); 
  
            System.out.print(bin + " "); 
        } 
    } 
	    static String reverse(String input)  
	    { 
	        char[] a = input.toCharArray(); 
	        int l, r = 0; 
	        r = a.length - 1; 
	  
	        for (l = 0; l < r; l++, r--) 
	        { 
	          
	            char temp = a[l]; 
	            a[l] = a[r]; 
	            a[r] = temp; 
	        } 
	        return String.valueOf(a); 
	    } 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Crypte-Decrypte");
		
		l = new JTextArea();
		l.setBounds(10, 11, 387, 226);
		PrintStream printStream = new PrintStream(new CustomOutputStream(l));
		System.setOut(printStream);
		System.setErr(printStream);
		scroll = new JScrollPane(l);
		//l.setEditable ( false );
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);	
		  scroll.setBounds(10, 9, 455, 249);  
		//frame.getContentPane().add(l);
		frame.getContentPane().add(scroll);
		
		 open = new JButton("Open");
		 open.setBackground(new Color(192, 192, 192));
		 open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				

				// invoke the showsOpenDialog function to show the save dialog 
				int r = j.showOpenDialog(null); 

				// if the user selects a file 
				if (r == JFileChooser.APPROVE_OPTION) 

				{ 
					// set the label to the path of the selected file 
					//l.setText(j.getSelectedFile().getAbsolutePath()); 
					 file = new File(j.getSelectedFile().toString()); 
					 l1.setText(j.getSelectedFile().getAbsolutePath());
					 d= j.getSelectedFile().getAbsolutePath();
				     try {
						sc = new Scanner(file);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
							while (sc.hasNextLine()) {
						//	l.setText(sc.nextLine());
							 System.out.println(sc.nextLine()); 
							 textOnLettres  = l.getText();
						     	
						//	}
							
						}
					
				
					 
					  
					
					
				} 
			}
		});
		open.setBounds(483, 11, 89, 23);
		frame.getContentPane().add(open);
		
		 save = new JButton("Save");
		 save.setBackground(new Color(192, 192, 192));
		 save.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				int r = j.showOpenDialog(null); 
				if (r == JFileChooser.APPROVE_OPTION) 

				{ 
					
		 		String fileContent = l.getText();
		 	    BufferedWriter writer;
				try {
					writer = new BufferedWriter(new FileWriter(j.getSelectedFile().getAbsolutePath()));  
					writer.write(fileContent);
		 	        writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 	  
		 	

				}	
		 	}
		 });
		save.setBounds(483, 45, 89, 23);
		frame.getContentPane().add(save);
		
		der = new JLabel("Directory");
		der.setFont(new Font("Tahoma", Font.PLAIN, 11));
		der.setBounds(49, 272, 46, 14);
		frame.getContentPane().add(der);
		
		l1 = new JTextField();
		l1.setEditable(false);
		l1.setBounds(106, 269, 320, 20);
		frame.getContentPane().add(l1);
		l1.setColumns(10);
		
		JButton tobinary = new JButton("ToBinay");
		tobinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				l.setText("");
				
				 try {
						sc = new Scanner(file);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
							while (sc.hasNextLine()) {
						//	l.setText(sc.nextLine());
								strToBinary(sc.nextLine()); 	
				
						
						     	
						//	}
							
						}
							 textOnBinary = l.getText();
			}
			
		});
		tobinary.setBackground(new Color(192, 192, 192));
		tobinary.setBounds(483, 79, 89, 23);
		frame.getContentPane().add(tobinary);
		
		
	}}
