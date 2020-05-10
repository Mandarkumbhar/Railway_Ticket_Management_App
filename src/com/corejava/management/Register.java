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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.util.regex.*;
import java.util.*;
public class Register extends JFrame {

	private JPanel contentPane;
	 int xx;
		int xy;
		private JTextField username;
		private JPasswordField cpasswordField_1;
		private JPasswordField passwordField;
		private JTextField contact;
		private JTextField email;
		private JTextField name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public static boolean isValid(String s)
	{
		Pattern p= Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(s);
		return (m.find() && m.group().equals(s));
		
	}
	
	public static boolean emValid(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-z"+"A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		if(email==null)
			return false;
		return pat.matcher(email).matches();
	}
	public static boolean nValid(String txt)
	{
		String regx = "[a-zA-Z]+\\.?";
		Pattern pattern=Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(txt);
		return matcher.find();
	}
	public Register() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 541);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 153, 255)));
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
				Register.this.setLocation(x-xx,y-xy);
			}
		});
		
		gradientPanel.setkGradientFocus(50);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.setBounds(0, 0, 402, 541);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel label_1 = new JLabel("Railway Management System");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		label_1.setBounds(-26, 217, 454, 67);
		gradientPanel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("IMAGES\\Subway_100px.png"));
		label_2.setBounds(151, 122, 105, 116);
		gradientPanel.add(label_2);
		
		JLabel lblLetsPlan = new JLabel("( Lets plan safe and comfortable journey )");
		lblLetsPlan.setForeground(Color.WHITE);
		lblLetsPlan.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLetsPlan.setBounds(10, 281, 391, 20);
		gradientPanel.add(lblLetsPlan);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(0, 3));
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(10, 270, 382, 14);
		gradientPanel.add(separator);
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 15));
		username.setBounds(466, 326, 296, 30);
		contentPane.add(username);
		username.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 255)));
		username.setForeground(new Color(0, 0, 0));
		username.setOpaque(false);
		username.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(466, 305, 82, 20);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(0, 153, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblPassword = new JLabel(" Confirm Password");
		lblPassword.setBounds(457, 429, 162, 20);
		contentPane.add(lblPassword);
		lblPassword.setForeground(new Color(0, 153, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		cpasswordField_1 = new JPasswordField();
		cpasswordField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cpasswordField_1.setBounds(464, 446, 298, 30);
		contentPane.add(cpasswordField_1);
		cpasswordField_1.setForeground(new Color(0, 0, 0));
		cpasswordField_1.setCaretColor(Color.WHITE);
		cpasswordField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 255)));
		cpasswordField_1.setOpaque(false);
		
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setOpaque(false);
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setCaretColor(Color.WHITE);
		passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 255)));
		passwordField.setBounds(464, 387, 298, 30);
		contentPane.add(passwordField);
		
		JLabel label = new JLabel("Password");
		label.setForeground(new Color(0, 153, 255));
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(466, 367, 82, 20);
		contentPane.add(label);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setForeground(new Color(0, 153, 255));
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDateOfBirth.setBounds(468, 244, 124, 20);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setForeground(new Color(0, 153, 255));
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContactNo.setBounds(468, 182, 99, 20);
		contentPane.add(lblContactNo);
		
		contact = new JTextField();
		contact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contact.setOpaque(false);
		contact.setForeground(new Color(0, 0, 0));
		contact.setColumns(10);
		contact.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 255)));
		contact.setBounds(468, 203, 294, 30);
		contentPane.add(contact);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setForeground(new Color(0, 153, 255));
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmailId.setBounds(468, 121, 82, 20);
		contentPane.add(lblEmailId);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		email.setOpaque(false);
		email.setForeground(new Color(0, 0, 0));
		email.setColumns(10);
		email.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 255)));
		email.setBounds(468, 141, 294, 30);
		contentPane.add(email);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(0, 153, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(468, 61, 82, 20);
		contentPane.add(lblName);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name.setOpaque(false);
		name.setForeground(new Color(0, 0, 0));
		name.setColumns(10);
		name.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 255)));
		name.setBounds(468, 80, 294, 30);
		contentPane.add(name);
		
		JLabel lblSignUp = new JLabel("SIGN UP");
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setForeground(new Color(0, 153, 255));
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblSignUp.setBounds(563, 11, 107, 31);
		contentPane.add(lblSignUp);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(0, 3));
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(573, 42, 82, 14);
		contentPane.add(separator_1);
		
		final JComboBox date = new JComboBox();
		date.setFont(new Font("Tahoma", Font.PLAIN, 12));
		date.setForeground(new Color(0, 0, 0));
		date.addItem("DATE");
		 date.addItem("01");
		 date.addItem("02");
		 date.addItem("03");
		 date.addItem("04");
		 date.addItem("05");
		 date.addItem("06");
		 date.addItem("07");
		 date.addItem("08");
		 date.addItem("09");
		 date.addItem("10");
		 date.addItem("11");
		 date.addItem("12");
		 date.addItem("13");
		 date.addItem("14");
		 date.addItem("15");
		 date.addItem("16");
		 date.addItem("17");
		 date.addItem("18");
		 date.addItem("19");
		 date.addItem("20");
		 date.addItem("21");
		 date.addItem("22");
		 date.addItem("23");
		 date.addItem("24");
		 date.addItem("25");
		 date.addItem("26");
		 date.addItem("27");
		 date.addItem("28");
		 date.addItem("29");
		 date.addItem("30");
		 date.addItem("31");
		 date.setSelectedItem("DATE");
		date.setBackground(Color.WHITE);
		date.setBounds(466, 268, 65, 26);
		contentPane.add(date);
		
		final JComboBox month = new JComboBox();
		month.setFont(new Font("Tahoma", Font.PLAIN, 12));
		month.setForeground(new Color(0, 0, 0));
		month.setModel(new DefaultComboBoxModel(new String[] {"MONTH", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"}));
		month.setSelectedItem("MONTH");
		month.setBackground(Color.WHITE);
		month.setBounds(563, 268, 92, 26);
		contentPane.add(month);
		
		final JComboBox year = new JComboBox();
		year.setFont(new Font("Tahoma", Font.PLAIN, 12));
		year.setForeground(new Color(0, 0, 0));
		year.setModel(new DefaultComboBoxModel(new String[] {"YEAR","1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000"}));
		year.setSelectedItem("YEAR");
		year.setBackground(Color.WHITE);
		year.setBounds(686, 268, 76, 26);
		contentPane.add(year);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBounds(466, 500, 296, 30);
		contentPane.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try
				{
				String name1=name.getText();
				String email1=email.getText();
				String contact1=contact.getText();
				
				String username1=username.getText();
				 passwordField.getPassword();
				 cpasswordField_1.getPassword();
			
				String date1= (String) date.getSelectedItem();
				
				String month1= (String) month.getSelectedItem();
				
				String year1= (String) year.getSelectedItem();
				
				if(!nValid(name1))// validation for name
				{
					JOptionPane.showMessageDialog(null,"Please enter a valid Name");
					
				}
				else if(!emValid(email1))//validation for email id
				{
					JOptionPane.showMessageDialog(null,"Please enter a valid email address");
				}
				else if(!isValid(contact1) )//validation for contact
				{
					JOptionPane.showMessageDialog(null,"Please enter a valid Contact Number");
				}
				
				//validation for date of birth
				else if(date1.equals("") || date1.equals("DATE") )
				{
					JOptionPane.showMessageDialog(null,"Date of birth is mandatory");
				}
				else if(month1.equals("") || month1.equals("MONTH") )
				{
					JOptionPane.showMessageDialog(null,"Date of birth is mandatory");
				}
				else if(year1.equals("") || year1.equals("YEAR") )
				{
					JOptionPane.showMessageDialog(null,"Date of birth is mandatory");
				}
				
				
				else if(username1.equals("")  )//validation for username
				{
					JOptionPane.showMessageDialog(null,"Username is mandatory");
				}
				else if(passwordField.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(null,"Please enter valid password");
				}
				
					else if(!passwordField.getText().equals(cpasswordField_1.getText()))//confirming password
					{
						JOptionPane.showMessageDialog(null,"password does not match");
					}
					else if(passwordField.getText().equals(cpasswordField_1.getText()))
					{
						 Connection con = null;
						 
						con=RailwayDB.getConnection();
						java.sql.PreparedStatement st=con.prepareStatement("insert into register values(?,?,?,?,?,?)");
						
						java.sql.PreparedStatement st1=con.prepareStatement("insert into login values(?,?)");
						st.setString(1, name.getText());
						st.setString(2, email.getText());
						st.setString(3, contact.getText());
						st.setString(4, (String) date.getSelectedItem());
						st.setString(5, (String) month.getSelectedItem());
						st.setString(6, (String) year.getSelectedItem());
						
						st1.setString(1,username.getText());
						st1.setString(2,  passwordField.getText());
						java.sql.PreparedStatement st3=con.prepareStatement("Select * from login where username=?");
						st3.setString(1, username.getText());
						java.sql.PreparedStatement st4=con.prepareStatement("Select * from register where contactno=?");
						st4.setString(1, contact.getText());
						ResultSet rs3=st3.executeQuery();
						ResultSet rs4=st4.executeQuery();
						if(rs4.next()) {
							JOptionPane.showMessageDialog(null,"This contact number is already register");
						}
						else if(rs3.next()) {
								JOptionPane.showMessageDialog(null,"username already exists");
							}
							else
							{
								int rs=st.executeUpdate();
								int rs1=st1.executeUpdate();
								
								JOptionPane.showMessageDialog(null,"Registration successful");
								login frame = new login();
								frame.setVisible(true);
								dispose();
							
							}
						
					}
					
				
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnSignUp.setRolloverEnabled(false);
		btnSignUp.setRequestFocusEnabled(false);
		btnSignUp.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignUp.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnSignUp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		btnSignUp.setBackground(new Color(102, 204, 255));
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(764, 0, 46, 30);
		contentPane.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		label_3.setIcon(new ImageIcon("IMAGES\\Undo_40px_1.png"));
		label_3.setBounds(412, 11, 47, 36);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(412, 11, 47, 36);
		contentPane.add(label_4);
	
	}
}
