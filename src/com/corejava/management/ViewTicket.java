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

public class ViewTicket extends JFrame {

	private JPanel contentPane;
	 int xx;
		int xy;
		private JTextField pnrNo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTicket frame = new  ViewTicket();
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ViewTicket() {
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
				ViewTicket.this.setLocation(x-xx,y-xy);
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
		panel.setBounds(164, 225, 429, 259);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPnrNumber = new JLabel("PNR NUMBER");
		lblPnrNumber.setForeground(new Color(0, 102, 255));
		lblPnrNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPnrNumber.setBounds(67, 77, 235, 22);
		panel.add(lblPnrNumber);
		
		pnrNo = new JTextField();
		pnrNo.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 51)));
		pnrNo.setOpaque(false);
		pnrNo.setColumns(10);
		pnrNo.setBounds(67, 110, 298, 30);
		panel.add(pnrNo);
		
		JButton btnViewTicket = new JButton("VIEW TICKET");
		btnViewTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String pnr= pnrNo.getText();
				try
				{
				 Connection con = null;
					con=RailwayDB.getConnection();
				java.sql.PreparedStatement st=con.prepareStatement("select * from booking where PnrNo=?;");
				st.setString(1,  pnrNo.getText());
				
				ResultSet rs=st.executeQuery();
					if(rs.next()) {
						//JOptionPane.showMessageDialog(null,"login successful");
						
						
						
						DisplayTicket frame = new DisplayTicket(pnr);
						frame.setVisible(true);
						dispose();
						
					}
					else {
						JOptionPane.showMessageDialog(null,"invalid Pnr No");
					}
				
				
			}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnViewTicket.setRolloverEnabled(false);
		btnViewTicket.setRequestFocusEnabled(false);
		btnViewTicket.setHorizontalTextPosition(SwingConstants.CENTER);
		btnViewTicket.setForeground(Color.WHITE);
		btnViewTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnViewTicket.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnViewTicket.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		btnViewTicket.setBackground(new Color(102, 204, 255));
		btnViewTicket.setBounds(64, 175, 301, 36);
		panel.add(btnViewTicket);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 operation frame = new  operation();
					frame.setVisible(true);
					dispose();
			}
		});
		label.setIcon(new ImageIcon("IMAGES\\Dog House_48px.png"));
		label.setBounds(10, 11, 47, 48);
		panel.add(label);
		
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
		label_2.setBounds(289, 152, 62, 66);
		gradientPanel.add(label_2);
		label_2.setIcon(new ImageIcon("IMAGES\\Ticket_50px_1.png"));
		
		JLabel lblNewLabel_3 = new JLabel("View Ticket");
		lblNewLabel_3.setBounds(349, 183, 132, 22);
		gradientPanel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setForeground(Color.WHITE);
	}
}
