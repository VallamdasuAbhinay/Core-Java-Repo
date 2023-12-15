package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class JDialogExample extends JFrame {

	/**
	 * The JDialog control represents a top level window with a border and a title
	 * and it is used to take some form of input from the user. It inherits the
	 * Dialog class. It doesn't have maximize and minimize buttons.
	 * 
	 * JDialog can accept the following parameters: owner - the Frame from which the
	 * dialog is displayed title - the title of the dialog modal - specifies whether
	 * dialog blocks user input to other top-level windows when shown. If true, the
	 * modality type property is set to DEFAULT_MODALITY_TYPE otherwise the dialog
	 * is modeless (means user can click on the other top-level windows)
	 * 
	 * By default JDialog is modeless
	 */
	private static final long serialVersionUID = 7149552236275059824L;
	JDialog dialog;
	JButton dialogBtn, submitBtn;
	JTextField txtField;
	JLabel nameLabel, statusLabel;

	public JDialogExample() {
		setTitle("JDialog Example");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		dialog = new JDialog(this, "Sample Dialog", false);
		dialog.setBounds(100, 100, 400, 400);
		dialog.setLayout(null);

		dialogBtn = new JButton("Show Dialog");
		dialogBtn.setBounds(100, 100, 130, 30);
		add(dialogBtn);
		dialogBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dialog.setVisible(true);
			}
		});

		nameLabel = new JLabel("Please Enter Your Name");
		nameLabel.setBounds(100, 60, 200, 30);
		dialog.add(nameLabel);

		txtField = new JTextField();
		txtField.setBounds(100, 100, 200, 30);
		dialog.add(txtField);
		txtField.getDocument().addDocumentListener(new DocumentListener() {
			// this will execute on each and every character removal from textfield
			@Override
			public void removeUpdate(DocumentEvent e) {
				statusLabel.setText("Welcome " + txtField.getText());
			}

			// this will execute on each and every character addition to textfield
			@Override
			public void insertUpdate(DocumentEvent e) {
				statusLabel.setText("Welcome " + txtField.getText());
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				System.out.println("changedUpdate");
			}
		});

		statusLabel = new JLabel();
		statusLabel.setBounds(100, 140, 200, 30);
		dialog.add(statusLabel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JDialogExample();
	}

}
