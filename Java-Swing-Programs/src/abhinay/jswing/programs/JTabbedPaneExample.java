package abhinay.jswing.programs;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JTabbedPaneExample extends JFrame {

	/**
	 * The JTabbedPane class is used to switch between a group of components by
	 * clicking on a tab with a given title or icon. It inherits JComponent class.
	 * 
	 * The default placement of the tabs in the JTabbedPane is Top Position. And we
	 * can also set the following other placements values: JTabbedPane.RIGHT
	 * JTabbedPane.LEFT JTabbedPane.BOTTOM JTabbedPane.TOP
	 */
	private static final long serialVersionUID = 3428781544371519779L;
	JPanel animalsJPanel, vehiclesJPanel, birdsJPanel;
	JTabbedPane tabbedPane;
	JTextArea animalsTextArea, vehiclesTextArea, birdsTextArea;

	public JTabbedPaneExample() {
		setTitle("JTabbedPane Example");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		animalsJPanel = new JPanel();
		animalsTextArea = new JTextArea("This is Animals Section", 20, 30);
		animalsJPanel.add(animalsTextArea);
		
		vehiclesJPanel = new JPanel();
		vehiclesTextArea = new JTextArea("This is Vehicles Section", 20, 30);
		vehiclesJPanel.add(vehiclesTextArea);
		birdsJPanel = new JPanel();
		birdsTextArea = new JTextArea("This is Birds Section", 20, 30);
		birdsJPanel.add(birdsTextArea);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(50, 50, 400, 400);
		// Here, Animals represents the tab name and animalsJPanel represents the
		// component
		// which will be displayed after clicking on the Animals Tab
		tabbedPane.add("Animals", animalsJPanel);
		tabbedPane.add("Vehicles", vehiclesJPanel);
		tabbedPane.add("Birds", birdsJPanel);
		add(tabbedPane);

		tabbedPane.addChangeListener(new ChangeListener() {
			// below method will be executed each and every time, when we select the Tab in
			// the
			// JTabbedPane component
			// tabbedPane.getSelectedIndex() is used to provide the index of the selected
			// Tab.
			// index starts from 0,1,2,3,etc
			// tabbedPane.getTitleAt(selectedIndex) is used to provide the title of the
			// selected tab
			// for above method, we need to pass the index of selected tab
			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println(tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()));
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new JTabbedPaneExample();
	}

}
