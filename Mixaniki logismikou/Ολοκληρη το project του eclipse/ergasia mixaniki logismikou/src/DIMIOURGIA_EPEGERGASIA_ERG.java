import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;


public class DIMIOURGIA_EPEGERGASIA_ERG extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DIMIOURGIA_EPEGERGASIA_ERG frame = new DIMIOURGIA_EPEGERGASIA_ERG();
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
	public DIMIOURGIA_EPEGERGASIA_ERG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 440);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KATAX\u03A9\u03A1\u0397\u03A3\u0397/\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391 \u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u03A9\u039D \u03A5\u03A0\u0391\u039B\u039B\u0397\u039B\u039F\u03A5");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(87, 12, 305, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u039F\u039D\u039F\u039C\u0391");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(27, 76, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0395\u03A0\u03A9\u039D\u03A5\u039C\u039F");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(28, 116, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0391\u03A1/\u03A4\u0391\u03A5\u03A4\u039F\u03A4\u0397\u03A4\u0391\u03A3");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(27, 160, 82, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u039C\u0399\u03A3\u0398\u039F\u03A3\r\n");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(27, 193, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u0391.\u03A6.\u039C");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(26, 231, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u03A4\u039C\u0397\u039C\u0391");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(25, 266, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u0397\u039C\u0395\u03A1/\u039D\u0399\u0391 \r\n\u03A0\u03A1\u039F\u03A3\u039B\u0397\u03A8\u0397\u03A3");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(24, 300, 126, 14);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(219, 73, 98, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(219, 113, 98, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(219, 157, 98, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(219, 190, 98, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(219, 228, 98, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(219, 263, 98, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(219, 297, 98, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("\u039A\u0391\u03A4\u0391\u03A7\u03A9\u03A1\u0397\u03A3\u0397/\u0391\u039B\u039B\u0391\u0393\u0397");
		btnNewButton.setBounds(359, 346, 151, 29);
		contentPane.add(btnNewButton);
	}

}
