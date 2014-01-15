
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PROSOPIKO extends JFrame {

	final DefaultListModel<String> model = new DefaultListModel<String>();

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
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 270, 250);
		this.setTitle("ΕΙΣΟΔΟΣ");
		this.setLocationRelativeTo(null);
	
		
		final JLabel search = new JLabel("ΑΝΑΖΗΤΗΣΗ");
		search.setForeground(Color.GREEN);
		search.setBounds(5, 25, 123, 28);
		
		final JLabel noresults = new JLabel("Δε βρέθηκαν αποτελέσματα");
		noresults.setForeground(Color.RED);
		noresults.setBounds(180, 25, 200, 120);
		noresults.setVisible(false);
		
		final JTextField filterTxt = new JTextField();
		filterTxt.setBounds(90, 29, 149, 20);
		
		final JList results = new JList(model);
		results.setBounds(10, 100, 650, 150);
		
		final JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.DARK_GRAY);
		btnSearch.setBounds(260, 28, 89, 23);
		
		
		final JPanel form = new JPanel();
		form.setForeground(Color.GREEN);
		form.setBackground(Color.DARK_GRAY);
		form.setBorder(new EmptyBorder(5, 5, 5, 5));
		form.setLayout(null);
		this.setContentPane(form);

		JLabel user = new JLabel("USERNAME: ");
		user.setForeground(Color.GREEN);
		user.setBounds(5, 25, 123, 28);
		form.add(user);
		
		final JLabel pass = new JLabel("PASS: ");
		pass.setForeground(Color.GREEN);
		pass.setBounds(5, 25, 123, 110);
		form.add(pass);
		
		final JTextField userTxt = new JTextField();
		userTxt.setBounds(90, 29, 149, 20);
		form.add(userTxt);
		
		final JPasswordField passTxt = new JPasswordField();
		passTxt.setBounds(90, 70, 149, 20);
		form.add(passTxt);
		
		JButton login = new JButton("LOGIN");
		login.setForeground(Color.DARK_GRAY);
		login.setBounds(150, 120, 89, 23);
		form.add(login);
		
		final JLabel wronglogin = new JLabel("Username and/or password are incorrect.");
		wronglogin.setForeground(Color.RED);
		wronglogin.setBounds(7, 25, 250, 290);
		form.add(wronglogin);
		wronglogin.setVisible(false);
		
		login.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			wronglogin.setVisible(false);
			MysqlConnect mysql = new MysqlConnect();
			try {
				
				if ( mysql.login(userTxt.getText(), passTxt.getText()) ){
					
					JLabel label = new JLabel("ΑΝΑΖΗΤΗΣΗ");
					label.setForeground(Color.GREEN);
					label.setBounds(5, 25, 123, 28);
					form.removeAll();
					
					form.add(search);
					form.add(noresults);
					form.add(filterTxt);
					form.add(results);
					form.add(btnSearch);
					
					setBounds(100, 100, 700, 400);
					setLocationRelativeTo(null);
					setTitle("ΑΝΑΖΗΤΗΣΗ ΥΠΑΛΛΗΛΩΝ");
					form.validate();
					form.repaint(50L);
					
				} else{ wronglogin.setVisible(true); }
			}
			
			catch (SQLException e1) { e1.printStackTrace(); }
			
		}
		
		});
		
		
		btnSearch.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			  
			String filter = filterTxt.getText();
			
			if ( filter.length() > 0 ){
			
			  noresults.setVisible(false);
			  model.clear();
			  MysqlConnect mysql = new MysqlConnect();
			  try {
				  
				  ArrayList<String> employees = new ArrayList<>();
				  employees = mysql.select(filter);
				  
				  if ( employees.size() == 0 ){ noresults.setVisible(true); }
				  else{
					  for(int i = 0; i < employees.size(); i++){ 
						  model.addElement(employees.get(i));
					  }
				  }
				  
			} catch (SQLException e1) { e1.printStackTrace(); }
			
			}
			  
		  }
		
		});

	}
	
}

class MysqlConnect{
	
   Connection conn = null;
    
	public MysqlConnect() {
	        
	    String url = "jdbc:mysql://localhost:3306/javaemployer?characterEncoding=UTF-8";
	    String dbName = "";
	    String driver = "com.mysql.jdbc.Driver";
	    String userName = "root"; 
	    String password = "";
	
	    try {
	        Class.forName(driver).newInstance();
	        conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);
	    } catch (Exception e) { e.printStackTrace(); }
	    
	}
	
	public boolean login(String user, String pass) throws SQLException{
		
		PreparedStatement stmt = null;
        stmt = (PreparedStatement) conn.prepareStatement("SELECT * FROM users WHERE user=? AND pass=?");
        stmt.setString(1, user);
        stmt.setString(2, pass);
        ResultSet row = stmt.executeQuery(); 
		return row.next();
		
	}

    
	public ArrayList<String> select(String filter) throws SQLException{
	        
	    ArrayList<String> employees = new ArrayList<>();
	    
	    try{
	        PreparedStatement stmt = null;
	        stmt = (PreparedStatement) conn.prepareStatement("SELECT * FROM employees WHERE firstname LIKE ? OR lastname LIKE ?");
	        stmt.setString(1, "%"+filter+"%");
	        stmt.setString(2, "%"+filter+"%");
	        ResultSet row = stmt.executeQuery(); 
	        while(row.next()){
	            String firstname = row.getString("firstname");
	            String lastname = row.getString("lastname");
	            int tid = row.getInt("tid");
	            int salary = row.getInt("salary");
	            int afm = row.getInt("afm");
	            String dep = row.getString("dep");
	            Date hired = row.getDate("hired");
	            employees.add(firstname+" "+lastname+" Α/Τ: "+tid+" ΜΙΣΘΟΣ: "+salary+" ΑΦΜ: "+afm+" ΤΜΗΜΑ: "+dep+" ΠΡΟΣΕΛΗΦΘΗ: "+hired);
	            System.out.println(firstname);
	        }
	    } catch(SQLException e){}
	    
	    return employees;
	}
	
}
