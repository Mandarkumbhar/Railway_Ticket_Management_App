package com.corejava.management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import com.corejava.railwayDAO.RailwayDB;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	 int xx;
		int xy;
		private JTextField txtUsername;
		private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 541);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx =e.getX();
				xy =e.getY();
			}
		});
		gradientPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x =arg0.getXOnScreen();
				int y =arg0.getYOnScreen();
				login.this.setLocation(x-xx,y-xy);
			}
		});
		
		gradientPanel.setkGradientFocus(50);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.setBounds(0, 0, 733, 541);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(699, 0, 46, 20);
		gradientPanel.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtUsername.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setOpaque(false);
		txtUsername.setBounds(270, 239, 237, 30);
		gradientPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.setForeground(Color.WHITE);
		passwordField.setCaretColor(Color.WHITE);
		passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		passwordField.setOpaque(false);
		passwordField.setBounds(270, 309, 237, 30);
		gradientPanel.add(passwordField);
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				try{
					 Connection con = null;
						con=RailwayDB.getConnection();
					java.sql.PreparedStatement st=con.prepareStatement("Select * from login where username=? and password=?");
					st.setString(1, txtUsername.getText());
					st.setString(2,String.valueOf(passwordField.getText()));
					ResultSet rs=st.executeQuery();
						if(rs.next()) {
							JOptionPane.showMessageDialog(null,"login successful");
							
							
							
							operation frame = new operation();
							frame.setVisible(true);
							dispose();
							
						}
						else {
							JOptionPane.showMessageDialog(null,"invalid username or password");
						}
						
				}
						catch(Exception e)
						{
							e.printStackTrace();
						}
			}}
		);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		btnNewButton.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 153, 255));
		btnNewButton.setBounds(243, 382, 264, 30);
		gradientPanel.add(btnNewButton);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register frame = new Register();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSignUp.setRolloverEnabled(false);
		btnSignUp.setRequestFocusEnabled(false);
		btnSignUp.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignUp.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnSignUp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		btnSignUp.setBackground(new Color(0, 153, 255));
		btnSignUp.setBounds(243, 480, 264, 30);
		gradientPanel.add(btnSignUp);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("IMAGES\\Gender Neutral User_25px.png"));
		lblNewLabel_1.setBounds(243, 239, 27, 30);
		gradientPanel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("IMAGES\\Lock_25px.png"));
		label.setBounds(233, 309, 37, 30);
		gradientPanel.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(243, 207, 82, 20);
		gradientPanel.add(lblNewLabel_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(243, 280, 82, 20);
		gradientPanel.add(lblPassword);
		
		JLabel lblForgotPassword = new JLabel("Forgot Password");
		lblForgotPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Forgotpassword frame = new Forgotpassword();
				frame.setVisible(true);
				dispose();
			}
		});
		lblForgotPassword.setForeground(Color.WHITE);
		lblForgotPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblForgotPassword.setBounds(370, 414, 136, 20);
		gradientPanel.add(lblForgotPassword);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblOr.setForeground(Color.WHITE);
		lblOr.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOr.setBounds(309, 445, 136, 20);
		gradientPanel.add(lblOr);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(chckbxNewCheckBox.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}	
				
				else
				{
					passwordField.setEchoChar('*');
				}
				
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(370, 346, 137, 23);
		gradientPanel.add(chckbxNewCheckBox);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(0, 3));
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(207, 89, 434, 14);
		gradientPanel.add(separator);
		
		JLabel label_1 = new JLabel("Railway Management System");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		label_1.setBounds(206, 36, 454, 67);
		gradientPanel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("IMAGES\\Subway_100px.png"));
		label_2.setBounds(92, 11, 105, 116);
		gradientPanel.add(label_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 41, 16, 469);
		gradientPanel.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(718, 41, 27, 469);
		gradientPanel.add(panel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(0, 3));
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(78, 138, 603, 14);
		gradientPanel.add(separator_1);
		
		JLabel lblLetsPlan = new JLabel("( Lets plan safe and comfortable journey )");
		lblLetsPlan.setForeground(Color.WHITE);
		lblLetsPlan.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLetsPlan.setBounds(207, 96, 391, 20);
		gradientPanel.add(lblLetsPlan);
	}
}
