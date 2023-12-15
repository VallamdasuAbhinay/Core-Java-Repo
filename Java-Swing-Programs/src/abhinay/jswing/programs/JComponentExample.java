package abhinay.jswing.programs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

class SampleJComponent extends JComponent {

	/**
	 * The JComponent class is the base class of all Swing components except
	 * top-level containers. Swing components whose names begin with "J" are
	 * descendants of the JComponent class. For example, JButton, JScrollPane,
	 * JPanel, JTable etc. But, JFrame and JDialog do not inherit JComponent class
	 * because they are the child of top-level containers. The JComponent class
	 * extends the Container class which itself extends Component. The Container
	 * class has support for adding components to the container.
	 */
	private static final long serialVersionUID = -4442667822657760721L;

	// Graphics class can be used to draw the components, set font styles, fill the
	// drawn components with the colors etc.
	// This paint method will be invoked by the Swing to draw components and Apps
	// should not invoke this method directly
	@Override
	public void paint(Graphics g) {
		System.out.println("paint called...........");
		// This will draw the rectangle shape in the container filled with Green Color
		// and Gray Lines around it
		g.setColor(Color.GREEN);
		g.fillRect(40, 60, 200, 100);
		g.setColor(Color.GRAY);
		g.drawLine(30, 50, 250, 50);
		g.drawLine(30, 50, 30, 170);
		g.drawLine(30, 170, 250, 170);
		g.drawLine(250, 170, 250, 50);

		// This will draw the square shape in the container filled with Blue Color and
		// MAGENTA Lines around it
		g.setColor(Color.BLUE);
		g.fillRect(40, 220, 200, 200);
		g.setColor(Color.MAGENTA);
		g.drawLine(30, 210, 250, 210);
		g.drawLine(30, 210, 30, 430);
		g.drawLine(30, 430, 250, 430);
		g.drawLine(250, 430, 250, 210);
	}

}

public class JComponentExample {

	public static void main(String[] args) {
		SampleJComponent obj = new SampleJComponent();
		JFrame frame = new JFrame("JComponent Example");
		frame.setSize(500, 500);
		// JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel rectLabel = new JLabel("Rectangle Component");
		rectLabel.setBounds(40, 20, 200, 30);
		frame.add(rectLabel);

		JLabel squareLabel = new JLabel("Square Component");
		squareLabel.setBounds(40, 180, 200, 30);
		frame.add(squareLabel);
		// Here, the obj refers to the JComponent instance, because the class
		// SampleJComponent is extending the JComponent
		// And this JComponent instance is being added to the Frame
		frame.add(obj);
		frame.setVisible(true);
	}

}
