package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class JMenuBar_JMenu_JMenuItem_Demo extends JFrame implements ActionListener, MenuListener {

	private static final long serialVersionUID = 5244251733791247448L;
	/*
	 * The JMenuBar class is used to display menubar on the window or frame. It may
	 * have several menus. The object of JMenu class is a pull down menu component
	 * which is displayed from the menu bar. It inherits the JMenuItem class. The
	 * object of JMenuItem class adds a simple labeled menu item. The items used in
	 * a menu must belong to the JMenuItem or any of its subclass.
	 */
	JMenu twoWheelerMenu, threeWheelerMenu, fourWheelerMenu, fourWheelerElectricMenu;
	JMenuItem twMenuItem1, twMenuItem2, thMenuItem1, thMenuItem2, fwMenuItem1, fwMenuItem2, fwElectricMenuItem1,
			fwElectricMenuItem2, fwElectricMenuItem3;
	JLabel selectedMenuLabel, selectedMenuItemLabel;

	public JMenuBar_JMenu_JMenuItem_Demo() {
		setTitle("JMenuBar_JMenu_JMenuItem Sample Application");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		JMenuBar menuBar = new JMenuBar();

		twoWheelerMenu = new JMenu("Two Wheelers");
		twMenuItem1 = new JMenuItem("Activa 5G");
		twMenuItem1.addActionListener(this);
		twMenuItem2 = new JMenuItem("Chetak");
		twMenuItem2.addActionListener(this);
		twoWheelerMenu.add(twMenuItem1);
		twoWheelerMenu.add(twMenuItem2);
		twoWheelerMenu.addMenuListener(this);
		menuBar.add(twoWheelerMenu);

		threeWheelerMenu = new JMenu("Three Wheelers");
		thMenuItem1 = new JMenuItem("Bajaj Maxima");
		thMenuItem1.addActionListener(this);
		thMenuItem2 = new JMenuItem("Piaggio Ape E Xtra");
		thMenuItem2.addActionListener(this);
		threeWheelerMenu.add(thMenuItem1);
		threeWheelerMenu.add(thMenuItem2);
		threeWheelerMenu.addMenuListener(this);
		menuBar.add(threeWheelerMenu);

		fourWheelerMenu = new JMenu("Four Wheelers");
		fwMenuItem1 = new JMenuItem("Hyundai");
		fwMenuItem1.addActionListener(this);
		fwMenuItem2 = new JMenuItem("Mahindra Thar");
		fwMenuItem2.addActionListener(this);
		fourWheelerMenu.add(fwMenuItem1);
		fourWheelerMenu.add(fwMenuItem2);
		fourWheelerElectricMenu = new JMenu("Four Wheeler Electric Category");
		fwElectricMenuItem1 = new JMenuItem("Tata Tigor EV");
		fwElectricMenuItem1.addActionListener(this);
		fwElectricMenuItem2 = new JMenuItem("Kia EV6");
		fwElectricMenuItem2.addActionListener(this);
		fwElectricMenuItem3 = new JMenuItem("BMW i4");
		fwElectricMenuItem3.addActionListener(this);
		fourWheelerElectricMenu.add(fwElectricMenuItem1);
		fourWheelerElectricMenu.add(fwElectricMenuItem2);
		fourWheelerElectricMenu.add(fwElectricMenuItem3);
		fourWheelerMenu.add(fourWheelerElectricMenu);
		fourWheelerMenu.addMenuListener(this);
		menuBar.add(fourWheelerMenu);
		setJMenuBar(menuBar);

		selectedMenuLabel = new JLabel();
		selectedMenuLabel.setBounds(100, 100, 300, 30);
		add(selectedMenuLabel);

		selectedMenuItemLabel = new JLabel();
		selectedMenuItemLabel.setBounds(100, 160, 300, 30);
		add(selectedMenuItemLabel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuBar_JMenu_JMenuItem_Demo();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		selectedMenuItemLabel.setText("Selected MenuItem: " + ae.getActionCommand());
	}

	@Override
	public void menuCanceled(MenuEvent arg0) {
		System.out.println("Menu Canceled.....");
	}

	@Override
	public void menuDeselected(MenuEvent arg0) {
		System.out.println("Menu De-Selected.....");
	}

	@Override
	public void menuSelected(MenuEvent arg0) {
		System.out.println("Menu Selected.....");
		// arg0.
		JMenu sMenu = (JMenu) arg0.getSource();
		selectedMenuLabel.setText("Selected Menu: " + sMenu.getText());
		 System.out.println("Selected Menu: " + sMenu.getText());
	}

}
