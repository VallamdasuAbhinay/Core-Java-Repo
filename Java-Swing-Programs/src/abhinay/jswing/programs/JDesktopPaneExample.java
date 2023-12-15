package abhinay.jswing.programs;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

class CustomDesktopPane extends JDesktopPane {

	private static final long serialVersionUID = 1L;

	public void display(CustomDesktopPane refObj) {
		int xPosition = 40, yPosition = 40;
		for (int i = 1; i <= 3; i++) {
			JInternalFrame iFrame = new JInternalFrame("Internal Frame " + i, true, true, true, true);
			/*
			 * JInternalFrame - lightweight object that provides many of the features of a
			 * native frame, including dragging, closing, becoming an icon,resizing, title
			 * display, and support for a menu bar Generally,you add JInternalFrames to a
			 * JDesktopPane. The UIdelegates the look-and-feel-specific actions to the
			 * DesktopManagerobject maintained by the JDesktopPane. Following are the
			 * details of the arguments for the constructor of JInternalFrame: title - the
			 * String to display in the title bar resizable - if true, the internal frame
			 * can be resized closable - if true, the internal frame can be closed
			 * maximizable - if true, the internal frame can be maximized iconifiable - if
			 * true, the internal frame can be iconified
			 */
			iFrame.setBounds(xPosition, yPosition, 200, 100);
			iFrame.add(new JLabel("Internal Frame " + i + " Label"));
			refObj.add(iFrame);
			iFrame.setVisible(true);
			yPosition += 120;
		}
	}
}

public class JDesktopPaneExample extends JFrame {

	/**
	 * The JDesktopPane class, can be used to create "multi-document" applications.
	 * A multi-document application can have many windows included in it. We do it
	 * by making the contentPane in the main window as an instance of the
	 * JDesktopPane class or a subclass. Internal windows add instances of
	 * JInternalFrame to the JdesktopPane instance. The internal windows are the
	 * instances of JInternalFrame or its subclasses.
	 */
	private static final long serialVersionUID = 1L;

	public JDesktopPaneExample() {
		super("JDesktopPane Example");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		CustomDesktopPane customObj = new CustomDesktopPane();
		Container contObj = getContentPane();
		contObj.add(customObj, BorderLayout.CENTER);

		customObj.display(customObj);
	}

	public static void main(String[] args) {
		new JDesktopPaneExample();
	}

}
