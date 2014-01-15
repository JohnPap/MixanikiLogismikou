import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class HR extends JFrame {

	private JPanel тлгла;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HR frame = new HR();
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
	public HR() {
		setTitle("\u0397R");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 328);
		тлгла = new JPanel();
		тлгла.setForeground(Color.BLACK);
		тлгла.setBackground(Color.DARK_GRAY);
		тлгла.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(тлгла);
		тлгла.setLayout(null);
		
		JButton btnNewButton = new JButton("TMHMA");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(35, 26, 135, 78);
		тлгла.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u03A0\u03A1\u039F\u03A3\u03A9\u03A0\u0399\u039A\u039F");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(204, 26, 125, 78);
		тлгла.add(btnNewButton_1);
		
		JButton button = new JButton("\u0391\u03A0\u039F\u03A3\u03A5\u039D\u0394\u0395\u03A3\u0397");
		button.setForeground(Color.RED);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(128, 166, 109, 23);
		тлгла.add(button);
	}
}
