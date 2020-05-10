package com.corejava.management;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import keeptoo.KGradientPanel;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class Splash extends JFrame {

	private static Container panel;
	private JPanel contentPane;
	public JLabel txt_num_loading;
	public JProgressBar load;
	int i;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Splash splash = new Splash();
		splash.setVisible(true);
		//login login=new login();
				try {
					
					
						for(int i=1;i<=100;i++)
						{
							Thread.sleep(80);
							splash.txt_num_loading.setText(Integer.toString(i)+"%");
							splash.load.setValue(i);
							if(i==100) {
								splash.setVisible(false);
								login frame = new login();
								frame.setVisible(true);
							}
						}
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	

	/**
	 * Create the frame.
	 */
	public Splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 439);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel=new KGradientPanel();
		gradientPanel.setkGradientFocus(50);
		gradientPanel.setkEndColor(new Color(0, 191, 255));
		gradientPanel.setkStartColor(new Color(0, 51, 255));
		gradientPanel.setBounds(0, 0, 687, 439);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Loading.........");
		lblNewLabel_3.setBounds(27, 382, 177, 32);
		gradientPanel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		
		txt_num_loading = new JLabel("99%");
		txt_num_loading.setBounds(146, 382, 81, 32);
		gradientPanel.add(txt_num_loading);
		txt_num_loading.setForeground(Color.WHITE);
		txt_num_loading.setFont(new Font("Times New Roman", Font.BOLD, 19));
		
		 load = new JProgressBar();
		 load.setBounds(0, 425, 687, 14);
		 gradientPanel.add(load);
		 load.setForeground(new Color(102, 204, 51));
		 
		 load.setValue(0);
		 load.setBackground(new Color(240, 240, 240));
		 load.setAutoscrolls(true);
		 
		 JSeparator separator = new JSeparator();
		 separator.setPreferredSize(new Dimension(0, 3));
		 separator.setForeground(SystemColor.textHighlight);
		 separator.setBounds(115, 224, 468, 14);
		 gradientPanel.add(separator);
		 
		 JLabel label_1 = new JLabel("Railway Management System");
		 label_1.setHorizontalAlignment(SwingConstants.CENTER);
		 label_1.setForeground(Color.WHITE);
		 label_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		 label_1.setBounds(85, 171, 527, 67);
		 gradientPanel.add(label_1);
		 
		 JLabel label_2 = new JLabel("( Lets plan safe and comfortable journey )");
		 label_2.setForeground(Color.WHITE);
		 label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		 label_2.setBounds(146, 235, 391, 20);
		 gradientPanel.add(label_2);
		 
		 JLabel label = new JLabel("");
		 label.setIcon(new ImageIcon("IMAGES\\Subway_100px.png"));
		 label.setBounds(296, 66, 105, 116);
		 gradientPanel.add(label);
		 
		 
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(0, 0, 687, 439);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
	}
}
