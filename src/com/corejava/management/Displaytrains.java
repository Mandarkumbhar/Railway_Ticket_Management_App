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

public class Displaytrains extends JFrame {

	private JPanel contentPane;
	 int xx;
		int xy;
		protected static final String String = null;
		protected static final Date Date = null;
		private JTextField destination1;
		private JTextField destination2;
		private JTextField trainName1;
		private JTextField trainno1;
		private JTextField time1;
		private JTextField timeTaken1;
		private JTextField class2A1;
		private JTextField class3A1;
		private JTextField classSL1;
		private JTextField trainName2;
		private JTextField trainno2;
		private JTextField time2;
		private JTextField timeTaken2;
		private JTextField class2A2;
		private JTextField class3A2;
		private JTextField classSL2;
		private JTextField trainName3;
		private JTextField trainno3;
		private JTextField time3;
		private JTextField timeTaken3;
		private JTextField class2A3;
		private JTextField class3A3;
		private JTextField classSL3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Displaytrains frame = new Displaytrains(Date,String ,String);
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
	public Displaytrains(final java.util.Date date2,final String from,final String to) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 641);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 153, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 102, 255)));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);
		panel.setBounds(91, 159, 565, 457);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Available Trains Details");
		label.setForeground(new Color(0, 102, 255));
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		label.setBounds(147, 0, 294, 30);
		panel.add(label);
		
		destination1 = new JTextField();
		destination1.setOpaque(false);
		destination1.setForeground(new Color(0, 102, 255));
		destination1.setFont(new Font("Tahoma", Font.BOLD, 20));
		destination1.setEditable(false);
		destination1.setColumns(10);
		destination1.setBorder(null);
		destination1.setBackground(Color.WHITE);
		destination1.setBounds(157, 41, 108, 30);
		panel.add(destination1);
		
		destination2 = new JTextField();
		destination2.setOpaque(false);
		destination2.setForeground(new Color(0, 102, 255));
		destination2.setFont(new Font("Tahoma", Font.BOLD, 20));
		destination2.setEditable(false);
		destination2.setColumns(10);
		destination2.setBorder(null);
		destination2.setBackground(Color.WHITE);
		destination2.setBounds(329, 41, 131, 30);
		panel.add(destination2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("IMAGES\\Arrow_48px.png"));
		label_3.setBounds(260, 41, 59, 36);
		panel.add(label_3);
		
		trainName1 = new JTextField();
		trainName1.setOpaque(false);
		trainName1.setForeground(new Color(0, 102, 255));
		trainName1.setFont(new Font("Tahoma", Font.BOLD, 18));
		trainName1.setEditable(false);
		trainName1.setColumns(10);
		trainName1.setBorder(null);
		trainName1.setBackground(Color.WHITE);
		trainName1.setBounds(59, 97, 206, 30);
		panel.add(trainName1);
		
		trainno1 = new JTextField();
		trainno1.setOpaque(false);
		trainno1.setForeground(new Color(0, 102, 255));
		trainno1.setFont(new Font("Tahoma", Font.BOLD, 18));
		trainno1.setEditable(false);
		trainno1.setColumns(10);
		trainno1.setBorder(null);
		trainno1.setBackground(Color.WHITE);
		trainno1.setBounds(275, 97, 91, 30);
		panel.add(trainno1);
		
		Label label_4 = new Label("2A");
		label_4.setForeground(new Color(0, 102, 255));
		label_4.setFont(new Font("Dialog", Font.BOLD, 16));
		label_4.setBounds(162, 134, 34, 22);
		panel.add(label_4);
		
		time1 = new JTextField();
		time1.setOpaque(false);
		time1.setForeground(new Color(0, 102, 255));
		time1.setFont(new Font("Tahoma", Font.BOLD, 14));
		time1.setEditable(false);
		time1.setColumns(10);
		time1.setBorder(null);
		time1.setBackground(Color.WHITE);
		time1.setBounds(366, 104, 157, 20);
		panel.add(time1);
		
		timeTaken1 = new JTextField();
		timeTaken1.setOpaque(false);
		timeTaken1.setForeground(new Color(0, 102, 255));
		timeTaken1.setFont(new Font("Tahoma", Font.BOLD, 14));
		timeTaken1.setEditable(false);
		timeTaken1.setColumns(10);
		timeTaken1.setBorder(null);
		timeTaken1.setBackground(Color.WHITE);
		timeTaken1.setBounds(366, 129, 141, 20);
		panel.add(timeTaken1);
		
		Label label_5 = new Label("3A");
		label_5.setForeground(new Color(0, 102, 255));
		label_5.setFont(new Font("Dialog", Font.BOLD, 16));
		label_5.setBounds(220, 134, 34, 22);
		panel.add(label_5);
		
		Label label_6 = new Label("Class");
		label_6.setForeground(new Color(0, 102, 255));
		label_6.setFont(new Font("Dialog", Font.BOLD, 16));
		label_6.setBounds(59, 133, 73, 22);
		panel.add(label_6);
		
		Label label_7 = new Label("Availiblity");
		label_7.setForeground(new Color(0, 102, 255));
		label_7.setFont(new Font("Dialog", Font.BOLD, 16));
		label_7.setBounds(59, 162, 86, 22);
		panel.add(label_7);
		
		class2A1 = new JTextField();
		class2A1.setOpaque(false);
		class2A1.setForeground(new Color(0, 153, 51));
		class2A1.setFont(new Font("Tahoma", Font.BOLD, 15));
		class2A1.setEditable(false);
		class2A1.setColumns(10);
		class2A1.setBorder(null);
		class2A1.setBackground(Color.WHITE);
		class2A1.setBounds(162, 162, 34, 20);
		panel.add(class2A1);
		
		class3A1 = new JTextField();
		class3A1.setOpaque(false);
		class3A1.setForeground(new Color(0, 153, 51));
		class3A1.setFont(new Font("Tahoma", Font.BOLD, 15));
		class3A1.setEditable(false);
		class3A1.setColumns(10);
		class3A1.setBorder(null);
		class3A1.setBackground(Color.WHITE);
		class3A1.setBounds(220, 162, 34, 20);
		panel.add(class3A1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(147, 135, 2, 43);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(206, 135, 2, 43);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(267, 135, 2, 43);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(328, 135, 2, 43);
		panel.add(separator_4);
		
		Label label_8 = new Label("SL");
		label_8.setForeground(new Color(0, 102, 255));
		label_8.setFont(new Font("Dialog", Font.BOLD, 16));
		label_8.setBounds(285, 134, 34, 22);
		panel.add(label_8);
		
		classSL1 = new JTextField();
		classSL1.setOpaque(false);
		classSL1.setForeground(new Color(0, 153, 51));
		classSL1.setFont(new Font("Tahoma", Font.BOLD, 15));
		classSL1.setEditable(false);
		classSL1.setColumns(10);
		classSL1.setBorder(null);
		classSL1.setBackground(Color.WHITE);
		classSL1.setBounds(285, 162, 34, 20);
		panel.add(classSL1);
		
		trainName2 = new JTextField();
		trainName2.setOpaque(false);
		trainName2.setForeground(new Color(0, 102, 255));
		trainName2.setFont(new Font("Tahoma", Font.BOLD, 18));
		trainName2.setEditable(false);
		trainName2.setColumns(10);
		trainName2.setBorder(null);
		trainName2.setBackground(Color.WHITE);
		trainName2.setBounds(59, 214, 206, 30);
		panel.add(trainName2);
		
		trainno2 = new JTextField();
		trainno2.setOpaque(false);
		trainno2.setForeground(new Color(0, 102, 255));
		trainno2.setFont(new Font("Tahoma", Font.BOLD, 18));
		trainno2.setEditable(false);
		trainno2.setColumns(10);
		trainno2.setBorder(null);
		trainno2.setBackground(Color.WHITE);
		trainno2.setBounds(275, 214, 91, 30);
		panel.add(trainno2);
		
		time2 = new JTextField();
		time2.setOpaque(false);
		time2.setForeground(new Color(0, 102, 255));
		time2.setFont(new Font("Tahoma", Font.BOLD, 14));
		time2.setEditable(false);
		time2.setColumns(10);
		time2.setBorder(null);
		time2.setBackground(Color.WHITE);
		time2.setBounds(366, 221, 157, 20);
		panel.add(time2);
		
		timeTaken2 = new JTextField();
		timeTaken2.setOpaque(false);
		timeTaken2.setForeground(new Color(0, 102, 255));
		timeTaken2.setFont(new Font("Tahoma", Font.BOLD, 14));
		timeTaken2.setEditable(false);
		timeTaken2.setColumns(10);
		timeTaken2.setBorder(null);
		timeTaken2.setBackground(Color.WHITE);
		timeTaken2.setBounds(366, 246, 141, 20);
		panel.add(timeTaken2);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(328, 252, 2, 43);
		panel.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(267, 252, 2, 43);
		panel.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(206, 252, 2, 43);
		panel.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(147, 252, 2, 43);
		panel.add(separator_8);
		
		Label label_10 = new Label("2A");
		label_10.setForeground(new Color(0, 102, 255));
		label_10.setFont(new Font("Dialog", Font.BOLD, 16));
		label_10.setBounds(162, 251, 34, 22);
		panel.add(label_10);
		
		class2A2 = new JTextField();
		class2A2.setOpaque(false);
		class2A2.setForeground(new Color(0, 153, 51));
		class2A2.setFont(new Font("Tahoma", Font.BOLD, 15));
		class2A2.setEditable(false);
		class2A2.setColumns(10);
		class2A2.setBorder(null);
		class2A2.setBackground(Color.WHITE);
		class2A2.setBounds(162, 279, 34, 20);
		panel.add(class2A2);
		
		Label label_11 = new Label("3A");
		label_11.setForeground(new Color(0, 102, 255));
		label_11.setFont(new Font("Dialog", Font.BOLD, 16));
		label_11.setBounds(220, 251, 34, 22);
		panel.add(label_11);
		
		class3A2 = new JTextField();
		class3A2.setOpaque(false);
		class3A2.setForeground(new Color(0, 153, 51));
		class3A2.setFont(new Font("Tahoma", Font.BOLD, 15));
		class3A2.setEditable(false);
		class3A2.setColumns(10);
		class3A2.setBorder(null);
		class3A2.setBackground(Color.WHITE);
		class3A2.setBounds(220, 279, 34, 20);
		panel.add(class3A2);
		
		Label label_12 = new Label("SL");
		label_12.setForeground(new Color(0, 102, 255));
		label_12.setFont(new Font("Dialog", Font.BOLD, 16));
		label_12.setBounds(285, 251, 34, 22);
		panel.add(label_12);
		
		classSL2 = new JTextField();
		classSL2.setOpaque(false);
		classSL2.setForeground(new Color(0, 153, 51));
		classSL2.setFont(new Font("Tahoma", Font.BOLD, 15));
		classSL2.setEditable(false);
		classSL2.setColumns(10);
		classSL2.setBorder(null);
		classSL2.setBackground(Color.WHITE);
		classSL2.setBounds(285, 279, 34, 20);
		panel.add(classSL2);
		
		Label label_13 = new Label("Class");
		label_13.setForeground(new Color(0, 102, 255));
		label_13.setFont(new Font("Dialog", Font.BOLD, 16));
		label_13.setBounds(59, 250, 73, 22);
		panel.add(label_13);
		
		Label label_14 = new Label("Availiblity");
		label_14.setForeground(new Color(0, 102, 255));
		label_14.setFont(new Font("Dialog", Font.BOLD, 16));
		label_14.setBounds(59, 279, 86, 22);
		panel.add(label_14);
		
		trainName3 = new JTextField();
		trainName3.setOpaque(false);
		trainName3.setForeground(new Color(0, 102, 255));
		trainName3.setFont(new Font("Tahoma", Font.BOLD, 18));
		trainName3.setEditable(false);
		trainName3.setColumns(10);
		trainName3.setBorder(null);
		trainName3.setBackground(Color.WHITE);
		trainName3.setBounds(59, 327, 206, 30);
		panel.add(trainName3);
		
		trainno3 = new JTextField();
		trainno3.setOpaque(false);
		trainno3.setForeground(new Color(0, 102, 255));
		trainno3.setFont(new Font("Tahoma", Font.BOLD, 18));
		trainno3.setEditable(false);
		trainno3.setColumns(10);
		trainno3.setBorder(null);
		trainno3.setBackground(Color.WHITE);
		trainno3.setBounds(275, 327, 91, 30);
		panel.add(trainno3);
		
		time3 = new JTextField();
		time3.setOpaque(false);
		time3.setForeground(new Color(0, 102, 255));
		time3.setFont(new Font("Tahoma", Font.BOLD, 14));
		time3.setEditable(false);
		time3.setColumns(10);
		time3.setBorder(null);
		time3.setBackground(Color.WHITE);
		time3.setBounds(366, 334, 157, 20);
		panel.add(time3);
		
		timeTaken3 = new JTextField();
		timeTaken3.setOpaque(false);
		timeTaken3.setForeground(new Color(0, 102, 255));
		timeTaken3.setFont(new Font("Tahoma", Font.BOLD, 14));
		timeTaken3.setEditable(false);
		timeTaken3.setColumns(10);
		timeTaken3.setBorder(null);
		timeTaken3.setBackground(Color.WHITE);
		timeTaken3.setBounds(366, 361, 141, 20);
		panel.add(timeTaken3);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(328, 365, 2, 43);
		panel.add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(267, 365, 2, 43);
		panel.add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(206, 365, 2, 43);
		panel.add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setBounds(147, 365, 2, 43);
		panel.add(separator_12);
		
		Label label_15 = new Label("2A");
		label_15.setForeground(new Color(0, 102, 255));
		label_15.setFont(new Font("Dialog", Font.BOLD, 16));
		label_15.setBounds(162, 364, 34, 22);
		panel.add(label_15);
		
		class2A3 = new JTextField();
		class2A3.setOpaque(false);
		class2A3.setForeground(new Color(0, 153, 51));
		class2A3.setFont(new Font("Tahoma", Font.BOLD, 15));
		class2A3.setEditable(false);
		class2A3.setColumns(10);
		class2A3.setBorder(null);
		class2A3.setBackground(Color.WHITE);
		class2A3.setBounds(162, 392, 34, 20);
		panel.add(class2A3);
		
		Label label_16 = new Label("3A");
		label_16.setForeground(new Color(0, 102, 255));
		label_16.setFont(new Font("Dialog", Font.BOLD, 16));
		label_16.setBounds(220, 364, 34, 22);
		panel.add(label_16);
		
		class3A3 = new JTextField();
		class3A3.setOpaque(false);
		class3A3.setForeground(new Color(0, 153, 51));
		class3A3.setFont(new Font("Tahoma", Font.BOLD, 15));
		class3A3.setEditable(false);
		class3A3.setColumns(10);
		class3A3.setBorder(null);
		class3A3.setBackground(Color.WHITE);
		class3A3.setBounds(220, 392, 34, 20);
		panel.add(class3A3);
		
		Label label_17 = new Label("SL");
		label_17.setForeground(new Color(0, 102, 255));
		label_17.setFont(new Font("Dialog", Font.BOLD, 16));
		label_17.setBounds(285, 364, 34, 22);
		panel.add(label_17);
		
		classSL3 = new JTextField();
		classSL3.setOpaque(false);
		classSL3.setForeground(new Color(0, 153, 51));
		classSL3.setFont(new Font("Tahoma", Font.BOLD, 15));
		classSL3.setEditable(false);
		classSL3.setColumns(10);
		classSL3.setBorder(null);
		classSL3.setBackground(Color.WHITE);
		classSL3.setBounds(285, 392, 34, 20);
		panel.add(classSL3);
		
		Label label_18 = new Label("Class");
		label_18.setForeground(new Color(0, 102, 255));
		label_18.setFont(new Font("Dialog", Font.BOLD, 16));
		label_18.setBounds(59, 363, 73, 22);
		panel.add(label_18);
		
		Label label_19 = new Label("Availiblity");
		label_19.setForeground(new Color(0, 102, 255));
		label_19.setFont(new Font("Dialog", Font.BOLD, 16));
		label_19.setBounds(59, 392, 86, 22);
		panel.add(label_19);
		
		JButton Book1 = new JButton("BOOK NOW");
		Book1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new BookTicket(1,date2,from,to).setVisible(true);
				dispose();
			}
		});
		Book1.setRolloverEnabled(false);
		Book1.setRequestFocusEnabled(false);
		Book1.setHorizontalTextPosition(SwingConstants.CENTER);
		Book1.setForeground(Color.WHITE);
		Book1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Book1.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		Book1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		Book1.setBackground(new Color(102, 204, 255));
		Book1.setBounds(366, 160, 157, 30);
		panel.add(Book1);
		
		JButton Book2 = new JButton("BOOK NOW");
		Book2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new BookTicket(2,date2,from,to).setVisible(true);
				dispose();
			}
		});
		Book2.setRolloverEnabled(false);
		Book2.setRequestFocusEnabled(false);
		Book2.setHorizontalTextPosition(SwingConstants.CENTER);
		Book2.setForeground(Color.WHITE);
		Book2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Book2.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		Book2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		Book2.setBackground(new Color(102, 204, 255));
		Book2.setBounds(366, 277, 157, 30);
		panel.add(Book2);
		
		JButton Book3 = new JButton("BOOK NOW");
		Book3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new BookTicket(3,date2,from,to).setVisible(true);
				dispose();
				
				
			}
		});
		Book3.setRolloverEnabled(false);
		Book3.setRequestFocusEnabled(false);
		Book3.setHorizontalTextPosition(SwingConstants.CENTER);
		Book3.setForeground(Color.WHITE);
		Book3.setFont(new Font("Tahoma", Font.BOLD, 15));
		Book3.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		Book3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		Book3.setBackground(new Color(102, 204, 255));
		Book3.setBounds(366, 392, 157, 30);
		panel.add(Book3);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setPreferredSize(new Dimension(0, 3));
		separator_13.setForeground(SystemColor.controlShadow);
		separator_13.setBounds(45, 201, 475, 14);
		panel.add(separator_13);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setPreferredSize(new Dimension(0, 3));
		separator_14.setForeground(SystemColor.controlShadow);
		separator_14.setBounds(48, 320, 475, 14);
		panel.add(separator_14);
		
		JLabel label_20 = new JLabel("");
		label_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Searchtrain frame = new Searchtrain();
				frame.setVisible(true);
				dispose();
			}
		});
		label_20.setIcon(new ImageIcon("IMAGES\\Undo_40px_1.png"));
		label_20.setBounds(24, 14, 47, 36);
		panel.add(label_20);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setPreferredSize(new Dimension(0, 3));
		separator_15.setForeground(SystemColor.textHighlight);
		separator_15.setBounds(147, 36, 277, 14);
		panel.add(separator_15);
		
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
				Displaytrains.this.setLocation(x-xx,y-xy);
			}
		});
		
		gradientPanel.setkGradientFocus(50);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.setBounds(0, 0, 727, 396);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel label_1 = new JLabel("Railway Management System");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_1.setBounds(182, 42, 454, 67);
		gradientPanel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("IMAGES\\Subway_100px.png"));
		label_2.setBounds(81, 29, 105, 116);
		gradientPanel.add(label_2);
		
		JLabel lblLetsPlan = new JLabel("( Lets plan safe and comfortable journey )");
		lblLetsPlan.setForeground(Color.WHITE);
		lblLetsPlan.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLetsPlan.setBounds(205, 109, 391, 20);
		gradientPanel.add(lblLetsPlan);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(0, 3));
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(192, 98, 444, 14);
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
		
		
		if((from=="Dadar" && to=="Madgaon") || (from=="CSTM" && to=="Madgaon"))
		{
			trainName1.setText("Jan Shatabdi Express");
			trainName2.setText("Mandovi Express");
			trainName3.setText("Kokan Kanya Express");
			time1.setText("Timing: 05:25-16:20");
			time2.setText("Timing: 07:10-20:10");
			time3.setText("Timing: 23:05-12:10");
			timeTaken1.setText("Travel Time: 10:55");
			timeTaken2.setText("Travel Time: 13:00");
			timeTaken3.setText("Travel Time: 13:05");
			trainno1.setText("12051");
			trainno2.setText("10103");
			trainno3.setText("10111");
			class2A1.setText("35");
			class2A2.setText("17");
			class2A3.setText("65");
			class3A1.setText("35");
			class3A2.setText("35");
			class3A3.setText("35");
			classSL1.setText("35");
			classSL2.setText("35");
			classSL3.setText("35");
			if(from=="Dadar")
			{
				destination1.setText("Dadar");
				destination2.setText("Madgaon");
			}	
			else
			{
				destination1.setText("CSTM");
				destination2.setText("Madgaon");
			}	
			
		}		
		else if((from=="Dadar" && to=="Surat") ||(from=="Dadar" && to=="Ahmedabad")|| (from=="CSTM" && to=="Surat") || (from=="CSTM" && to=="Ahmedabad") || (from=="Borivali" && to=="Surat") || (from=="Borivali" && to=="Ahmedabad"))
		{
			trainName1.setText("Dadar Bhuj Express");
			trainName2.setText("Gujarat Express");
			trainName3.setText("Saurashtra Express");
			time1.setText("Timing: 00:05-07:55");
			time2.setText("Timing: 05:57-14:40");
			time3.setText("Timing: 08:32-19:45");
			timeTaken1.setText("Travel Time: 07:50");
			timeTaken2.setText("Travel Time: 08:43");
			timeTaken3.setText("Travel Time: 11:13");
			trainno1.setText("12959");
			trainno2.setText("22953");
			trainno3.setText("19015");
			class2A1.setText("35");
			class2A2.setText("17");
			class2A3.setText("65");
			class3A1.setText("35");
			class3A2.setText("35");
			class3A3.setText("35");
			classSL1.setText("35");
			classSL2.setText("35");
			classSL3.setText("35");
			if(from=="Dadar" && to=="Surat")
			{
				destination1.setText("Dadar");
				destination2.setText("Surat");
			}	
			else if(from=="Dadar" && to=="Ahmedabad")
			{
				destination1.setText("Dadar");
				destination2.setText("Ahmedabad");
			}	
			else if(from=="CSTM" && to=="Surat")
			{
				destination1.setText("CSTM");
				destination2.setText("Surat");
			}
			else if(from=="CSTM" && to=="Ahmedabad")
			{
				destination1.setText("CSTM");
				destination2.setText("Ahmedabad");
			}	
			else if(from=="Borivali" && to=="Surat") 
			{
				destination1.setText("Borivali");
				destination2.setText("Surat");
			}
			else
			{
				destination1.setText("Borivali");
				destination2.setText("Ahmedabad");
			}	
		}		
	
	}
}
