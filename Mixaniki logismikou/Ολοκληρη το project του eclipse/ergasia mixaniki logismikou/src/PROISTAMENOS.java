import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JButton;


public class PROISTAMENOS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROISTAMENOS frame = new PROISTAMENOS();
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
	public PROISTAMENOS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 286);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0394\u0399\u0391\u0393\u03A1\u0391\u03A6\u0397");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(45, 151, 200, 23);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391 \u0391\u039E\u0399\u039F\u039B\u039F\u0393\u0397\u03A3\u0397\u03A3");
		button_1.setBounds(45, 86, 200, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton_1 = new JButton("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391 \u0391\u039E\u0399\u039F\u039B\u039F\u0393\u0397\u03A3\u0397\u03A3");
		btnNewButton_1.setBounds(45, 25, 200, 23);
		contentPane.add(btnNewButton_1);
		
		Choice choice = new Choice();
		choice.setBounds(340, 154, 28, 20);
		contentPane.add(choice);
		
		JButton button = new JButton("\u0391\u03A0\u039F\u03A3\u03A5\u039D\u0394\u0395\u03A3\u0397");
		button.setForeground(Color.RED);
		button.setBounds(278, 214, 108, 23);
		contentPane.add(button);
	}
}
