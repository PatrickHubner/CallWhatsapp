import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class ScreenTwo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField number1;
	private JTextField msg;


	
	public ScreenTwo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite aqui sua mensagem");
		lblNewLabel.setBounds(0, 10, 426, 63);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		
		msg = new JTextField();
		
		
		msg.setBounds(107, 60, 212, 32);
		contentPane.add(msg);
		msg.setColumns(10);
		
		JLabel lblDigiteAquiO = new JLabel("Digite aqui o numero desejado");
		lblDigiteAquiO.setBounds(5, 131, 426, 63);
		lblDigiteAquiO.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteAquiO.setForeground(Color.WHITE);
		lblDigiteAquiO.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		contentPane.add(lblDigiteAquiO);
		
		number1 = new JTextField();
		number1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Control t1 = new Control();	
				t1.setNumber(number1.getText());
				t1.setText(msg.getText());
				t1.programmedNumber();
				
			}
		});
		number1.setBounds(107, 185, 212, 32);
		contentPane.add(number1);
		number1.setColumns(10);

	}
}
