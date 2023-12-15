package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class JPopupMenuExample extends JFrame implements ActionListener {
	private static final long serialVersionUID = -961834391544644901L;
	// PopupMenu can be dynamically popped up at specific position within a
	// component.
	// It inherits the JComponent class.
	JMenuItem item1, item2, item3, item4;
	JLabel selectionLabel;

	public JPopupMenuExample() {
		JFrame frameObj = new JFrame("JPopupMenu Example");
		frameObj.setSize(500, 500);
		frameObj.setLayout(null);

		JPopupMenu popupMenu = new JPopupMenu("Vehicles");
		item1 = new JMenuItem("Car");
		item1.addActionListener(this);
		item2 = new JMenuItem("Train");
		item2.addActionListener(this);
		item3 = new JMenuItem("Steamer");
		item3.addActionListener(this);
		item4 = new JMenuItem("Aeroplane");
		item4.addActionListener(this);
		popupMenu.add(item1);
		popupMenu.add(item2);
		popupMenu.add(item3);
		popupMenu.add(item4);

		frameObj.add(popupMenu);

		frameObj.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				popupMenu.show(frameObj, e.getX(), e.getY());
			}
		});

		selectionLabel = new JLabel();
		selectionLabel.setBounds(10, 10, 160, 30);
		frameObj.add(selectionLabel);

		frameObj.setVisible(true);
	}

	public static void main(String[] args) {
		new JPopupMenuExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		selectionLabel.setText("Selected Option: " + e.getActionCommand());
	}

}
