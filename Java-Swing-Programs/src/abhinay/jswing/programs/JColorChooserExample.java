package abhinay.jswing.programs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JColorChooserExample extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * The JColorChooser class is used to create a color chooser dialog box so that
	 * user can select any color. It inherits JComponent class.
	 */
	JButton colorBtn;
	JTextArea txtArea;

	public JColorChooserExample() {
		setTitle("JColorChooser Example");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		txtArea = new JTextArea();
		txtArea.setBounds(100, 50, 220, 200);
		add(txtArea);

		colorBtn = new JButton("Choose Background Color");
		colorBtn.setBounds(100, 280, 200, 30);
		add(colorBtn);
		colorBtn.addActionListener(this);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JColorChooserExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * JColorChooser in below will accept the following parameters component - the
		 * parent Component for the dialog title - the String containing the dialog's
		 * title initialColor - the initial color set when the color-chooser panel is
		 * first shown
		 * 
		 * This is going to return the Color object selected by user in JColorChooser
		 * dialog box It will return null, if no color opted by the user
		 * 
		 */
		Color selectedColor = JColorChooser.showDialog(this, "Please Choose Color", Color.GREEN);
		if (!selectedColor.equals(null)) {
			// below line will set the background color of the current component (Container
			// in this case)
			// getContentPane().setBackground(selectedColor);
			txtArea.setBackground(selectedColor);
		}
	}

}
