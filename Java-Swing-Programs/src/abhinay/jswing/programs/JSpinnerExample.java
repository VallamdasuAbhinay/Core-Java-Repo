package abhinay.jswing.programs;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerExample extends JFrame {

	/**
	 * The object of JSpinner class is a single line input field that allows the
	 * user to select a number or an object value from an ordered sequence.
	 * 
	 * SpinnerModel - model for a potentially unbounded sequence of object values
	 * SpinnerNumberModel - which can accept the following parameters value - the
	 * current (initial)value of the model minimum - the first number in the
	 * sequence maximum - the last number in the sequence stepSize - the difference
	 * between elements of the sequence on click of increments/decrements
	 * 
	 * Above model object has to be passed in the constructor parameter of JSpinner
	 * to represent data
	 */
	private static final long serialVersionUID = 8281702417038111716L;
	JLabel statusLabel;
	Date dateObj;

	public JSpinnerExample() {

		setTitle("JSpinner Example");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		JLabel titleLabel = new JLabel("Spinner Number Model");
		titleLabel.setBounds(50, 50, 200, 30);
		add(titleLabel);

		SpinnerModel spinnerModel = new SpinnerNumberModel(10, 0, 100, 10);
		JSpinner spinner = new JSpinner(spinnerModel);
		spinner.setBounds(50, 90, 50, 30);
		add(spinner);
		spinner.addChangeListener(new ChangeListener() {
			// below method will execute, each and every time, whenever, there is a change
			// in the
			// value of the JSpinner (either increase or decrease)
			@Override
			public void stateChanged(ChangeEvent e) {
				statusLabel.setText("Selected Value: " + ((JSpinner) e.getSource()).getValue());
			}
		});

		statusLabel = new JLabel();
		statusLabel.setBounds(50, 130, 200, 30);
		add(statusLabel);

		setVisible(true);

	}

	public static void main(String[] args) {
		new JSpinnerExample();
	}

}
