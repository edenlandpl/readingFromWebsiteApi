package Gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/** ApiCoin
 * author - Dell
 * date - 3 paz 2018
 * version - 
 */

public class GuiJframe extends JFrame{
    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");
    
	public GuiJframe() {		
////	super("ApiCoin");
//	JFrame frameMain = new JFrame("Panel główny");	
//	
//	
//	JPanel panel01 = new JPanel(new GridBagLayout());
//	
////	Container zawartoscGlowna = new Container();
////	zawartoscGlowna.add(panel01);
//	//add(panel01);
//	panel01.setBounds(140,180,500,500);
//	panel01.setBackground(Color.gray);
//		//panel01.setSize(400, 400);
//		panel01.setLayout(null);
////		setContentPane(panel01); // umieszczenie kontenera panel01 w oknie głównym oraz wyświetlenie
////		panel01.setVisible(true);
//	JLabel nazwaCoin = new JLabel("PAC");
//	panel01.add(nazwaCoin);
//	frameMain.add(panel01);
//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
//	setVisible(true);
//	setSize(800,600);
//	setLocation(50,50);
//	setTitle("Api Coin");
//	/////////////////////////////////////////////////////////////////////////////////
//        JFrame f= new JFrame("Panel Example");    
//        JPanel panel=new JPanel();  
//        panel.setBounds(40,80,200,200);    // koordynaty lewego rogu, szerokość, wysokość
//        panel.setBackground(Color.gray);  
//        JButton b1=new JButton("Button 1");     
//        b1.setBounds(50,100,80,30);    
//        b1.setBackground(Color.yellow);   
//        JButton b2=new JButton("Button 2");   
//        b2.setBounds(100,100,80,30);    
//        b2.setBackground(Color.green);   
//        panel.add(b1); panel.add(b2);  
//        f.add(panel);  
//                f.setSize(400,400);    
//                f.setLocation(200,200);
//                f.setLayout(null);    
//                f.setVisible(true);
		
		///////////////////////////////////////////////////////////////////
		
 super("JPanel Demo Program");
	         
	        // create a new panel with GridBagLayout manager
	        JPanel newPanel = new JPanel(new GridBagLayout());
	         
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.anchor = GridBagConstraints.WEST;
	        constraints.insets = new Insets(10, 10, 10, 10);
	         
	        // add components to the panel
	        constraints.gridx = 0;
	        constraints.gridy = 0;     
	        newPanel.add(labelUsername, constraints);
	 
	        constraints.gridx = 1;
	        newPanel.add(textUsername, constraints);
	         
	        constraints.gridx = 0;
	        constraints.gridy = 1;     
	        newPanel.add(labelPassword, constraints);
	         
	        constraints.gridx = 1;
	        newPanel.add(fieldPassword, constraints);
	         
	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        constraints.gridwidth = 2;
	        constraints.anchor = GridBagConstraints.CENTER;
	        newPanel.add(buttonLogin, constraints);
	         
	        // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Login Panel"));
	         
	        // add the panel to this frame
	        add(newPanel);
	         
	        pack();
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }
	}
