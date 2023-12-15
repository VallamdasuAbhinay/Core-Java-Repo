package abhinay.jswing.programs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class JLayeredPaneExample extends JFrame implements ActionListener {

	/**
	 * The JLayeredPane class is used to add depth to swing container. It is used to
	 * provide a third dimension for positioning component and divide the
	 * depth-range into several different layers.
	 */
	private static final long serialVersionUID = 956575984159790725L;
	JLayeredPane layeredPane;

	public JLayeredPaneExample() {
		super("JLayeredPane Example");
		// Above will set the title for the frame, as the parent/super class for the
		// current class is JFrame
		// It is similar to setTitle("JLayeredPane Example");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("Red Button");
		btn1.setBackground(Color.RED);
		btn1.setBounds(20, 20, 200, 30);
		btn1.addActionListener(this);

		JButton btn2 = new JButton("Green Button");
		btn2.setBackground(Color.GREEN);
		btn2.setBounds(40, 40, 200, 30);
		btn2.addActionListener(this);

		JButton btn3 = new JButton("Yellow Button");
		btn3.setBackground(Color.YELLOW);
		btn3.setBounds(60, 60, 200, 30);
		btn3.addActionListener(this);

		JButton btn4 = new JButton("Cyan Button");
		btn4.setBackground(Color.CYAN);
		btn4.setBounds(100, 100, 200, 30);
		btn4.addActionListener(this);
		
		JLabel ok = new JLabel("Sample JLabel");
		ok.setBounds(80, 80, 200, 30);

		layeredPane = getLayeredPane();
		layeredPane.add(btn1, 1);
		layeredPane.add(btn2, 2);
		layeredPane.add(btn3, 3);
		layeredPane.add(btn4, 4);
		layeredPane.add(ok, 5);
		
		// while adding the components to the layeredPane, we can even specify the
		// position (integer value) at which
		// that component has to be added. If "-1" is provided, it will be added at the
		// end of container.
		setVisible(true);
	}

	public static void main(String[] args) {
		new JLayeredPaneExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "You Have Clicked " + e.getActionCommand());
	}

}
