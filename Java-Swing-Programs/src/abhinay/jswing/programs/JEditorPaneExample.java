package abhinay.jswing.programs;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class JEditorPaneExample extends JFrame {

	/**
	 * JEditorPane class is used to create a simple text editor window. This class
	 * has setContentType() and setText() methods. setContentType("text/plain"):
	 * This method is used to set the content type to be plain text.
	 * setContentType("text/html"): This method is used to set the content type to
	 * be html type. Here, we can use the HTML formating tags to apply the styles to
	 * the text. setText(text): This method is used to set the initial text content
	 * in the JEditorPane
	 */
	private static final long serialVersionUID = -6288714816063173901L;

	public JEditorPaneExample() {
		setTitle("JEditorPane Example");
		setSize(550, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setContentType("text/plain");
		editorPane.setFont(new Font("Cambria", Font.PLAIN, 20));
		editorPane.setBorder(new LineBorder(Color.BLUE));
		editorPane.setText("Sleeping is necessary for a healthy body."
				+ " But sleeping in unnecessary times may spoil our health, wealth and studies."
				+ " Doctors advise that the sleeping at improper timings may lead for obesity during the students days.");
		setContentPane(editorPane);

		JEditorPane editorPane2 = new JEditorPane();
		editorPane2.setContentType("text/html");
		editorPane2.setFont(new Font("Cambria", Font.PLAIN, 20));
		editorPane2.setBounds(10, 180, 300, 200);
		editorPane2.setBorder(new LineBorder(Color.GREEN));
		editorPane2.setText("<h2>Sleeping Rule</h2><p>Sleeping is necessary for a healthy body."
				+ " But sleeping in unnecessary times may spoil our health, wealth and studies."
				+ " Doctors advise that the sleeping at improper timings may lead for obesity during the students days.</p>");
		add(editorPane2);

		setVisible(true);

	}

	public static void main(String[] args) {
		new JEditorPaneExample();
	}

}
