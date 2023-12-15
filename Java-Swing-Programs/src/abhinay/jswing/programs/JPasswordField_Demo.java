package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordField_Demo extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPasswordField passField;
	JButton showPass;

	public JPasswordField_Demo() {
		setTitle("JPasswordField Demo");
		setSize(300, 200);
		setLayout(null);

		// JPasswordField is mainly used for accepting the sensitive data like
		// passwords, card numbers,
		// OTP's, CVV data etc from the user. This basically wont show the original
		// characters
		// and only shows the dots in pace of actual characters
		passField = new JPasswordField();
		passField.setBounds(50, 50, 200, 30);
		add(passField);

		showPass = new JButton("Show Password");
		showPass.setBounds(50, 90, 150, 25);
		add(showPass);
		showPass.addActionListener(this);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JPasswordField_Demo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Encrypted Password details...." + passField.getPassword().toString());
		System.out.println("Plain Password details...." + passField.getText());
	}

}
