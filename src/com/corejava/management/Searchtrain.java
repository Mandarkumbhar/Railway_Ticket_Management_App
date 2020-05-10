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
import java.util.Calendar;
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

public class Searchtrain extends JFrame {

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
					Searchtrain frame = new Searchtrain();
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
	public Searchtrain() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 541);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 153, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(764, 0, 46, 30);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 102, 255)));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(157, 176, 500, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSource = new JLabel("Source ");
		lblSource.setForeground(new Color(0, 153, 255));
		lblSource.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSource.setBounds(95, 75, 67, 37);
		panel.add(lblSource);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setForeground(new Color(0, 153, 255));
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDestination.setBounds(99, 143, 109, 37);
		panel.add(lblDestination);
		
		JLabel label_4 = new JLabel("Journey Date");
		label_4.setForeground(new Color(0, 153, 255));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(97, 212, 141, 37);
		panel.add(label_4);
		
		final JDateChooser dateChooser = new JDateChooser();
		
		dateChooser.setFont(new Font("Tahoma", Font.BOLD, 16));
		dateChooser.setBounds(229, 212, 186, 37);
		panel.add(dateChooser);
		dateChooser.getJCalendar().setMinSelectableDate(new Date());
		Calendar max = Calendar.getInstance();
		max.add(Calendar.MONTH, 4);
		dateChooser.getJCalendar().setMaxSelectableDate(max.getTime());
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"From", "Dadar", "CSTM", "Borivali"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(229, 82, 186, 26);
		panel.add(comboBox);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"To", "Madgaon", "Surat", "Ahmedabad"}));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(229, 150, 186, 26);
		panel.add(comboBox_1);
		
		JButton btnSearchTrain = new JButton("SEARCH TRAINS");
		btnSearchTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String from= (String) comboBox.getSelectedItem();
				String to= (String) comboBox_1.getSelectedItem();
				Date date= dateChooser.getDate();
				if(from.equals("From")  )// validation for From
				{
					JOptionPane.showMessageDialog(null,"Select Source");
					
				}
				else if( to.equals("To") )// validation for From
				{
					JOptionPane.showMessageDialog(null,"Select Destination");
					
				}
				else if(date==null)
				{
					JOptionPane.showMessageDialog(null,"Select Date of journey");
				}
				else if(from.equals("Borivali") && to.equals("Madgaon") )// validation for From
				{
					JOptionPane.showMessageDialog(null,"Sorry there is no direct train available");
					
				}
				else
				{
					
					 new Displaytrains(date,from,to).setVisible(true);
					
					dispose();
				}
				
			}
		});
		btnSearchTrain.setRolloverEnabled(false);
		btnSearchTrain.setRequestFocusEnabled(false);
		btnSearchTrain.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSearchTrain.setForeground(Color.WHITE);
		btnSearchTrain.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSearchTrain.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnSearchTrain.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		btnSearchTrain.setBackground(new Color(102, 204, 255));
		btnSearchTrain.setBounds(95, 278, 320, 30);
		panel.add(btnSearchTrain);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("IMAGES\\Sorting Arrows_35px.png"));
		lblNewLabel_1.setBounds(179, 111, 52, 43);
		panel.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(0, 3));
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(218, 131, 215, 10);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setPreferredSize(new Dimension(0, 3));
		separator_2.setForeground(SystemColor.textHighlight);
		separator_2.setBounds(95, 132, 84, 10);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setPreferredSize(new Dimension(0, 3));
		separator_3.setForeground(SystemColor.textHighlight);
		separator_3.setBounds(95, 191, 338, 10);
		panel.add(separator_3);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("IMAGES\\Search_50px_2.png"));
		label_5.setBounds(158, 11, 50, 50);
		panel.add(label_5);
		
		JLabel lblSearchTrains = new JLabel("SEARCH TRAINS");
		lblSearchTrains.setForeground(new Color(0, 153, 255));
		lblSearchTrains.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSearchTrains.setBounds(217, 11, 153, 50);
		panel.add(lblSearchTrains);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setPreferredSize(new Dimension(0, 3));
		separator_4.setForeground(SystemColor.textHighlight);
		separator_4.setBounds(218, 50, 152, 10);
		panel.add(separator_4);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				operation frame = new operation();
				frame.setVisible(true);
				dispose();
				
				
			}
		});
		label_6.setIcon(new ImageIcon("IMAGES\\Dog House_48px.png"));
		label_6.setBounds(22, 11, 50, 50);
		panel.add(label_6);
		
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
				Searchtrain.this.setLocation(x-xx,y-xy);
			}
		});
		
		gradientPanel.setkGradientFocus(50);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.setBounds(0, 0, 810, 319);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel label_1 = new JLabel("Railway Management System");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_1.setBounds(228, 44, 454, 67);
		gradientPanel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("IMAGES\\Subway_100px.png"));
		label_2.setBounds(127, 31, 105, 116);
		gradientPanel.add(label_2);
		
		JLabel lblLetsPlan = new JLabel("( Lets plan safe and comfortable journey )");
		lblLetsPlan.setForeground(Color.WHITE);
		lblLetsPlan.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLetsPlan.setBounds(251, 111, 391, 20);
		gradientPanel.add(lblLetsPlan);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(0, 3));
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(238, 100, 444, 14);
		gradientPanel.add(separator);
	
	}
}
