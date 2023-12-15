package abhinay.jswing.programs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPane_Example extends JFrame implements ActionListener {

	private static final long serialVersionUID = -6060044451449328891L;
	// The JOptionPane class is used to provide standard dialog boxes such as
	// message dialog box,
	// confirm dialog box and input dialog boxActionListener. These dialog boxes are
	// used to display information
	// or get input from the user. The JOptionPane class inherits JComponent class.
	JButton msgBtn, confirmBtn, inputBtn;
	JLabel confirmStatusLabel, inputStatusLabel;

	public JOptionPane_Example() {
		setTitle("JOptionPane Example Application");
		setLayout(null);
		// close button of the Application will not work, as we set the below value for
		// the default close operation
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		msgBtn = new JButton("Message Dialog Button");
		msgBtn.setBounds(50, 60, 200, 30);
		add(msgBtn);
		msgBtn.addActionListener(this);

		confirmBtn = new JButton("Confirm Button");
		confirmBtn.setBounds(50, 120, 200, 30);
		add(confirmBtn);
		confirmBtn.addActionListener(this);

		confirmStatusLabel = new JLabel();
		confirmStatusLabel.setBounds(260, 120, 200, 30);
		add(confirmStatusLabel);

		inputBtn = new JButton("Input Button");
		inputBtn.setBounds(50, 180, 200, 30);
		add(inputBtn);
		inputBtn.addActionListener(this);

		inputStatusLabel = new JLabel();
		inputStatusLabel.setBounds(260, 180, 200, 30);
		add(inputStatusLabel);

		setSize(600, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JOptionPane_Example();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String[] options = { "Yes! Please.", "No! Not now." };
		int result = JOptionPane.showOptionDialog(this, "Sure? You want to exit?",
				"regular" + "<font style='background-color:#336699; color:#fff;'>special</font>" + "regular again",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, // no custom icon
				options, // button titles
				options[0] // default button
		);

		if (e.getActionCommand().contentEquals("Message Dialog Button")) {
			// this message dialog will only give one button to the user - ok button
			JOptionPane.showMessageDialog(this, "Normal Message Dialog");
			// below message dialog we are specifying the title (3rd parameter) & message
			// type as INFORMATION_MESSAGE in 4th parameter
			JOptionPane.showMessageDialog(this, "Information Message Dialog", "Info", JOptionPane.INFORMATION_MESSAGE);
			// below message dialog we are specifying the title (3rd parameter) & message
			// type as ERROR_MESSAGE in 4th parameter
			JOptionPane.showMessageDialog(this, "Error Message Dialog", "Error", JOptionPane.ERROR_MESSAGE);
			// below message dialog we are specifying the title (3rd parameter) & message
			// type as WARNING_MESSAGE in 4th parameter
			JOptionPane.showMessageDialog(this, "Warning Message Dialog", "Warning", JOptionPane.WARNING_MESSAGE);
			// below message dialog we are specifying the title (3rd parameter) & message
			// type as QUESTION_MESSAGE in 4th parameter
			JOptionPane.showMessageDialog(this, "Question Message Dialog", "Question", JOptionPane.QUESTION_MESSAGE);
		}
		if (e.getActionCommand().contentEquals("Confirm Button")) {
			// this confirm dialog will give the 3 buttons to the use
			// Yes
			// No
			// Cancel
			// And to check which button, the user has clicked on the confirm dialog
			// this method will return an int value as follows
			// 0 = means user clicked Yes button
			// 1 = means user clicked No button
			// 2 = means user clicked Cancel button
			UIManager.put("OptionPane.confirmDialog.titlePane.foreground", Color.black);
			UIManager.put("OptionPane.confirmDialog.titlePane.background", Color.GREEN);
			JOptionPane.showConfirmDialog(this, "Show Confirm Dialog", "sample title", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			UIManager.put("OptionPane.minimumSize", new Dimension(350, 200));
			UIManager.put("OptionPane.background", Color.gray);
			UIManager.put("Panel.background", Color.lightGray);
			UIManager.put("OptionPane.messageDialog.titlePane.foreground", Color.lightGray);
			UIManager.put("OptionPane.messageDialog.titlePane.background", Color.black);
			UIManager.put("OptionPane.messageDialog.border.background", Color.white);

			JOptionPane.showMessageDialog(null, "A basic JOptionPane message dialog", "myBox", 0);

			int selectedOption = JOptionPane.showConfirmDialog(this, "Show Confirm Dialog", "sample title",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			System.out.println(selectedOption);
			if (selectedOption == 0) {
				confirmStatusLabel.setText("You have selected option Yes");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// Now the close button of the Application will work as expected
			} else if (selectedOption == 1) {
				confirmStatusLabel.setText("You have selected option No");
			} else if (selectedOption == 2) {
				confirmStatusLabel.setText("You have selected option Cancel");
			}
		}
		if (e.getActionCommand().contentEquals("Input Button")) {
			// Input dialog is basically used to accept some value from the user and we can
			// get the user input value to display on screen
			// like Welcome screen messages etc.
			String inputText = JOptionPane.showInputDialog(this, "Please Enter Your Name");
			inputStatusLabel.setText("Welcome " + inputText);
		}
	}

}
