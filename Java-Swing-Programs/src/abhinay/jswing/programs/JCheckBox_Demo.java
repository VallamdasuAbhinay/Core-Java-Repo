package abhinay.jswing.programs;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBox_Demo extends JFrame {

	private static final long serialVersionUID = 4473472019226949356L;
	JCheckBox chkBox1, chkBox2;
	JLabel statusLabel, statusLabel2;

	public JCheckBox_Demo() {
		setTitle("JCheckBox Demo");
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JCheckBox basically used for selecting the items on the forms like languages
		// known etc.
		// it accepts below parameters:
		// text - which represents the text associated with this checkbox. This is also
		// optional
		// status - accepts boolean value which represents whether this checkbox
		// has to be default selected or not. This is optional parameter and by default
		// this value is false
		chkBox1 = new JCheckBox("Java Programming");
		chkBox1.setBounds(50, 50, 150, 30);
		add(chkBox1);
		chkBox1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText(
						"Java Programming Checkbox is " + (e.getStateChange() == 1 ? "selected" : "unselected"));
			}
		});
		// Here, we are selecting or deselecting the JCheckbox items, we need to
		// implement an
		// interface called ItemListener
		// and we should these checkbox objects to the addItemListener() method
		// itemStateChanged() this method will be invoked every time a checkbox is
		// selected or not
		// above method takes ItemEvent as an argument, from that argument we can check
		// the checkbox
		// selection status by using method called getStateChanged()
		// 1 = selected
		// 2 = unselected
		chkBox2 = new JCheckBox("Python Programming");
		chkBox2.setBounds(50, 90, 150, 30);
		add(chkBox2);
		chkBox2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				statusLabel2.setText(
						"Python Programming Checkbox is " + (e.getStateChange() == 1 ? "selected" : "unselected"));
			}
		});

		statusLabel = new JLabel();
		statusLabel.setBounds(50, 165, 300, 90);
		statusLabel.setAutoscrolls(true);
		add(statusLabel);

		statusLabel2 = new JLabel();
		statusLabel2.setBounds(50, 205, 300, 90);
		statusLabel2.setAutoscrolls(true);
		add(statusLabel2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JCheckBox_Demo();
	}
}
