package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Desktop;

import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ScreenOne extends JFrame {

	private JPanel contentPane;
	private JTextField txtDigiteONmero;

	public ScreenOne() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setForeground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDigiteONmero = new JTextField();
		txtDigiteONmero.setToolTipText("");
		txtDigiteONmero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Control t1 = new Control();
				t1.setNumber(txtDigiteONmero.getText());
				t1.number();
			}
		});
		txtDigiteONmero.setHorizontalAlignment(SwingConstants.CENTER);
		txtDigiteONmero.setBounds(70, 127, 294, 20);
		contentPane.add(txtDigiteONmero);
		txtDigiteONmero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("WHATSAPP");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(92, 37, 237, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Mensagem programada");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScreenTwo frame = new ScreenTwo(); 
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton.setBounds(10, 225, 193, 28);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Formato aceito: 99 999999999");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(144, 147, 163, 20);
		contentPane.add(lblNewLabel_1);
	}
}
