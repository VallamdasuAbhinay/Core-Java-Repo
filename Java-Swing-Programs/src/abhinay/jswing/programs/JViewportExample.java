package abhinay.jswing.programs;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class JViewportExample extends JFrame {

	/**
	 * The JViewport class is used to implement scrolling. JViewport is designed to
	 * support both logical scrolling and pixel-based scrolling. The viewport's
	 * child, called as "view", is scrolled by calling the
	 * JViewport.setViewPosition() method.
	 */
	private static final long serialVersionUID = -6198321042223324425L;

	public JViewportExample() {
		setTitle("JViewport Example");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		JLabel headingLabel = new JLabel("App Name");
		JScrollPane scrollPane = new JScrollPane(headingLabel);
		scrollPane.setBounds(40, 40, 500, 500);

		JButton submitBtn = new JButton("Submit");
		submitBtn.setBounds(50, 90, 80, 30);

		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setViewportBorder(new LineBorder(Color.GREEN));
		scrollPane.getViewport().add(submitBtn);

		add(scrollPane);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JViewportExample();
	}

}
