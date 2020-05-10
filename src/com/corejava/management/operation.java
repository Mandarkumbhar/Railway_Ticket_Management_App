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
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JSeparator;
import java.awt.Dimension;

public class operation extends JFrame {

	private JPanel contentPane;
	 int xx;
		int xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 operation frame = new  operation();
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
	public void setColor(JPanel panel)
	{
		panel.setBackground(new java.awt.Color(102,204,255));
	}
	public void resetColor(JPanel panel)
	{
		panel.setBackground(new java.awt.Color(0,153,255));
	}
	public operation() {
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
				 operation.this.setLocation(x-xx,y-xy);
			}
		});
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_3);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_3);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				PnrStatus frame = new PnrStatus();
				frame.setVisible(true);
				dispose();
			}
		});
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(0, 153, 255));
		panel_3.setBounds(495, 237, 122, 105);
		contentPane.add(panel_3);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("IMAGES\\Info_50px_2.png"));
		label_3.setBounds(29, 11, 62, 50);
		panel_3.add(label_3);
		
		JLabel lblPnr = new JLabel("Pnr");
		lblPnr.setForeground(Color.WHITE);
		lblPnr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPnr.setBounds(49, 60, 73, 19);
		panel_3.add(lblPnr);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStatus.setBounds(39, 75, 73, 19);
		panel_3.add(lblStatus);
		
		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_4);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_4);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				CancelTicket frame = new  CancelTicket();
				dispose();
				frame.setVisible(true);
			}
		});
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(0, 153, 255));
		panel_4.setBounds(112, 384, 122, 105);
		contentPane.add(panel_4);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("IMAGES\\Delete Ticket_50px_1.png"));
		label_6.setBounds(29, 11, 62, 50);
		panel_4.add(label_6);
		
		JLabel lblCancel = new JLabel("Cancel");
		lblCancel.setForeground(Color.WHITE);
		lblCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCancel.setBounds(29, 62, 73, 19);
		panel_4.add(lblCancel);
		
		JLabel lblTicket_1 = new JLabel("Ticket");
		lblTicket_1.setForeground(Color.WHITE);
		lblTicket_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTicket_1.setBounds(29, 75, 73, 19);
		panel_4.add(lblTicket_1);
		
		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_5);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_5);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Contact frame = new Contact();
				frame.setVisible(true);
				dispose();
			}
		});
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(0, 153, 255));
		panel_5.setBounds(312, 384, 122, 105);
		contentPane.add(panel_5);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("IMAGES\\Phone_50px_1.png"));
		label_9.setBounds(29, 11, 62, 50);
		panel_5.add(label_9);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContact.setBounds(39, 62, 73, 19);
		panel_5.add(lblContact);
		
		JLabel lblUs = new JLabel("Us");
		lblUs.setForeground(Color.WHITE);
		lblUs.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUs.setBounds(63, 75, 73, 19);
		panel_5.add(lblUs);
		
		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_6);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_6);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				JFrame frame1 = new JFrame("");
				Object login;
				if(JOptionPane.showConfirmDialog(frame1, "Confirm if you want to Log out", "Ticketing System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					login frame = new login();
					frame.setVisible(true);
					dispose();
				}
				
				
			}
		});
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(0, 153, 255));
		panel_6.setBounds(495, 384, 122, 105);
		contentPane.add(panel_6);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("IMAGES\\Shutdown_50px.png"));
		label_12.setBounds(29, 11, 62, 50);
		panel_6.add(label_12);
		
		JLabel lblLogOut = new JLabel("Log");
		lblLogOut.setForeground(Color.WHITE);
		lblLogOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLogOut.setBounds(29, 60, 73, 19);
		panel_6.add(lblLogOut);
		
		JLabel lblOut = new JLabel("Out");
		lblOut.setForeground(Color.WHITE);
		lblOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOut.setBounds(63, 60, 73, 19);
		panel_6.add(lblOut);
		
		JLabel lblNewLabel_3 = new JLabel("Home");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(379, 181, 74, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("IMAGES\\Dog House_62px_2.png"));
		label_2.setBounds(307, 149, 62, 66);
		contentPane.add(label_2);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(0, 3));
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(463, 190, 220, 13);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(0, 3));
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(55, 190, 220, 13);
		contentPane.add(separator_1);
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_1);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_1);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Searchtrain frame = new Searchtrain();
				frame.setVisible(true);
				dispose();
			}
		});
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 153, 255));
		panel_1.setBounds(112, 237, 122, 105);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(25, 11, 50, 50);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("IMAGES\\Search_50px_3.png"));
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(25, 65, 73, 19);
		panel_1.add(lblSearch);
		
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSearch.setForeground(Color.WHITE);
		
		JLabel lblTrain = new JLabel("Train");
		lblTrain.setBounds(25, 81, 73, 19);
		panel_1.add(lblTrain);
		lblTrain.setForeground(Color.WHITE);
		lblTrain.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_2);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_2);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ViewTicket frame = new ViewTicket();
				frame.setVisible(true);
				dispose();
			}
		});
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 153, 255));
		panel_2.setBounds(312, 237, 122, 105);
		contentPane.add(panel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(28, 11, 62, 50);
		panel_2.add(label);
		label.setIcon(new ImageIcon("IMAGES\\Ticket_50px_1.png"));
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(28, 62, 73, 19);
		panel_2.add(lblView);
		lblView.setForeground(Color.WHITE);
		lblView.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setBounds(28, 75, 73, 19);
		panel_2.add(lblTicket);
		lblTicket.setForeground(Color.WHITE);
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkGradientFocus(50);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.setBounds(0, 0, 733, 541);
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
	}
}
