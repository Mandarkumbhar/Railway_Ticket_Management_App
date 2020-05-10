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
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
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
import com.toedter.calendar.JDateChooser;
import java.awt.Label;
import javax.swing.border.LineBorder;

public class BookTicket extends JFrame {

	private JPanel contentPane;
	 int xx;
		int xy;
		protected static final String String = null;
		protected static final Date Date = null;
		protected static final int Integer = (java.lang.Integer) 0;
		private JTextField trainName;
		private JTextField trainNo;
		private JTextField destination1;
		private JTextField destination2;
		private JTextField Departure;
		private JTextField Arrival;
		private JTextField Boarding;
		private JTextField fare;
		private JTextField mobileNo;
		private JTextField date;
		private JTextField name;
		private JTextField age;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookTicket frame = new BookTicket(Integer,Date,String,String);
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
	
	public static boolean isValid(String s)//Validation logic for mobile no
	{
		Pattern p= Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(s);
		return (m.find() && m.group().equals(s));
		
	}
	public static boolean aValid(String s)//Validation logic for Age
	{
		Pattern p= Pattern.compile("[0-9]{2}");
		Matcher m = p.matcher(s);
		return (m.find() && m.group().equals(s));
		
	}
	public static boolean nValid(String txt)//Validation logic for Name
	{
		String regx = "[a-zA-Z]+\\.?";
		Pattern pattern=Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(txt);
		return matcher.find();
	}
	public BookTicket(int i,java.util.Date date2,String from,String to) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 680);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 153, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 102, 255)));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(111, 117, 515, 525);
		contentPane.add(panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("IMAGES\\Ticket_50px.png"));
		label.setBounds(143, 11, 79, 52);
		panel.add(label);
		
		JLabel label_3 = new JLabel("Ticket Booking");
		label_3.setForeground(new Color(0, 102, 255));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_3.setBounds(205, 23, 192, 28);
		panel.add(label_3);
		
		trainName = new JTextField();
		trainName.setOpaque(false);
		trainName.setForeground(new Color(0, 102, 255));
		trainName.setFont(new Font("Tahoma", Font.BOLD, 20));
		trainName.setEditable(false);
		trainName.setColumns(10);
		trainName.setBorder(null);
		trainName.setBackground(Color.WHITE);
		trainName.setBounds(75, 74, 250, 28);
		panel.add(trainName);
		
		trainNo = new JTextField();
		trainNo.setOpaque(false);
		trainNo.setForeground(new Color(0, 102, 255));
		trainNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		trainNo.setEditable(false);
		trainNo.setColumns(10);
		trainNo.setBorder(null);
		trainNo.setBackground(Color.WHITE);
		trainNo.setBounds(344, 74, 89, 28);
		panel.add(trainNo);
		
		destination1 = new JTextField();
		destination1.setOpaque(false);
		destination1.setForeground(new Color(0, 102, 255));
		destination1.setFont(new Font("Tahoma", Font.BOLD, 18));
		destination1.setEditable(false);
		destination1.setColumns(10);
		destination1.setBorder(null);
		destination1.setBackground(Color.WHITE);
		destination1.setBounds(74, 107, 115, 28);
		panel.add(destination1);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("IMAGES\\Arrow_48px.png"));
		label_4.setBounds(205, 107, 62, 30);
		panel.add(label_4);
		
		destination2 = new JTextField();
		destination2.setOpaque(false);
		destination2.setForeground(new Color(0, 102, 255));
		destination2.setFont(new Font("Tahoma", Font.BOLD, 18));
		destination2.setEditable(false);
		destination2.setColumns(10);
		destination2.setBorder(null);
		destination2.setBackground(Color.WHITE);
		destination2.setBounds(266, 107, 167, 28);
		panel.add(destination2);
		
		Departure = new JTextField();
		Departure.setOpaque(false);
		Departure.setForeground(new Color(25, 25, 112));
		Departure.setFont(new Font("Tahoma", Font.BOLD, 16));
		Departure.setEditable(false);
		Departure.setColumns(10);
		Departure.setBorder(null);
		Departure.setBackground(Color.WHITE);
		Departure.setBounds(178, 167, 46, 20);
		panel.add(Departure);
		
		Arrival = new JTextField();
		Arrival.setOpaque(false);
		Arrival.setForeground(new Color(25, 25, 112));
		Arrival.setFont(new Font("Tahoma", Font.BOLD, 16));
		Arrival.setEditable(false);
		Arrival.setColumns(10);
		Arrival.setBorder(null);
		Arrival.setBackground(Color.WHITE);
		Arrival.setBounds(330, 167, 103, 20);
		panel.add(Arrival);
		
		Boarding = new JTextField();
		Boarding.setOpaque(false);
		Boarding.setForeground(new Color(25, 25, 112));
		Boarding.setFont(new Font("Tahoma", Font.BOLD, 16));
		Boarding.setEditable(false);
		Boarding.setColumns(10);
		Boarding.setBorder(null);
		Boarding.setBackground(Color.WHITE);
		Boarding.setBounds(188, 198, 160, 20);
		panel.add(Boarding);
		
		JLabel label_5 = new JLabel("Class :");
		label_5.setForeground(new Color(0, 102, 255));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_5.setBounds(74, 225, 72, 28);
		panel.add(label_5);
		
		final JComboBox Class = new JComboBox();
		Class.setOpaque(false);
		Class.setForeground(new Color(25, 25, 112));
		Class.setModel(new DefaultComboBoxModel(new String[] {"Class", "2A", "3A", "SL"}));
		Class.setFont(new Font("Tahoma", Font.BOLD, 15));
		Class.setBounds(143, 225, 70, 28);
		panel.add(Class);
		
		fare = new JTextField();
		fare.setOpaque(false);
		fare.setForeground(new Color(0, 191, 255));
		fare.setFont(new Font("Tahoma", Font.BOLD, 18));
		fare.setEditable(false);
		fare.setColumns(10);
		fare.setBorder(new LineBorder(new Color(0, 0, 0)));
		fare.setBackground(Color.WHITE);
		fare.setBounds(266, 428, 167, 28);
		panel.add(fare);
		
		JLabel label_6 = new JLabel("No of Passengers :");
		label_6.setForeground(new Color(0, 102, 255));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_6.setBounds(223, 225, 177, 28);
		panel.add(label_6);
		
		final JComboBox noOfPass = new JComboBox();
		noOfPass.setOpaque(false);
		noOfPass.setForeground(new Color(25, 25, 112));
		noOfPass.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		noOfPass.setFont(new Font("Tahoma", Font.BOLD, 15));
		noOfPass.setBounds(378, 225, 57, 28);
		panel.add(noOfPass);
		
		JLabel label_7 = new JLabel("Mobile No :");
		label_7.setForeground(new Color(0, 102, 255));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_7.setBounds(74, 391, 115, 28);
		panel.add(label_7);
		
		mobileNo = new JTextField();
		mobileNo.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 204)));
		mobileNo.setOpaque(false);
		mobileNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mobileNo.setColumns(10);
		mobileNo.setBounds(182, 394, 251, 28);
		panel.add(mobileNo);
		
		date = new JTextField();
		date.setOpaque(false);
		date.setText("null");
		date.setForeground(new Color(0, 102, 255));
		date.setFont(new Font("Tahoma", Font.BOLD, 16));
		date.setEditable(false);
		date.setColumns(10);
		date.setBorder(null);
		date.setBackground(Color.WHITE);
		date.setBounds(74, 135, 276, 20);
		panel.add(date);
		
		JLabel label_8 = new JLabel("Name :");
		label_8.setForeground(new Color(0, 102, 255));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_8.setBounds(74, 264, 79, 28);
		panel.add(label_8);
		
		name = new JTextField();
		name.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 204)));
		name.setOpaque(false);
		name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name.setColumns(10);
		name.setBounds(143, 264, 290, 28);
		panel.add(name);
		
		JLabel label_10 = new JLabel("Age :");
		label_10.setForeground(new Color(0, 102, 255));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_10.setBounds(75, 309, 79, 28);
		panel.add(label_10);
		
		age = new JTextField();
		age.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 153, 204)));
		age.setOpaque(false);
		age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		age.setColumns(10);
		age.setBounds(127, 309, 46, 28);
		panel.add(age);
		
		JLabel label_11 = new JLabel("Gender :");
		label_11.setForeground(new Color(0, 102, 255));
		label_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_11.setBounds(259, 309, 79, 28);
		panel.add(label_11);
		
		final JComboBox gender = new JComboBox();
		gender.setOpaque(false);
		gender.setForeground(new Color(25, 25, 112));
		gender.setModel(new DefaultComboBoxModel(new String[] {"Gender", "Male", "Female"}));
		gender.setFont(new Font("Tahoma", Font.BOLD, 15));
		gender.setBounds(345, 309, 88, 28);
		panel.add(gender);
		
		JLabel label_12 = new JLabel("Berth Preference :");
		label_12.setForeground(new Color(0, 102, 255));
		label_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_12.setBounds(74, 352, 177, 28);
		panel.add(label_12);
		
		final JComboBox berth = new JComboBox();
		berth.setOpaque(false);
		berth.setForeground(new Color(25, 25, 112));
		berth.setModel(new DefaultComboBoxModel(new String[] {"Select", "UPPER", "LOWER", "MIDDLE"}));
		berth.setFont(new Font("Tahoma", Font.BOLD, 15));
		berth.setBounds(251, 353, 182, 28);
		panel.add(berth);
		
		JButton button = new JButton("BOOK NOW");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=(String)noOfPass.getSelectedItem();
				int no=0;
				String name1=name.getText(); 
				String age1=age.getText();
				String gender1= (String) gender.getSelectedItem();
				String Class1= (String) Class.getSelectedItem();
				String mobile=mobileNo.getText();
				 if(Class1.equals("Class"))// validation for class
					{
						JOptionPane.showMessageDialog(null,"Class is mandatory");
						
					}
				 else if(name1.equals(""))// validation for name
					{
						JOptionPane.showMessageDialog(null,"Name is mandatory");
						
					}
				 else if(!nValid(name1))// validation for name
				{
					JOptionPane.showMessageDialog(null,"Enter valid name");
					
				}
				else if(age1.equals(""))// validation for age
				{
					JOptionPane.showMessageDialog(null,"Age is mandatory");
					
				}
				else if(!aValid(age1))// validation for age
				{
					JOptionPane.showMessageDialog(null,"Enter valid  Age ");
					
				}
				else if(gender1.equals("Gender"))// validation for gender
				{
					JOptionPane.showMessageDialog(null,"Gender is mandatory");
					
				}
				else if(!isValid(mobile) )// validation for mobileNo
				{
					JOptionPane.showMessageDialog(null,"Enter valid Mobile No.");
					
				}
				else if(fare.getText().equals(""))// validation for Fare
				{
					JOptionPane.showMessageDialog(null,"Press fare button");
					
				}
				else
				{
					
					
						try {
							
							int s= (int)((Math.random() * 95)+1);
							String seat = null;
							String space="  ";
							int pnr=  (int)((Math.random() * 9000)+1000); 
							if(num.equals("1"))
								no=1;
							else if(num.equals("2"))
								no=2;
							else if(num.equals("3"))
								no=3;
							else if(num.equals("4"))
								no=4;
							else if(num.equals("5"))
								no=5;
							else if(num.equals("6"))
								no=6;
							String sa="";
							if(Class1.equals("2A"))
							{
								
								for(int i=0;i<no;i++)
								{	
									
									seat="A1-"+s;
									 sa=sa +space +seat;
									
									s=s+1;
								} 
								System.out.println(sa);
						    }
							else if(Class1.equals("3A"))
							{
								for(int i=0;i<no;i++)
								{	
									
									seat="B1-"+s;
									 sa=sa +space +seat;
									
									s=s+1;
								} 
							}
							else if(Class1.equals("SL"))
							{
								for(int i=0;i<no;i++)
								{	
									
									seat="S1-"+s;
									 sa=sa +space +seat;
									
									s=s+1;
								} 
							}
							String status="CONFIRMED";
							 Connection con = null;
							con=RailwayDB.getConnection();
							java.sql.PreparedStatement st=con.prepareStatement("insert into booking values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
							st.setString(1, trainName.getText());
							st.setString(2, trainNo.getText());
							st.setString(3, destination1.getText());
							st.setString(4, destination2.getText());
							st.setString(5, date.getText());
							st.setString(6, Departure.getText());
							st.setString(7, Arrival.getText());
							st.setString(8, Boarding.getText());
							st.setString(9, (String) Class.getSelectedItem());
							st.setString(10, name.getText());
							st.setString(11, age.getText());
							st.setString(12, (String)gender.getSelectedItem());
							st.setString(13,(String)berth.getSelectedItem());
							st.setString(14,(String)noOfPass.getSelectedItem());
							st.setString(15, mobileNo.getText());
							st.setString(16, fare.getText());
							st.setLong(17, pnr);
							st.setString(18, sa);
							st.setString(19, status);
							int rs=st.executeUpdate();
							JOptionPane.showMessageDialog(null,"Booking successful Your PNR No. Is "+pnr);
							String pnrno = String.valueOf(pnr);
							DisplayTicket frame = new DisplayTicket(pnrno);
							frame.setVisible(true);
							dispose();
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						
				}
			}
		});
		button.setRolloverEnabled(false);
		button.setRequestFocusEnabled(false);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		button.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		button.setBackground(new Color(102, 204, 255));
		button.setBounds(75, 474, 358, 36);
		panel.add(button);
		
		JButton btnFare = new JButton("FARE");
		btnFare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				final String Class1= (String) Class.getSelectedItem();
				final String NO = (String)noOfPass.getSelectedItem();
				int a=1500,b=1000,c=500;
				if(Class1=="2A")
				{
					
						if(NO=="1")
						{
							fare.setText("RS "+a);
						}
						if(NO=="2")
						{
							fare.setText("RS "+a*2);
						}
						if(NO=="3")
						{
							fare.setText("RS "+a*3);
						}
						if(NO=="4")
						{
							fare.setText("RS "+a*4);
						}
						if(NO=="5")
						{
							fare.setText("RS "+a*5);
						}
						if(NO=="6")
						{
							fare.setText("RS "+a*6);
						}
						
					
					
				}
				if(Class1=="3A")
				{

					if(NO=="1")
					{
						fare.setText("RS "+b);
					}
					if(NO=="2")
					{
						fare.setText("RS "+b*2);
					}
					if(NO=="3")
					{
						fare.setText("RS "+b*3);
					}
					if(NO=="4")
					{
						fare.setText("RS "+b*4);
					}
					if(NO=="5")
					{
						fare.setText("RS "+b*5);
					}
					if(NO=="6")
					{
						fare.setText("RS "+b*6);
					}
					
				}
				if(Class1=="SL")
				{

					if(NO=="1")
					{
						fare.setText("RS "+c);
					}
					if(NO=="2")
					{
						fare.setText("RS "+c*2);
					}
					if(NO=="3")
					{
						fare.setText("RS "+c*3);
					}
					if(NO=="4")
					{
						fare.setText("RS "+c*4);
					}
					if(NO=="5")
					{
						fare.setText("RS "+c*5);
					}
					if(NO=="6")
					{
						fare.setText("RS "+c*6);
					}
					
				}
		
			}
		});
		btnFare.setRolloverEnabled(false);
		btnFare.setRequestFocusEnabled(false);
		btnFare.setHorizontalTextPosition(SwingConstants.CENTER);
		btnFare.setForeground(Color.WHITE);
		btnFare.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFare.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnFare.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		btnFare.setBackground(new Color(102, 204, 255));
		btnFare.setBounds(74, 428, 177, 30);
		panel.add(btnFare);
		
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
				BookTicket.this.setLocation(x-xx,y-xy);
			}
		});
		
		gradientPanel.setkGradientFocus(50);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.setBounds(0, 0, 727, 433);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel label_1 = new JLabel("Railway Management System");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_1.setBounds(185, 13, 454, 67);
		gradientPanel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("IMAGES\\Subway_100px.png"));
		label_2.setBounds(84, 0, 105, 116);
		gradientPanel.add(label_2);
		
		JLabel lblLetsPlan = new JLabel("( Lets plan safe and comfortable journey )");
		lblLetsPlan.setForeground(Color.WHITE);
		lblLetsPlan.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLetsPlan.setBounds(208, 80, 391, 20);
		gradientPanel.add(lblLetsPlan);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(0, 3));
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(195, 69, 444, 14);
		gradientPanel.add(separator);
		
		JLabel label_9 = new JLabel("X");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_9.setBounds(681, 0, 46, 30);
		gradientPanel.add(label_9);
		date.setText(""+date2);
		
		JLabel lblDeparture = new JLabel("Departure:");
		lblDeparture.setForeground(new Color(0, 102, 255));
		lblDeparture.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeparture.setBounds(75, 163, 91, 28);
		panel.add(lblDeparture);
		
		JLabel lblArrival = new JLabel("Arrival:");
		lblArrival.setForeground(new Color(0, 102, 255));
		lblArrival.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblArrival.setBounds(259, 163, 91, 28);
		panel.add(lblArrival);
		
		JLabel lblBoardingAt = new JLabel("Boarding at:");
		lblBoardingAt.setForeground(new Color(0, 102, 255));
		lblBoardingAt.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBoardingAt.setBounds(75, 194, 114, 28);
		panel.add(lblBoardingAt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(0, 3));
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(205, 54, 177, 9);
		panel.add(separator_1);
		
		JLabel label_13 = new JLabel("");
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Searchtrain frame = new Searchtrain();
				frame.setVisible(true);
				dispose();
			}
		});
		label_13.setIcon(new ImageIcon("IMAGES\\Undo_40px_1.png"));
		label_13.setBounds(10, 11, 47, 36);
		panel.add(label_13);
		if((from=="Dadar" && to=="Madgaon") || (from=="CSTM" && to=="Madgaon"))
		{
			if(from=="Dadar")
			{
				destination1.setText("Dadar");
				destination2.setText("Madgaon");
				Boarding.setText("Dadar");
			}	
			else
			{
				destination1.setText("CSTM");
				destination2.setText("Madgaon");
				Boarding.setText("CSTM");
			}	
			
			if(i==1)
			{
				trainName.setText("Jan Shatabdi Express");
				trainNo.setText("12051");
				Departure.setText("05:25");
				Arrival.setText("16:20");
				
			}
			if(i==2)
			{
				trainName.setText("Mandovi Express");
				trainNo.setText("10103");
				Departure.setText("07:10");
				Arrival.setText("20:10");
				
			}
			if(i==3)
			{
				trainName.setText("Kokan Kanya Express");
				trainNo.setText("10111");
				Departure.setText("23:05");
				Arrival.setText("12:10");
				
			}
			
		}	
		else if((from=="Dadar" && to=="Surat") ||(from=="Dadar" && to=="Ahmedabad")|| (from=="CSTM" && to=="Surat") || (from=="CSTM" && to=="Ahmedabad") || (from=="Borivali" && to=="Surat") || (from=="Borivali" && to=="Ahmedabad"))	
		{
			if(from=="Dadar" && to=="Surat")
			{
				destination1.setText("Dadar");
				destination2.setText("Surat");
				Boarding.setText("Dadar");
			}	
			else if(from=="Dadar" && to=="Ahmedabad")
			{
				destination1.setText("Dadar");
				destination2.setText("Ahmedabad");
				Boarding.setText("Dadar");
			}	
			else if(from=="CSTM" && to=="Surat")
			{
				destination1.setText("CSTM");
				destination2.setText("Surat");
				Boarding.setText("CSTM");
			}
			else if(from=="CSTM" && to=="Ahmedabad")
			{
				destination1.setText("CSTM");
				destination2.setText("Ahmedabad");
				Boarding.setText("CSTM");
			}	
			else if(from=="Borivali" && to=="Surat") 
			{
				destination1.setText("Borivali");
				destination2.setText("Surat");
				Boarding.setText("Borivali");
			}
			else
			{
				destination1.setText("Borivali");
				destination2.setText("Ahmedabad");
				Boarding.setText("Borivali");
			}	
			if(i==1)
			{
				trainName.setText("Dadar Bhuj Express");
				trainNo.setText("12959");
				Departure.setText("00:05");
				Arrival.setText("07:55");
				
			}
			if(i==2)
			{
				trainName.setText("Gujarat Express");
				trainNo.setText("22953");
				Departure.setText("05:57");
				Arrival.setText("14:40");
				
			}
			if(i==3)
			{
				trainName.setText("Saurashtra Express");
				trainNo.setText("19015");
				Departure.setText("08:32");
				Arrival.setText("19:45");
				
			}
			
		}
		
		
	
	}
}
