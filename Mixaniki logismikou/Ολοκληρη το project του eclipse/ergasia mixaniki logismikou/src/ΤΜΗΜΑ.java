import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;


public class тлгла extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					тлгла frame = new тлгла();
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
	public тлгла() {
		setTitle("\u03A4\u039C\u0397\u039C\u0391");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 550);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391");
		label.setForeground(Color.GREEN);
		label.setBounds(60, 53, 93, 23);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("    \u039F\u039D\u039F\u039C\u0391 \u03A4\u039C\u0397\u039C\u0391\u03A4\u039F\u03A3");
		label_1.setForeground(Color.GREEN);
		label_1.setBounds(222, 11, 127, 23);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(411, 12, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Choice choice = new Choice();
		choice.setBounds(474, 53, 37, 23);
		contentPane.add(choice);
		
		TextField textField_1 = new TextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setBounds(411, 54, 57, 20);
		contentPane.add(textField_1);
		
		Label label_2 = new Label("\u0391\u03A1\u0399\u0398\u039C\u039F\u03A3 \u03A5\u03A0\u0391\u039B\u039B\u0397\u039B\u03A9\u039D");
		label_2.setBounds(222, 53, 127, 22);
		contentPane.add(label_2);
		
		Button button = new Button("\u039A\u0391\u03A4\u0391\u03A7\u03A9\u03A1\u0397\u03A3\u0397");
		button.setForeground(Color.DARK_GRAY);
		button.setBounds(426, 96, 85, 22);
		contentPane.add(button);
		
		Label label_3 = new Label("\u0394\u0399\u0391\u0393\u03A1\u0391\u03A6\u0397");
		label_3.setBounds(60, 213, 93, 22);
		contentPane.add(label_3);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(254, 215, 28, 20);
		contentPane.add(choice_1);
		
		Button button_1 = new Button("\u039F\u039A");
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setBounds(474, 213, 37, 22);
		contentPane.add(button_1);
		
		Label label_4 = new Label("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391");
		label_4.setBounds(60, 287, 93, 22);
		contentPane.add(label_4);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(254, 289, 28, 20);
		contentPane.add(choice_2);
		
		Label label_5 = new Label("\u039F\u039D\u039F\u039C\u0391 \u03A4\u039C\u0397\u039C\u0391\u03A4\u039F\u03A3");
		label_5.setBounds(60, 353, 120, 22);
		contentPane.add(label_5);
		
		TextField textField_2 = new TextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setBounds(254, 353, 138, 22);
		contentPane.add(textField_2);
		
		Label label_6 = new Label("\u0391\u03A1\u0399\u0398\u039C\u039F\u03A3 \u03A5\u03A0\u0391\u039B\u039B\u0397\u039B\u03A9\u039D");
		label_6.setBounds(60, 400, 142, 22);
		contentPane.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(254, 400, 85, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(364, 402, 28, 20);
		contentPane.add(choice_3);
		
		Button button_2 = new Button("\u0391\u039B\u039B\u0391\u0393\u0397");
		button_2.setForeground(Color.DARK_GRAY);
		button_2.setBounds(391, 440, 70, 22);
		contentPane.add(button_2);
		
		Label label_7 = new Label("_____________________________________________________________________________________________________________________________");
		label_7.setBounds(0, 154, 702, 22);
		contentPane.add(label_7);
		
		Label label_8 = new Label("____________________________________________________________________________________________________________________________________________________________________________________________");
		label_8.setBounds(0, 256, 702, 22);
		contentPane.add(label_8);
		
		JButton button_3 = new JButton("\u0391\u03A0\u039F\u03A3\u03A5\u039D\u0394\u0395\u03A3\u0397");
		button_3.setForeground(Color.RED);
		button_3.setBounds(574, 478, 118, 23);
		contentPane.add(button_3);
	}
}
