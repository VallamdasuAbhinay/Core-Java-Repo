package abhinay.jswing.programs;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class JToggleButtonExample extends JFrame {

	/**
	 * JToggleButton is used to create toggle button, it is two-states button to
	 * switch on or off.
	 */
	private static final long serialVersionUID = 3179760774274716239L;
	JToggleButton toggleBtn;
	JLabel lightStatus;

	public JToggleButtonExample() {
		setTitle("JToggleButton Example");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		lightStatus = new JLabel();
		lightStatus.setBounds(80, 200, 220, 240);
		add(lightStatus);

		toggleBtn = new JToggleButton("Toggle Bulb");
		toggleBtn.setBounds(100, 100, 180, 30);
		add(toggleBtn);
		toggleBtn.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				if (toggleBtn.isSelected()) {
					System.out.println("Selected......");
					toggleBtn.setText("Light Off");
					lightStatus.setIcon(new ImageIcon("C:\\Users\\ValSrivastav\\Documents\\GitHub\\Core-Java-Repo\\Java-Swing-Programs\\lightOn.jpg"));
				} else {
					System.out.println("Not Selected......");
					toggleBtn.setText("Light On");
					lightStatus.setIcon(new ImageIcon("C:\\Users\\ValSrivastav\\Documents\\GitHub\\Core-Java-Repo\\Java-Swing-Programs\\lightOff.jpg"));
				}
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new JToggleButtonExample();
	}

}
