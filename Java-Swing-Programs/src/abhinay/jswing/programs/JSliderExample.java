package abhinay.jswing.programs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderExample extends JFrame {

	/**
	 * The JSlider class is used to create the slider. By using JSlider, a user can
	 * select a value from a specific range.
	 * 
	 * JSlider can accept the following 4 optional parameters: orientation - to
	 * specify whether we need horizontal or vertical slider. Horizontal is the
	 * default, if we do not specify any explicit orientation min - minimum value
	 * for this JSlider max - maximum value for this JSlider value - the current
	 * value of the JSlider
	 */
	private static final long serialVersionUID = -6297997257381067089L;
	JLabel mainLabel, sliderChangedValue, verticalSliderLabel, verticalChangedValue;
	JSlider horizontalJSlider, verticalJSlider;
	int sliderValue = 10;

	public JSliderExample() {
		setTitle("JSlider Example");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		mainLabel = new JLabel("Horizontal JSlider");
		mainLabel.setBounds(50, 60, 200, 30);
		add(mainLabel);

		horizontalJSlider = new JSlider(JSlider.HORIZONTAL, 0, 500, 10);
		horizontalJSlider.setBounds(50, 100, 200, 100);
		/*
		 * setMinorTickSpacing(intValue) - specifies the number of gaps/spaces between
		 * ticks setMajorTickSpacing(intValue) - specifies the number of gaps/spaces
		 * between ticks
		 * 
		 * setPaintLabels(true) - this will add the labels like numbers to this JSlider.
		 * this depends on the value specified in the setMajorTickSpacing() method All
		 * labels will be shown at the major ticks position this is by default disabled
		 * 
		 * setPaintTicks(true) - this will draw the lines showing the indication of
		 * JSlider value this will show both minor & major ticks this is by default
		 * disabled
		 */
		horizontalJSlider.setMinorTickSpacing(50);
		horizontalJSlider.setMajorTickSpacing(100);
		horizontalJSlider.setPaintLabels(true);
		horizontalJSlider.setPaintTicks(true);
		add(horizontalJSlider);
		horizontalJSlider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				sliderChangedValue.setText("Horizontal Slider Value: " + horizontalJSlider.getValue());
			}
		});

		sliderChangedValue = new JLabel();
		sliderChangedValue.setBounds(50, 30, 200, 30);
		add(sliderChangedValue);
		
		JSeparator horizontalSeparator = new JSeparator(SwingConstants.HORIZONTAL);
		horizontalSeparator.setBounds(10, 200, 300, 1);
		add(horizontalSeparator);
		
		verticalSliderLabel = new JLabel("Vertical JSlider");
		verticalSliderLabel.setBounds(50, 240, 120, 30);
		add(verticalSliderLabel);
		
		verticalChangedValue = new JLabel();
		verticalChangedValue.setBounds(50, 205, 200, 30);
		add(verticalChangedValue);
		
		verticalJSlider = new JSlider(JSlider.VERTICAL, 0, 600, 10);
		verticalJSlider.setBounds(150, 260, 200, 200);
		verticalJSlider.setMinorTickSpacing(50);
		verticalJSlider.setMajorTickSpacing(100);
		verticalJSlider.setPaintLabels(true);
		verticalJSlider.setPaintTicks(true);
		add(verticalJSlider);
		verticalJSlider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				verticalChangedValue.setText("Vertical Slider Value: " + verticalJSlider.getValue());
			}
		});
		
		setVisible(true);
	}

	// This method will gradually increase the JSlider value in the increments of
	// 10,
	// till the max value of 500
	public void sliderChange() {
		while (sliderValue <= 600) {
			horizontalJSlider.setValue(sliderValue);
			verticalJSlider.setValue(sliderValue);
			sliderValue += 10;
			try {
				Thread.sleep(100);
			} catch (Exception ex) {
				System.out.println(ex.getLocalizedMessage());
			}
		}
	}

	public static void main(String[] args) {
		JSliderExample obj = new JSliderExample();
		obj.sliderChange();
	}

}
