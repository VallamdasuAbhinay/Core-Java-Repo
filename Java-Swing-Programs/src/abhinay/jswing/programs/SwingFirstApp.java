package abhinay.jswing.programs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class SwingFirstApp extends JFrame {

	private static final long serialVersionUID = 2330831410710848453L;
	// creating the reference for JPanel
	JPanel jPanelObj;
	// creating the reference for JLabel
	JLabel jLabelFirst, jLabelSecond;

	// default constructor of class
	public SwingFirstApp() {
		setTitle("Swing Application");// setting the title name for the JFrame

		// below is used to set the foreground color of JFrame, but it no longer works
		// as JPanel is completely occupied the view of JFrame
		// getContentPane().setForeground(Color.RED);

		// providing the size for the JFrame container
		setSize(500, 300);// size represents length and height of the frame

		// providing the default close operation on frame, so that whenever user clicks
		// on the close
		// button of the frame, the application will be closed properly
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setting layout for the panel, rows and columns details as arguments
		jPanelObj = new JPanel(new GridLayout(4, 2));

		// creating a JLabel component and passing the value to it
		jLabelFirst = new JLabel("First JLabel Content");
		jLabelSecond = new JLabel("Second JLabel Content");

		// as soon as we add any new component, we have to add it to the panel.
		// and finally panel has to be added to the frame
		// otherwise, those new components will not show in the UI Frame
		jPanelObj.add(jLabelFirst);
		jPanelObj.add(jLabelSecond);

		// whenever we are adding the JPanel to the JFrame, the entire view is going to
		// be
		// occupied by the JPanel itself and hence in that case, if we apply the
		// background color
		// on the JFrame object, it is of no use
		// Instead, we can apply the background color on the JPanel as below
		jPanelObj.setBackground(Color.CYAN);

		// Applying the foreground color on the first and second JLabel components
		jLabelFirst.setForeground(Color.RED);
		jLabelSecond.setForeground(Color.BLUE);

		// adding panel to the frame and also specifying the layout info
		add(jPanelObj, BorderLayout.CENTER);

		// this property is being set to true, so that the frame window can be visible
		// to
		// the user in UI screen
		setVisible(true);

	}

	public static void main(String[] args) {
		// we can use below approach to invoke the default constructor of this class,
		// if this class is not extending the JFrame class

		// used to create a frame on the event dispatching thread
//		SwingUtilities.invokeLater(new Runnable() {
//			
//			@Override
//			public void run() {
//				new SwingFirstApp();
//			}
//		});

		// below approach can be used to call this class default constructor, as this
		// class
		// is already extending the JFrame class
		new SwingFirstApp();

	}

}
