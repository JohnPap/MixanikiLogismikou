import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import java.awt.Label;
import java.awt.Button;


public class PROSOPIKO extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROSOPIKO frame = new PROSOPIKO();
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
	public PROSOPIKO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 465);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397");
		label.setForeground(Color.GREEN);
		label.setBounds(37, 25, 123, 28);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(227, 29, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.DARK_GRAY);
		btnSearch.setBounds(435, 28, 89, 23);
		contentPane.add(btnSearch);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(561, 27, 188, 141);
		contentPane.add(editorPane);
		
		Button button = new Button("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391");
		button.setForeground(Color.DARK_GRAY);
		button.setBounds(37, 260, 102, 39);
		contentPane.add(button);
		
		Button button_1 = new Button("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391");
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setBounds(37, 175, 102, 39);
		contentPane.add(button_1);
		
		Button button_2 = new Button("\u0394\u0399\u0391\u0393\u03A1\u0391\u03A6\u0397\r\n");
		button_2.setForeground(Color.DARK_GRAY);
		button_2.setBounds(37, 98, 102, 39);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u0391\u03A0\u039F\u03A3\u03A5\u039D\u0394\u0395\u03A3\u0397");
		button_3.setForeground(Color.RED);
		button_3.setBounds(631, 382, 118, 23);
		contentPane.add(button_3);
	}
}
