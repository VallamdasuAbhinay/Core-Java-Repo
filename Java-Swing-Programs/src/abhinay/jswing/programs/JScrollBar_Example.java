package abhinay.jswing.programs;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class JScrollBar_Example extends JFrame {

	private static final long serialVersionUID = 4483050234067720235L;

	JLabel horizontalStatusLabel, verticalStatusLabel;
	// JScrollbar class is used to add horizontal and vertical scrollbar to the
	// JFrame.
	// It inherits JComponent class.
	JScrollBar scrollBarVertical, scrollBarHorizontal;

	public JScrollBar_Example() {
		setTitle("JScrollBar Example");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// If we do not specify any value of orientation in JScrollBar, it will create
		// vertical scrollbar
		// If orientation value = 0, it creates horizontal scrollbar
		// If orientation value = 1, it creates vertical scrollbar
		scrollBarVertical = new JScrollBar();
		scrollBarVertical.setBounds(50, 50, 50, 100);
		scrollBarVertical.setValues(0, 0, 0, 100);
		add(scrollBarVertical);
		scrollBarVertical.addAdjustmentListener(new AdjustmentListener() {
			// This method will get executed each time, whenever we change the scrollbar
			// (upwards or downwards)
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				verticalStatusLabel.setText("Vertical ScrollBar Value: " + scrollBarVertical.getValue());
			}
		});

		scrollBarHorizontal = new JScrollBar(0);
		scrollBarHorizontal.setValues(0, 0, 0, 100);
		scrollBarHorizontal.setBounds(250, 50, 150, 100);
		add(scrollBarHorizontal);
		scrollBarHorizontal.addAdjustmentListener(new AdjustmentListener() {
			// This method will get executed each time, whenever we change the scrollbar
			// (left or right)
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				horizontalStatusLabel.setText("Horizontal ScrollBar Value: " + scrollBarHorizontal.getValue());
			}
		});

		verticalStatusLabel = new JLabel();
		verticalStatusLabel.setBounds(50, 200, 200, 30);
		add(verticalStatusLabel);

		horizontalStatusLabel = new JLabel();
		horizontalStatusLabel.setBounds(250, 200, 200, 30);
		add(horizontalStatusLabel);

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JScrollBar_Example();
	}

}
