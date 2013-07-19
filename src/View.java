import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;


public class View extends JFrame {
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtNumber;
	private JButton btnGo;
	private JTable table;
	public View() {
		getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(10, 37, 126, 30);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(146, 37, 126, 30);
		getContentPane().add(txtEmail);
		
		txtNumber = new JTextField();
		txtNumber.setColumns(10);
		txtNumber.setBounds(282, 37, 126, 30);
		getContentPane().add(txtNumber);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 105, 414, 145);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBounds(22, 240, 373, 145);
		scrollPane.setViewportView(table);
		
		btnGo = new JButton("Go!");
		btnGo.setBounds(321, 71, 89, 23);
		getContentPane().add(btnGo);
	}
	public JTextField getTxtName() {
		return txtName;
	}
	public JTextField getTxtEmail() {
		return txtEmail;
	}
	public JTextField getTxtNumber() {
		return txtNumber;
	}
	public JButton getBtnAdd() {
		return btnGo;
	}
	public JTable getTable() {
		return table;
	}
}
