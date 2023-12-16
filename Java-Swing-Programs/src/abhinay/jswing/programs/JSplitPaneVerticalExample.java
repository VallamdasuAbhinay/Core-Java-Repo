package abhinay.jswing.programs;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class JSplitPaneVerticalExample extends JFrame {

	/**
	 * JSplitPane is used to divide two components. The two components are divided
	 * based on the look and feel implementation, and they can be resized by the
	 * user. If the minimum size of the two components is greater than the size of
	 * the split pane, the divider will not allow you to resize it.
	 * 
	 * The two components in a split pane can be aligned left to right using
	 * JSplitPane.HORIZONTAL_SPLIT, or top to bottom using
	 * JSplitPane.VERTICAL_SPLIT. When the user is resizing the components the
	 * minimum size of the components is used to determine the maximum/minimum
	 * position the components can be set to.
	 */
	private static final long serialVersionUID = 2090467906136192023L;

	public JSplitPaneVerticalExample() {
		setTitle("JSplitPane Example");
		setSize(400, 400);
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel splitPanelLabel = new JLabel("Vertical JSplitPane");
		getContentPane().add(splitPanelLabel);

		String[] fruits = { "Apple", "Banana", "Orange", "Custard Apple", "Sapota" };
		JComboBox<String> fruitsComboBox = new JComboBox<String>(fruits);
		fruitsComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Selected Value: " + fruitsComboBox.getSelectedItem().toString());
			}
		});
		String[] electronics = { "Smartphone", "Laptop", "Desktop", "iPad", "Smartwatch" };
		JComboBox<String> electronicsComboBox = new JComboBox<String>(electronics);
		electronicsComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Selected Value: " + electronicsComboBox.getSelectedItem().toString());
			}
		});
		JPanel fruitsPanel = new JPanel();
		fruitsPanel.add(fruitsComboBox);
		JPanel electronicsPanel = new JPanel();
		electronicsPanel.add(electronicsComboBox);
		// In below syntax, JSplitPane has taken the following 3 arguments:
		// newOrientation - JSplitPane.HORIZONTAL_SPLIT or JSplitPane.VERTICAL_SPLIT
		// newLeftComponent - the Component that will appear on the left of a
		// horizontally-split pane, or at the top of a vertically-split pane
		// newRightComponent - the Component that will appear on the right of a
		// horizontally-split pane, or at the bottom of a vertically-split pane
		JSplitPane verticalSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, fruitsPanel, electronicsPanel);
		getContentPane().add(verticalSplitPane);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSplitPaneVerticalExample();
	}

}
