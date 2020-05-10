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
import javax.swing.JButton;
import javax.swing.DebugGraphics;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contact extends JFrame {

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
					Contact frame = new Contact();
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Contact() {
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
				Contact.this.setLocation(x-xx,y-xy);
			}
		});
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 102, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 102, 255)));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(98, 84, 553, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon("IMAGES\\Gmail_25px.png"));
		lblNewLabel.setBounds(100, 43, 35, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mandar A Kumbhar");
		lblNewLabel_1.setForeground(new Color(0, 102, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(100, 22, 212, 21);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("IMAGES\\WhatsApp_25px_1.png"));
		label.setBounds(100, 65, 46, 39);
		panel.add(label);
		
		JLabel lblMandarkumbhargmailcom = new JLabel("mandarkumbhar65@gmail.com");
		lblMandarkumbhargmailcom.setForeground(new Color(0, 153, 255));
		lblMandarkumbhargmailcom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMandarkumbhargmailcom.setBounds(136, 43, 246, 21);
		panel.add(lblMandarkumbhargmailcom);
		
		JLabel label_3 = new JLabel("9930641900");
		label_3.setForeground(new Color(0, 153, 255));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(136, 65, 246, 39);
		panel.add(label_3);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("IMAGES\\Tejas60.jpg"));
		label_1.setBorder(null);
		label_1.setBounds(26, 114, 64, 72);
		panel.add(label_1);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("IMAGES\\IMG-20180903-WA0005.jpg"));
		label_4.setBorder(null);
		label_4.setBounds(26, 209, 64, 72);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		label_5.setBounds(26, 292, 64, 72);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("IMAGES\\mandar60.jpg"));
		label_6.setBorder(null);
		label_6.setBounds(26, 22, 64, 72);
		panel.add(label_6);
		
		JLabel lblTejasKhanted = new JLabel("Tejas Khanted");
		lblTejasKhanted.setForeground(new Color(0, 102, 255));
		lblTejasKhanted.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTejasKhanted.setBounds(100, 115, 212, 21);
		panel.add(lblTejasKhanted);
		
		JLabel lblTejaskhantedgmailcom = new JLabel("tejaskhanted28@gmail.com");
		lblTejaskhantedgmailcom.setForeground(new Color(0, 153, 255));
		lblTejaskhantedgmailcom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTejaskhantedgmailcom.setBounds(136, 136, 246, 21);
		panel.add(lblTejaskhantedgmailcom);
		
		JLabel label_9 = new JLabel("9082753083");
		label_9.setForeground(new Color(0, 153, 255));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(136, 158, 246, 32);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("IMAGES\\WhatsApp_25px_1.png"));
		label_10.setBounds(100, 158, 46, 39);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("IMAGES\\Gmail_25px.png"));
		label_11.setBorder(null);
		label_11.setBounds(100, 136, 35, 27);
		panel.add(label_11);
		
		JLabel lblKavanNaik = new JLabel("Kavan Naik");
		lblKavanNaik.setForeground(new Color(0, 102, 255));
		lblKavanNaik.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblKavanNaik.setBounds(100, 209, 212, 21);
		panel.add(lblKavanNaik);
		
		JLabel lblNaikkavangmailcom = new JLabel("naikkavan@gmail.com");
		lblNaikkavangmailcom.setForeground(new Color(0, 153, 255));
		lblNaikkavangmailcom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNaikkavangmailcom.setBounds(136, 230, 246, 21);
		panel.add(lblNaikkavangmailcom);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("IMAGES\\Gmail_25px.png"));
		label_12.setBorder(null);
		label_12.setBounds(100, 230, 35, 27);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("IMAGES\\WhatsApp_25px_1.png"));
		label_13.setBounds(100, 252, 46, 39);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("9224380437");
		label_14.setForeground(new Color(0, 153, 255));
		label_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_14.setBounds(136, 252, 246, 32);
		panel.add(label_14);
		
		JLabel lblRutvikLathiya = new JLabel("Rutvik Lathiya");
		lblRutvikLathiya.setForeground(new Color(0, 102, 255));
		lblRutvikLathiya.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRutvikLathiya.setBounds(100, 292, 212, 21);
		panel.add(lblRutvikLathiya);
		
		JLabel lblRutvikhdgmailcom = new JLabel("rutvikhd@gmail.com");
		lblRutvikhdgmailcom.setForeground(new Color(0, 153, 255));
		lblRutvikhdgmailcom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRutvikhdgmailcom.setBounds(136, 313, 246, 21);
		panel.add(lblRutvikhdgmailcom);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("IMAGES\\Gmail_25px.png"));
		label_15.setBorder(null);
		label_15.setBounds(100, 313, 35, 27);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("IMAGES\\WhatsApp_25px_1.png"));
		label_16.setBounds(100, 335, 46, 39);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("9967293194");
		label_17.setForeground(new Color(0, 153, 255));
		label_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_17.setBounds(136, 335, 246, 32);
		panel.add(label_17);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkGradientFocus(50);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.setBounds(0, 0, 733, 321);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
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
		label_2.setBounds(281, 11, 62, 66);
		gradientPanel.add(label_2);
		label_2.setIcon(new ImageIcon("IMAGES\\Phone_50px_1.png"));
		
		JLabel lblNewLabel_3 = new JLabel("Contact us");
		lblNewLabel_3.setBounds(338, 38, 132, 22);
		gradientPanel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setForeground(Color.WHITE);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(476, 47, 188, 13);
		gradientPanel.add(separator);
		separator.setPreferredSize(new Dimension(0, 3));
		separator.setForeground(SystemColor.textHighlight);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(64, 47, 207, 13);
		gradientPanel.add(separator_1);
		separator_1.setPreferredSize(new Dimension(0, 3));
		separator_1.setForeground(SystemColor.textHighlight);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setFocusPainted(false);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operation frame = new  operation();
				frame.setVisible(true);
				dispose();

			}
		});
		btnHome.setRolloverEnabled(false);
		btnHome.setRequestFocusEnabled(false);
		btnHome.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHome.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnHome.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		btnHome.setBackground(new Color(102, 204, 255));
		btnHome.setBounds(232, 495, 301, 36);
		contentPane.add(btnHome);
	}
}
