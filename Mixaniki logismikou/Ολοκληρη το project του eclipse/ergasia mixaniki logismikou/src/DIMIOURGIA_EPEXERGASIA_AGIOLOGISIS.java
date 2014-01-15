import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.JButton;


public class DIMIOURGIA_EPEXERGASIA_AGIOLOGISIS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DIMIOURGIA_EPEXERGASIA_AGIOLOGISIS frame = new DIMIOURGIA_EPEXERGASIA_AGIOLOGISIS();
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
	public DIMIOURGIA_EPEXERGASIA_AGIOLOGISIS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 497);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0395\u03A1\u0393\u0391\u0396\u039F\u039C\u0395\u039D\u039F\u03A3\r\n");
		label.setForeground(Color.GREEN);
		label.setBounds(10, 36, 95, 14);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(182, 33, 37, 20);
		contentPane.add(comboBox);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(25, 146, 25, 23);
		contentPane.add(radioButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(76, 146, 25, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(128, 146, 25, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(184, 146, 25, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setBounds(237, 146, 25, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JLabel label_1 = new JLabel("\u0392\u0391\u0398\u039C\u039F\u039B\u039F\u0393\u0399\u0391");
		label_1.setForeground(Color.GREEN);
		label_1.setBounds(10, 96, 80, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u03A3\u03A7\u039F\u039B\u0399\u0391");
		label_2.setForeground(Color.GREEN);
		label_2.setBounds(10, 202, 64, 14);
		contentPane.add(label_2);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 246, 296, 147);
		contentPane.add(textArea);
		
		JButton button = new JButton("\u039A\u0391\u03A4\u0391\u03A7\u03A9\u03A1\u0397\u03A3\u0397");
		button.setForeground(Color.DARK_GRAY);
		button.setBounds(307, 425, 126, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0391\u03A0\u039F\u03A3\u03A5\u039D\u0394\u0395\u03A3\u0397");
		button_1.setForeground(Color.RED);
		button_1.setBounds(345, 11, 118, 23);
		contentPane.add(button_1);
	}
}
