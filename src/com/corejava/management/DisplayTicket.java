package com.corejava.management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import com.corejava.railwayDAO.RailwayDB;

import keeptoo.KGradientPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.DebugGraphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisplayTicket extends JFrame {

	private JPanel contentPane;
	private JTextField TrainName;
	private JTextField PnrNo;
	private JTextField From;
	private JTextField To;
	private JTextField Name;
	private JTextField Class;
	private JTextField Fare;
	private JTextField TrainNo;
	private JTextField Departure;
	private JTextField Arrival;
	private JTextField Boarding;
	private JTextField NoOfPass;
	private JTextField Age;
	private JTextField Gender;
	private JTextField Date;
	private JTextField Status;
	private JTextField SeatNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String pnr = null;
					DisplayTicket frame = new DisplayTicket(pnr);
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
	public DisplayTicket(String pnr) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 505);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 102, 255));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 102, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = new Color(0, 51, 255);
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.kGradientFocus = 50;
		gradientPanel.setkGradientFocus(4);
		gradientPanel.kEndColor = new Color(0, 191, 255);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setBounds(0, 0, 464, 48);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRAIN TICKET");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(154, 11, 153, 28);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblTrainName = new JLabel("Train Name");
		lblTrainName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTrainName.setBounds(10, 59, 111, 28);
		contentPane.add(lblTrainName);
		
		TrainName = new JTextField();
		TrainName.setOpaque(false);
		TrainName.setForeground(new Color(0, 0, 0));
		TrainName.setFont(new Font("Tahoma", Font.BOLD, 17));
		TrainName.setEditable(false);
		TrainName.setColumns(10);
		TrainName.setBorder(null);
		TrainName.setBounds(10, 83, 191, 28);
		contentPane.add(TrainName);
		
		PnrNo = new JTextField();
		PnrNo.setOpaque(false);
		PnrNo.setForeground(new Color(0, 102, 255));
		PnrNo.setFont(new Font("Tahoma", Font.BOLD, 19));
		PnrNo.setEditable(false);
		PnrNo.setColumns(10);
		PnrNo.setBorder(null);
		PnrNo.setBounds(343, 83, 84, 28);
		contentPane.add(PnrNo);
		
		From = new JTextField();
		From.setHorizontalAlignment(SwingConstants.RIGHT);
		From.setOpaque(false);
		From.setForeground(new Color(0, 0, 0));
		From.setFont(new Font("Tahoma", Font.BOLD, 19));
		From.setEditable(false);
		From.setColumns(10);
		From.setBorder(null);
		From.setBounds(36, 122, 149, 28);
		contentPane.add(From);
		
		To = new JTextField();
		To.setHorizontalAlignment(SwingConstants.LEFT);
		To.setOpaque(false);
		To.setForeground(new Color(0, 0, 0));
		To.setFont(new Font("Tahoma", Font.BOLD, 19));
		To.setEditable(false);
		To.setColumns(10);
		To.setBorder(null);
		To.setBounds(266, 122, 149, 28);
		contentPane.add(To);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("IMAGES\\Arrows-Right-icon.png"));
		lblNewLabel_1.setBounds(200, 126, 56, 22);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(0, 3));
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(0, 161, 464, 14);
		contentPane.add(separator);
		
		JLabel lblPnr = new JLabel("PNR NO ");
		lblPnr.setForeground(new Color(0, 102, 255));
		lblPnr.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPnr.setBounds(343, 57, 84, 28);
		contentPane.add(lblPnr);
		
		Name = new JTextField();
		Name.setHorizontalAlignment(SwingConstants.RIGHT);
		Name.setOpaque(false);
		Name.setForeground(new Color(0, 0, 0));
		Name.setFont(new Font("Tahoma", Font.BOLD, 19));
		Name.setEditable(false);
		Name.setColumns(10);
		Name.setBorder(null);
		Name.setBounds(0, 312, 191, 28);
		contentPane.add(Name);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(0, 3));
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(0, 225, 464, 14);
		contentPane.add(separator_1);
		
		JLabel lblClass = new JLabel("Class :");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblClass.setBounds(36, 351, 66, 28);
		contentPane.add(lblClass);
		
		Class = new JTextField();
		Class.setOpaque(false);
		Class.setHorizontalAlignment(SwingConstants.CENTER);
		Class.setForeground(new Color(0, 0, 139));
		Class.setFont(new Font("Tahoma", Font.BOLD, 14));
		Class.setEditable(false);
		Class.setColumns(10);
		Class.setBorder(null);
		Class.setBounds(93, 352, 32, 28);
		contentPane.add(Class);
		
		JLabel lblFare = new JLabel("Fare :");
		lblFare.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFare.setBounds(264, 353, 63, 28);
		contentPane.add(lblFare);
		
		Fare = new JTextField();
		Fare.setOpaque(false);
		Fare.setHorizontalAlignment(SwingConstants.CENTER);
		Fare.setForeground(new Color(0, 0, 139));
		Fare.setFont(new Font("Tahoma", Font.BOLD, 14));
		Fare.setEditable(false);
		Fare.setColumns(10);
		Fare.setBorder(null);
		Fare.setBounds(324, 351, 91, 28);
		contentPane.add(Fare);
		
		TrainNo = new JTextField();
		TrainNo.setOpaque(false);
		TrainNo.setForeground(new Color(0, 0, 0));
		TrainNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		TrainNo.setEditable(false);
		TrainNo.setColumns(10);
		TrainNo.setBorder(null);
		TrainNo.setBounds(200, 83, 97, 28);
		contentPane.add(TrainNo);
		
		JLabel label = new JLabel("Departure");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(36, 161, 111, 28);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Arrival");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(263, 161, 111, 28);
		contentPane.add(label_1);
		
		Departure = new JTextField();
		Departure.setOpaque(false);
		Departure.setForeground(new Color(0, 0, 0));
		Departure.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Departure.setEditable(false);
		Departure.setColumns(10);
		Departure.setBorder(null);
		Departure.setBounds(36, 186, 111, 28);
		contentPane.add(Departure);
		
		Arrival = new JTextField();
		Arrival.setOpaque(false);
		Arrival.setForeground(new Color(0, 0, 0));
		Arrival.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Arrival.setEditable(false);
		Arrival.setColumns(10);
		Arrival.setBorder(null);
		Arrival.setBounds(263, 186, 111, 28);
		contentPane.add(Arrival);
		
		JLabel label_2 = new JLabel("Boarding At");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(36, 234, 111, 28);
		contentPane.add(label_2);
		
		Boarding = new JTextField();
		Boarding.setOpaque(false);
		Boarding.setForeground(new Color(0, 0, 0));
		Boarding.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Boarding.setEditable(false);
		Boarding.setColumns(10);
		Boarding.setBorder(null);
		Boarding.setBounds(36, 262, 111, 28);
		contentPane.add(Boarding);
		
		NoOfPass = new JTextField();
		NoOfPass.setOpaque(false);
		NoOfPass.setForeground(new Color(0, 0, 0));
		NoOfPass.setFont(new Font("Tahoma", Font.BOLD, 19));
		NoOfPass.setEditable(false);
		NoOfPass.setColumns(10);
		NoOfPass.setBorder(null);
		NoOfPass.setBounds(398, 312, 31, 28);
		contentPane.add(NoOfPass);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setPreferredSize(new Dimension(0, 3));
		separator_2.setForeground(SystemColor.textHighlight);
		separator_2.setBounds(0, 301, 464, 14);
		contentPane.add(separator_2);
		
		Age = new JTextField();
		Age.setOpaque(false);
		Age.setHorizontalAlignment(SwingConstants.CENTER);
		Age.setForeground(new Color(0, 0, 0));
		Age.setFont(new Font("Tahoma", Font.BOLD, 19));
		Age.setEditable(false);
		Age.setColumns(10);
		Age.setBorder(null);
		Age.setBounds(201, 312, 32, 28);
		contentPane.add(Age);
		
		Gender = new JTextField();
		Gender.setOpaque(false);
		Gender.setHorizontalAlignment(SwingConstants.CENTER);
		Gender.setForeground(new Color(0, 0, 0));
		Gender.setFont(new Font("Tahoma", Font.BOLD, 19));
		Gender.setEditable(false);
		Gender.setColumns(10);
		Gender.setBorder(null);
		Gender.setBounds(243, 312, 68, 28);
		contentPane.add(Gender);
		
		JLabel label_3 = new JLabel("Date of Journey");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(260, 234, 155, 28);
		contentPane.add(label_3);
		
		Date = new JTextField();
		Date.setHorizontalAlignment(SwingConstants.RIGHT);
		Date.setOpaque(false);
		Date.setForeground(new Color(0, 0, 0));
		Date.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Date.setEditable(false);
		Date.setColumns(10);
		Date.setBorder(null);
		Date.setBounds(200, 262, 244, 28);
		contentPane.add(Date);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setPreferredSize(new Dimension(0, 3));
		separator_3.setForeground(SystemColor.textHighlight);
		separator_3.setBounds(0, 390, 464, 14);
		contentPane.add(separator_3);
		
		JLabel label_4 = new JLabel("Status");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(36, 401, 66, 28);
		contentPane.add(label_4);
		
		JLabel lblSeats = new JLabel("Seat(s)");
		lblSeats.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSeats.setBounds(261, 401, 154, 28);
		contentPane.add(lblSeats);
		
		Status = new JTextField();
		Status.setOpaque(false);
		Status.setHorizontalAlignment(SwingConstants.LEFT);
		Status.setForeground(new Color(0, 204, 51));
		Status.setFont(new Font("Tahoma", Font.BOLD, 16));
		Status.setEditable(false);
		Status.setColumns(10);
		Status.setBorder(null);
		Status.setBounds(21, 426, 111, 28);
		contentPane.add(Status);
		
		SeatNo = new JTextField();
		SeatNo.setOpaque(false);
		SeatNo.setHorizontalAlignment(SwingConstants.CENTER);
		SeatNo.setForeground(new Color(0, 0, 139));
		SeatNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		SeatNo.setEditable(false);
		SeatNo.setColumns(10);
		SeatNo.setBorder(null);
		SeatNo.setBounds(136, 426, 318, 28);
		contentPane.add(SeatNo);
		
		JButton btnOk = new JButton("ADD TO CALENDER");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				JOptionPane.showMessageDialog(null,"Succesfully Added to Calender");
				operation frame = new  operation();
				frame.setVisible(true);
				dispose();
			}
		});
		btnOk.setRolloverEnabled(false);
		btnOk.setRequestFocusEnabled(false);
		btnOk.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOk.setForeground(Color.WHITE);
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOk.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnOk.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		btnOk.setBackground(new Color(102, 204, 255));
		btnOk.setBounds(0, 474, 233, 30);
		contentPane.add(btnOk);
		
		JButton btnOk_1 = new JButton("OK");
		btnOk_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operation frame = new  operation();
				frame.setVisible(true);
				dispose();
			}
		});
		btnOk_1.setRolloverEnabled(false);
		btnOk_1.setRequestFocusEnabled(false);
		btnOk_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOk_1.setForeground(Color.WHITE);
		btnOk_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOk_1.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnOk_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		btnOk_1.setBackground(new Color(102, 204, 255));
		btnOk_1.setBounds(232, 474, 232, 30);
		contentPane.add(btnOk_1);
		
		try {
			 Connection con = null;
				con=RailwayDB.getConnection();
				java.sql.PreparedStatement st1=con.prepareStatement("select * from booking where PnrNo=? AND Status='Cancelled';");
				st1.setString(1,  pnr);
				ResultSet rs1=st1.executeQuery();
				 if(rs1.next())
				  {
					  Status.setForeground(new Color(255,0,0));
				  }
				 else 
				 {
					 Status.setForeground(new Color(0, 204, 51));
				 }
				java.sql.PreparedStatement st=con.prepareStatement("select * from booking where PnrNo=?;");
				st.setString(1, pnr);
				ResultSet rs=st.executeQuery();
				if(rs.next()) { 
					 
					TrainName.setText(""+rs.getString("TrainName"));
					TrainNo.setText(""+rs.getString("TrainNo"));
					From.setText(""+ rs.getString("Destination1"));
					To.setText(""+rs.getString("Destination2"));
					  Date.setText(""+rs.getString("Date"));
					  Departure.setText(""+rs.getString("Departure"));
					  Arrival.setText(""+rs.getString("Arrival"));
					  Class.setText(""+rs.getString("Class"));
					  Boarding.setText(""+rs.getString("Boarding"));
					  NoOfPass.setText(""+rs.getString("NoOfPassengers"));
					  Fare.setText(""+rs.getString("Fare"));
					  Name.setText(""+rs.getString("Name"));
					  Age.setText(""+rs.getString("Age"));
					  Gender.setText(""+rs.getString("Gender"));
					  SeatNo.setText(""+rs.getString("SeatNo"));
					  Status.setText(""+rs.getString("Status"));
					  
					 
					}
				
				PnrNo.setText(pnr);
				
				JLabel label_5 = new JLabel("Count-");
				label_5.setForeground(new Color(0, 0, 0));
				label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
				label_5.setBounds(332, 312, 97, 28);
				contentPane.add(label_5);
				
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
