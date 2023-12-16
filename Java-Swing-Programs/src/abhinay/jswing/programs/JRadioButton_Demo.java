package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class JRadioButton_Demo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 9141799500538510035L;

	// JRadioButton are mainly used to make only one selection out of the many
	// possible options
	// example selecting gender, selecting the correct option in quiz etc.
	// all these JRadioButton's objects have to be added to a ButtonGroup. So that,
	// this
	// enables the user to select only one option from the group of options.
	JRadioButton maleRadioBtn, femaleRadioBtn;
	JButton submitBtn;
	JLabel statusLabel;

	public JRadioButton_Demo() {
		setTitle("JRadioButton Demo Application");
		setSize(400, 400);
		setLayout(null);

		maleRadioBtn = new JRadioButton("Male");
		maleRadioBtn.setBounds(50, 50, 100, 30);
		add(maleRadioBtn);

		femaleRadioBtn = new JRadioButton("Female");
		femaleRadioBtn.setBounds(50, 100, 100, 30);
		add(femaleRadioBtn);

		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(maleRadioBtn);
		btnGroup.add(femaleRadioBtn);

		submitBtn = new JButton("Select Gender");
		submitBtn.setBounds(50, 150, 150, 30);
		add(submitBtn);
		submitBtn.addActionListener(this);

		statusLabel = new JLabel("");
		statusLabel.setBounds(50, 200, 300, 30);
		add(statusLabel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JRadioButton_Demo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (maleRadioBtn.isSelected()) {
			statusLabel.setText("Your Selected Gender is Male");
		} else if (femaleRadioBtn.isSelected()) {
			statusLabel.setText("Your Selected Gender is Female");
		} else {
			statusLabel.setText("Please Select Your Gender");
		}
	}

}
