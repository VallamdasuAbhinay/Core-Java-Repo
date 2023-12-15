package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JCheckBox_BookOrderingApp extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = -3864059225497246812L;
	JLabel mainLabel;
	JCheckBox book1, book2, book3, book4;
	JButton submitBtn;
	public JCheckBox_BookOrderingApp() {
		setTitle("Book Ordering Application");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		mainLabel = new JLabel("Book Ordering Application");
		mainLabel.setBounds(50, 50, 200, 30);
		add(mainLabel);

		book1 = new JCheckBox("Physics Book @100/-");
		book1.setBounds(50, 100, 200, 30);
		add(book1);
		
		book2 = new JCheckBox("Chemistry Book @120/-");
		book2.setBounds(50, 150, 200, 30);
		add(book2);
		
		book3 = new JCheckBox("Mathematics Book @200/-");
		book3.setBounds(50, 200, 200, 30);
		add(book3);
		
		book4 = new JCheckBox("Applied Physics Book @300/-");
		book4.setBounds(50, 250, 200, 30);
		add(book4);
		
		submitBtn = new JButton("Order Books");
		submitBtn.setBounds(50, 300, 150, 30);
		add(submitBtn);
		submitBtn.addActionListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JCheckBox_BookOrderingApp();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		double totalAmount = 0d;
		String finalMessage = "";
		if(arg0.getActionCommand().contentEquals("Order Books")) {
			if(book1.isSelected()) {
				finalMessage += book1.getText()+"\n";
				totalAmount += 100;
			}
			if(book2.isSelected()) {
				finalMessage += book2.getText()+"\n";
				totalAmount += 120;
			}
			if(book3.isSelected()) {
				finalMessage += book3.getText()+"\n";
				totalAmount += 200;
			}
			if(book4.isSelected()) {
				finalMessage += book4.getText()+"\n";
				totalAmount += 300;
			}
		}
		JOptionPane.showMessageDialog(this, finalMessage+"\nTotal Amount: "+totalAmount);
		//JOptionPane mainly used to show the standard dialog boxes to the user and these
		//pop ups may ask for the user to input some value or they just show some details to user
	}

}

