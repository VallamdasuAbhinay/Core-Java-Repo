package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JCheckBoxMenuItemExample extends JFrame implements ActionListener {
	/*
	 * JCheckBoxMenuItem class represents checkbox which can be included on a menu.
	 * A CheckBoxMenuItem can have text or a graphic icon or both, associated with
	 * it. MenuItem can be selected or deselected. MenuItems can be configured and
	 * controlled by actions.
	 */

	private static final long serialVersionUID = -6318638180317466520L;
	JCheckBoxMenuItem chkBoxMenuItem;
	JMenuItem fruit1, fruit2, fruit3;
	JLabel selctionLabel;

	public JCheckBoxMenuItemExample() {
		setTitle("JCheckBoxMenuItem Example");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Fruits");
		fruit1 = new JMenuItem("Apple");
		fruit1.addActionListener(this);
		fruit2 = new JMenuItem("Banana");
		fruit2.addActionListener(this);
		fruit3 = new JMenuItem("Mango");
		fruit3.addActionListener(this);
		chkBoxMenuItem = new JCheckBoxMenuItem("Orange");
		chkBoxMenuItem.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				JCheckBoxMenuItem ok = (JCheckBoxMenuItem) arg0.getItem();
				if (arg0.getStateChange() == 1) {// 1 means checkbox selected case
					selctionLabel.setText("Selected MenuItem: " + ok.getText());
				} else {// 2 means checkbox un selected case
					selctionLabel.setText("Un Selected MenuItem: " + ok.getText());
				}
			}
		});

		menu.add(fruit1);
		menu.add(fruit2);
		menu.add(fruit3);
		menu.add(chkBoxMenuItem);

		menuBar.add(menu);
		setJMenuBar(menuBar);

		selctionLabel = new JLabel();
		selctionLabel.setBounds(120, 100, 200, 30);
		add(selctionLabel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JCheckBoxMenuItemExample();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		selctionLabel.setText("Selected MenuItem: " + ae.getActionCommand());
	}

}
