package com.corejava.management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import com.corejava.railwayDAO.RailwayDB;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.DebugGraphics;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class DisplayPnr extends JFrame {

	private JPanel contentPane;
	 int xx;
		int xy;
		private JTextField TrainNo;
		private JTextField TrainName;
		private JTextField PnrNo;
		private JTextField From;
		private JTextField To;
		private JTextField Name;
		private JTextField Age;
		private JTextField Gender;
		private JTextField NoOfPass;
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
					DisplayPnr frame = new DisplayPnr(pnr);
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public DisplayPnr(String pnr) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 541);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				xx =arg0.getX();
				xy =arg0.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x =arg0.getXOnScreen();
				int y =arg0.getYOnScreen();
				DisplayPnr.this.setLocation(x-xx,y-xy);
			}
		});
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 102, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(0, 3));
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(486, 190, 188, 13);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(0, 3));
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(69, 190, 207, 13);
		contentPane.add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 102, 255)));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(146, 225, 447, 291);
		contentPane.add(panel);
		panel.setLayout(null);
		
		TrainNo = new JTextField();
		TrainNo.setOpaque(false);
		TrainNo.setForeground(new Color(0, 102, 255));
		TrainNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		TrainNo.setEditable(false);
		TrainNo.setColumns(10);
		TrainNo.setBorder(null);
		TrainNo.setBounds(208, 24, 102, 28);
		panel.add(TrainNo);
		
		TrainName = new JTextField();
		TrainName.setOpaque(false);
		TrainName.setForeground(new Color(0, 102, 255));
		TrainName.setFont(new Font("Tahoma", Font.BOLD, 17));
		TrainName.setEditable(false);
		TrainName.setColumns(10);
		TrainName.setBorder(null);
		TrainName.setBounds(10, 24, 190, 28);
		panel.add(TrainName);
		
		JLabel label_3 = new JLabel("Train Name");
		label_3.setForeground(new Color(0, 102, 255));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(10, 0, 111, 28);
		panel.add(label_3);
		
		JLabel label_6 = new JLabel("PNR NO ");
		label_6.setForeground(new Color(0, 102, 255));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_6.setBounds(333, 0, 84, 28);
		panel.add(label_6);
		
		PnrNo = new JTextField();
		PnrNo.setText("<dynamic>");
		PnrNo.setOpaque(false);
		PnrNo.setForeground(new Color(0, 102, 255));
		PnrNo.setFont(new Font("Tahoma", Font.BOLD, 19));
		PnrNo.setEditable(false);
		PnrNo.setColumns(10);
		PnrNo.setBorder(null);
		PnrNo.setBounds(333, 26, 84, 28);
		panel.add(PnrNo);
		
		From = new JTextField();
		From.setOpaque(false);
		From.setHorizontalAlignment(SwingConstants.RIGHT);
		From.setForeground(new Color(0, 102, 255));
		From.setFont(new Font("Tahoma", Font.BOLD, 19));
		From.setEditable(false);
		From.setColumns(10);
		From.setBorder(null);
		From.setBounds(26, 65, 149, 28);
		panel.add(From);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("IMAGES\\Arrows-Right-icon.png"));
		label_7.setBorder(null);
		label_7.setBounds(190, 69, 56, 22);
		panel.add(label_7);
		
		To = new JTextField();
		To.setOpaque(false);
		To.setHorizontalAlignment(SwingConstants.LEFT);
		To.setForeground(new Color(0, 102, 255));
		To.setFont(new Font("Tahoma", Font.BOLD, 19));
		To.setEditable(false);
		To.setColumns(10);
		To.setBorder(null);
		To.setBounds(256, 65, 149, 28);
		panel.add(To);
		
		Name = new JTextField();
		Name.setOpaque(false);
		Name.setHorizontalAlignment(SwingConstants.RIGHT);
		Name.setForeground(new Color(0, 102, 255));
		Name.setFont(new Font("Tahoma", Font.BOLD, 18));
		Name.setEditable(false);
		Name.setColumns(10);
		Name.setBorder(null);
		Name.setBounds(10, 115, 175, 28);
		panel.add(Name);
		
		Age = new JTextField();
		Age.setOpaque(false);
		Age.setHorizontalAlignment(SwingConstants.CENTER);
		Age.setForeground(new Color(0, 102, 255));
		Age.setFont(new Font("Tahoma", Font.BOLD, 18));
		Age.setEditable(false);
		Age.setColumns(10);
		Age.setBorder(null);
		Age.setBounds(200, 115, 32, 28);
		panel.add(Age);
		
		Gender = new JTextField();
		Gender.setOpaque(false);
		Gender.setHorizontalAlignment(SwingConstants.CENTER);
		Gender.setForeground(new Color(0, 102, 255));
		Gender.setFont(new Font("Tahoma", Font.BOLD, 18));
		Gender.setEditable(false);
		Gender.setColumns(10);
		Gender.setBorder(null);
		Gender.setBounds(240, 115, 84, 28);
		panel.add(Gender);
		
		NoOfPass = new JTextField();
		NoOfPass.setOpaque(false);
		NoOfPass.setForeground(new Color(0, 102, 255));
		NoOfPass.setFont(new Font("Tahoma", Font.BOLD, 19));
		NoOfPass.setEditable(false);
		NoOfPass.setColumns(10);
		NoOfPass.setBorder(null);
		NoOfPass.setBounds(391, 115, 26, 28);
		panel.add(NoOfPass);
		
		JLabel label = new JLabel("Status");
		label.setForeground(new Color(0, 102, 255));
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(14, 167, 66, 28);
		panel.add(label);
		
		Status = new JTextField();
		Status.setText("Confirmed");
		Status.setOpaque(false);
		Status.setHorizontalAlignment(SwingConstants.LEFT);
		Status.setForeground(new Color(0, 204, 51));
		Status.setFont(new Font("Tahoma", Font.BOLD, 16));
		Status.setEditable(false);
		Status.setColumns(10);
		Status.setBorder(null);
		Status.setBounds(10, 192, 116, 28);
		panel.add(Status);
		
		JLabel label_8 = new JLabel("Seat(s)");
		label_8.setForeground(new Color(0, 102, 255));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setBounds(261, 167, 81, 28);
		panel.add(label_8);
		
		SeatNo = new JTextField();
		SeatNo.setOpaque(false);
		SeatNo.setHorizontalAlignment(SwingConstants.CENTER);
		SeatNo.setForeground(new Color(0, 102, 255));
		SeatNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		SeatNo.setEditable(false);
		SeatNo.setColumns(10);
		SeatNo.setBorder(null);
		SeatNo.setBounds(123, 193, 309, 28);
		panel.add(SeatNo);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkGradientFocus(50);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.setBounds(0, 0, 733, 321);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("IMAGES\\Subway_100px.png"));
		label_1.setBounds(84, 0, 105, 116);
		gradientPanel.add(label_1);
		
		JLabel label_4 = new JLabel("Railway Management System");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 29));
		label_4.setBounds(198, 25, 454, 67);
		gradientPanel.add(label_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setPreferredSize(new Dimension(0, 3));
		separator_2.setForeground(SystemColor.textHighlight);
		separator_2.setBounds(199, 78, 434, 14);
		gradientPanel.add(separator_2);
		
		JLabel label_5 = new JLabel("( Lets plan safe and comfortable journey )");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_5.setBounds(199, 85, 391, 20);
		gradientPanel.add(label_5);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setPreferredSize(new Dimension(0, 3));
		separator_3.setForeground(SystemColor.textHighlight);
		separator_3.setBounds(70, 127, 603, 14);
		gradientPanel.add(separator_3);
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.setBounds(710, 0, 23, 22);
		gradientPanel.add(lblNewLabel_2);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(289, 161, 62, 66);
		gradientPanel.add(label_2);
		label_2.setIcon(new ImageIcon("IMAGES\\Info_50px_2.png"));
		
		JLabel lblNewLabel_3 = new JLabel("PNR  Status");
		lblNewLabel_3.setBounds(349, 183, 132, 22);
		gradientPanel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setForeground(Color.WHITE);
		
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
					 
					  NoOfPass.setText(""+rs.getString("NoOfPassengers"));
					 
					  Name.setText(""+rs.getString("Name"));
					  Age.setText(""+rs.getString("Age"));
					  Gender.setText(""+rs.getString("Gender"));
					  SeatNo.setText(""+rs.getString("SeatNo"));
					  Status.setText(""+rs.getString("Status"));
					}
				
				PnrNo.setText(pnr);
				
				
				JButton btnReturn = new JButton("RETURN");
				btnReturn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						PnrStatus frame = new PnrStatus();
						frame.setVisible(true);
						dispose();
					}
				});
				btnReturn.setRolloverEnabled(false);
				btnReturn.setRequestFocusEnabled(false);
				btnReturn.setHorizontalTextPosition(SwingConstants.CENTER);
				btnReturn.setForeground(Color.WHITE);
				btnReturn.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnReturn.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
				btnReturn.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
				btnReturn.setBackground(new Color(102, 204, 255));
				btnReturn.setBounds(110, 250, 232, 30);
				panel.add(btnReturn);
				
				JSeparator separator_4 = new JSeparator();
				separator_4.setPreferredSize(new Dimension(0, 3));
				separator_4.setForeground(SystemColor.textHighlight);
				separator_4.setBounds(10, 104, 422, 13);
				panel.add(separator_4);
				
				JSeparator separator_5 = new JSeparator();
				separator_5.setPreferredSize(new Dimension(0, 3));
				separator_5.setForeground(SystemColor.textHighlight);
				separator_5.setBounds(10, 154, 422, 13);
				panel.add(separator_5);
				
				JLabel lblPno = new JLabel("Count-");
				lblPno.setForeground(new Color(0, 102, 255));
				lblPno.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblPno.setBounds(333, 115, 59, 28);
				panel.add(lblPno);
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
