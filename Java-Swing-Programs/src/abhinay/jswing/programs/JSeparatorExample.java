package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class JSeparatorExample extends JFrame implements ActionListener {
	/*
	 * JSeparator provides a general purpose component for implementing divider
	 * lines - most commonly used as a divider between menu items that breaks them
	 * up into logical groupings. Instead of using JSeparator directly,you can use
	 * the JMenu or JPopupMenu addSeparator() method to create and add a separator.
	 * JSeparator may also be used elsewhere in a GUI, wherever a visual divider is
	 * useful. It is used to draw a line to separate widgets in a Layout. It
	 * inherits JComponent class.
	 * 
	 * JSeparator basically takes an optional parameter called orientation of type
	 * int It can have following 2 values: SwingConstants.HORIZONTAL
	 * SwingConstants.VERTICAL
	 * 
	 * By default, if we do not provide any value to this parameter, horizontal is
	 * considered
	 * 
	 */
	private static final long serialVersionUID = 1225216718941721541L;
	JSeparator separator;
	JMenuItem item1, item2, item3, item4, item5;
	JLabel selectionLabel;

	public JSeparatorExample() {
		JFrame jFrame = new JFrame("JSeparator Example");
		jFrame.setSize(500, 440);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Operating Systems");

		item1 = new JMenuItem("Microsoft Windows XP");
		menu.add(item1);
		menu.add(new JSeparator(SwingConstants.HORIZONTAL));
		item1.addActionListener(this);

		item2 = new JMenuItem("Microsoft Windows 7");
		menu.add(item2);
		menu.add(new JSeparator());
		item2.addActionListener(this);

		item3 = new JMenuItem("Microsoft Windows 8");
		menu.add(item3);
		menu.addSeparator();
		/*
		 * addSeparator() method of JMenu can also used to separate the menu items with
		 * some line
		 */
		item3.addActionListener(this);

		item4 = new JMenuItem("Microsoft Windows 10");
		menu.add(item4);
		menu.add(new JSeparator());
		item4.addActionListener(this);

		item5 = new JMenuItem("Microsoft Windows 11");
		menu.add(item5);
		item5.addActionListener(this);

		menuBar.add(menu);
		jFrame.setJMenuBar(menuBar);

		JLabel lab1 = new JLabel("Selected MenuItem: ");
		lab1.setBounds(100, 150, 180, 30);
		jFrame.add(lab1);

		// Below will add the vertical separator between the given 2 labels like "|"
		separator = new JSeparator(SwingConstants.VERTICAL);
		separator.setBounds(250, 150, 10, 30);
		jFrame.add(separator);

		selectionLabel = new JLabel();
		selectionLabel.setBounds(300, 150, 150, 30);
		jFrame.add(selectionLabel);

		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new JSeparatorExample();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		selectionLabel.setText(ae.getActionCommand());
	}

}
