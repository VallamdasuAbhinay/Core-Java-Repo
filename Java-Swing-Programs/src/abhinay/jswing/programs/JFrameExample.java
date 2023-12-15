package abhinay.jswing.programs;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameExample extends JFrame {

	/**
	 * The javax.swing.JFrame class is a type of container which inherits the
	 * java.awt.Frame class. JFrame works like the main window where components like
	 * labels, buttons, textfields are added to create a GUI. Unlike Frame, JFrame
	 * has the option to hide or close the window with the help of
	 * setDefaultCloseOperation(int) method.
	 */
	private static final long serialVersionUID = 5017954981399821438L;
	JTextField username;
	JButton submitBtn;
	JLabel uLabel;

	public JFrameExample() {
		setTitle("JFrame Example");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		uLabel = new JLabel("Enter Your Username");
		uLabel.setSize(200, 30);
		username = new JTextField(30);
		username.setSize(150, 30);
		submitBtn = new JButton("Submit");
		submitBtn.setSize(150, 30);
		submitBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(panel, "Welcome " + username.getText());
			}
		});
		panel.add(uLabel);
		panel.add(username);
		panel.add(submitBtn);

		add(panel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameExample();
	}

}
