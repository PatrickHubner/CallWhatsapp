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

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setLocationRelativeTo(null);
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setForeground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Control t1 = new Control();
				t1.setNumber(textField.getText());
				t1.number();
				//try{
			      //  URI link = new URI(t1.url + "55" + t1.number);
			     //   Desktop.getDesktop().browse(link);
			    //}catch(Exception erro){
			      //      System.out.println(erro);
			        //}
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(70, 127, 294, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("WHATSAPP");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(95, 71, 237, 28);
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
	}
}
