package abhinay.jswing.programs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JProgressBarExample extends JFrame implements ChangeListener {

	/**
	 * The JProgressBar class is used to display the progress of the task. It
	 * inherits JComponent class. We can specify the following parameters (optional)
	 * to the JProgressBar 1) orient - the desired orientation of JProgressBar (By
	 * default, its orientation is Horizontal) We can specify the orientation value
	 * using following SwingConstants: SwingConstants.HORIZONTAL
	 * SwingConstants.VERTICAL 2) min - the minimum value of JProgressBar 3) max -
	 * the maximum value of JProgressBar
	 */
	private static final long serialVersionUID = -5616206194318745994L;
	JProgressBar horizontalProgressBar, verticalProgressBar;
	int progressBarStatus = 0;
	JLabel horizontalProgressBarLabel, verticalProgressBarLabel;
	JLabel horizontalProgressBarCurrentStatusLabel, verticalProgressBarCurrentStatusLabel;

	public JProgressBarExample() {
		setTitle("JProgressBar Example");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		horizontalProgressBarLabel = new JLabel("Horizontal JProgressBar");
		horizontalProgressBarLabel.setBounds(100, 60, 200, 30);
		add(horizontalProgressBarLabel);

		horizontalProgressBar = new JProgressBar(0, 100);
		horizontalProgressBar.setBounds(100, 100, 200, 30);
		// we have to set the below property of setStringPainted() to true, so that, we
		// can see
		// the progress % in the middle of that JProgressBar
		// by default, this property value is set to false.
		horizontalProgressBar.setStringPainted(true);
		// default progress value is being set to 0
		horizontalProgressBar.setValue(0);
		horizontalProgressBar.addChangeListener(this);
		add(horizontalProgressBar);

		JSeparator horizontalSeparator = new JSeparator();
		horizontalSeparator.setBounds(100, 160, 200, 30);
		add(horizontalSeparator);

		verticalProgressBarLabel = new JLabel("Vertical JProgressBar");
		verticalProgressBarLabel.setBounds(100, 180, 200, 30);
		add(verticalProgressBarLabel);

		verticalProgressBar = new JProgressBar(SwingConstants.VERTICAL, 0, 150);
		verticalProgressBar.setBounds(270, 180, 30, 200);
		// we have to set the below property of setStringPainted() to true, so that, we
		// can see
		// the progress % in the middle of that JProgressBar
		// by default, this property value is set to false.
		verticalProgressBar.setStringPainted(true);
		// default progress value is being set to 0
		verticalProgressBar.setValue(0);
		verticalProgressBar.addChangeListener(this);
		add(verticalProgressBar);

		horizontalProgressBarCurrentStatusLabel = new JLabel();
		horizontalProgressBarCurrentStatusLabel.setBounds(100, 390, 400, 30);
		add(horizontalProgressBarCurrentStatusLabel);

		verticalProgressBarCurrentStatusLabel = new JLabel();
		verticalProgressBarCurrentStatusLabel.setBounds(100, 440, 400, 30);
		add(verticalProgressBarCurrentStatusLabel);

		setVisible(true);

	}

	public void progressIncrement() {
		while (progressBarStatus <= 150) {
			horizontalProgressBar.setValue(progressBarStatus);
			verticalProgressBar.setValue(progressBarStatus);
			progressBarStatus += 10;
			try {
				Thread.sleep(200);
				// here, we are using sleep(200), so that user can see the %progress increase
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		JProgressBarExample obj = new JProgressBarExample();
		obj.progressIncrement();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource().toString().contains("HORIZONTAL")) {
			horizontalProgressBarCurrentStatusLabel
					.setText("Horizontal JProgressBar Current Progress :: " + horizontalProgressBar.getValue());
		}
		if (e.getSource().toString().contains("VERTICAL")) {
			verticalProgressBarCurrentStatusLabel
					.setText("Vertical JProgressBar Current Progress :: " + verticalProgressBar.getValue());
		}

	}

}
