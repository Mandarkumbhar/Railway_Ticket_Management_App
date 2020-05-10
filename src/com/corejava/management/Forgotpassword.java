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
import java.sql.PreparedStatement;
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

public class Forgotpassword extends JFrame {

	private JPanel contentPane;
	 int xx;
		int xy;
		private JTextField username;
		private JPasswordField cpassword;
		private JPasswordField npassword;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forgotpassword frame = new Forgotpassword();
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
	public Forgotpassword() {
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
				Forgotpassword.this.setLocation(x-xx,y-xy);
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
		username.setBounds(464, 149, 296, 30);
		contentPane.add(username);
		username.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 255)));
		username.setForeground(new Color(0, 0, 0));
		username.setOpaque(false);
		username.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(464, 128, 82, 20);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(0, 153, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblPassword = new JLabel(" Confirm Password");
		lblPassword.setBounds(464, 376, 162, 20);
		contentPane.add(lblPassword);
		lblPassword.setForeground(new Color(0, 153, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		cpassword = new JPasswordField();
		cpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cpassword.setBounds(462, 392, 298, 30);
		contentPane.add(cpassword);
		cpassword.setForeground(new Color(0, 0, 0));
		cpassword.setCaretColor(Color.WHITE);
		cpassword.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 255)));
		cpassword.setOpaque(false);
		
		
		npassword = new JPasswordField();
		npassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		npassword.setOpaque(false);
		npassword.setForeground(new Color(0, 0, 0));
		npassword.setCaretColor(Color.WHITE);
		npassword.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 255)));
		npassword.setBounds(464, 322, 298, 30);
		contentPane.add(npassword);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setForeground(new Color(0, 153, 255));
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewPassword.setBounds(466, 302, 134, 20);
		contentPane.add(lblNewPassword);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setForeground(new Color(0, 153, 255));
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDateOfBirth.setBounds(464, 206, 124, 20);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblSignUp = new JLabel("RESET PASSWORD");
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setForeground(new Color(0, 153, 255));
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblSignUp.setBounds(520, 33, 180, 31);
		contentPane.add(lblSignUp);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(0, 3));
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(520, 64, 180, 14);
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
		date.setBounds(464, 242, 65, 26);
		contentPane.add(date);
		
		final JComboBox month = new JComboBox();
		month.setFont(new Font("Tahoma", Font.PLAIN, 12));
		month.setForeground(new Color(0, 0, 0));
		month.setModel(new DefaultComboBoxModel(new String[] {"MONTH", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"}));
		month.setSelectedItem("MONTH");
		month.setBackground(Color.WHITE);
		month.setBounds(561, 242, 92, 26);
		contentPane.add(month);
		
		final JComboBox year = new JComboBox();
		year.setFont(new Font("Tahoma", Font.PLAIN, 12));
		year.setForeground(new Color(0, 0, 0));
		year.setModel(new DefaultComboBoxModel(new String[] {"YEAR","1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000"}));
		year.setSelectedItem("YEAR");
		year.setBackground(Color.WHITE);
		year.setBounds(684, 242, 76, 26);
		contentPane.add(year);
		
		JButton btnSignUp = new JButton("RESET PASSWORD");
		btnSignUp.setBounds(464, 468, 296, 30);
		contentPane.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					String username1=username.getText();
					 npassword.getPassword();
					 cpassword.getPassword();
					String date1= (String) date.getSelectedItem();
					String month1= (String) month.getSelectedItem();
					String year1= (String) year.getSelectedItem();
					
					if(username1.equals("")  )//validation for username
					{
						JOptionPane.showMessageDialog(null,"Username is mandatory");
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
					
					else if(npassword.getText().equals("")) 
					{
						JOptionPane.showMessageDialog(null,"Please enter valid password");
					}
					
						else if(!npassword.getText().equals(cpassword.getText()))//confirming password
						{
							JOptionPane.showMessageDialog(null,"password does not match");
						}
						else if(npassword.getText().equals(cpassword.getText()))
						{
							Connection con = null;
							con=RailwayDB.getConnection();
							java.sql.PreparedStatement st=con.prepareStatement("Select * from login where username=?");
							st.setString(1, username.getText());
							ResultSet rs=st.executeQuery();
							java.sql.PreparedStatement st1=con.prepareStatement("Select * from register where date=?");
							st1.setString(1,(String) date.getSelectedItem());
							ResultSet rs1=st1.executeQuery();
							java.sql.PreparedStatement st2=con.prepareStatement("Select * from register where month=?");
							st2.setString(1,(String) month.getSelectedItem());
							ResultSet rs2=st2.executeQuery();
							java.sql.PreparedStatement st3=con.prepareStatement("Select * from register where year=?");
							st3.setString(1, (String) year.getSelectedItem());
							ResultSet rs3=st3.executeQuery();
							if(!rs.next()) {
								JOptionPane.showMessageDialog(null,"username is invalid");
							}
							else if(!rs1.next()) {
								JOptionPane.showMessageDialog(null,"Date of birth  is invalid");
							}
							else if(!rs2.next()) {
								JOptionPane.showMessageDialog(null,"Date of birth is invalid");
							}
							else if(!rs3.next()) {
								JOptionPane.showMessageDialog(null,"Date of birth is invalid");
							}
							else
							{
								String sql="UPDATE login set password=? WHERE username=?";
								PreparedStatement p=con.prepareStatement(sql);
								p.setString(1, npassword.getText());
								p.setString(2, username.getText());
								int updateCount=p.executeUpdate();
								
								
								JOptionPane.showMessageDialog(null,"SUCESSFULY SET PASSWORD");
								login frame = new login();
								frame.setVisible(true);
								dispose();
								
							}
						}	
					
					
				} catch (Exception e1) {
					// TODO: handle exception
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
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		label.setIcon(new ImageIcon("IMAGES\\Undo_40px_1.png"));
		label.setBounds(412, 10, 47, 36);
		contentPane.add(label);
	
	}
}
