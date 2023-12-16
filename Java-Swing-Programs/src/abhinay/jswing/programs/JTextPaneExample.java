package abhinay.jswing.programs;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class JTextPaneExample extends JFrame {

	/**
	 * JTextPane is a subclass of JEditorPane class. JTextPane is used for styled
	 * document with embedded images and components. It is text component that can
	 * be marked up with attributes that are represented graphically. JTextPane uses
	 * a DefaultStyledDocument as its default model.
	 */
	private static final long serialVersionUID = 2829392119728258939L;

	JTextPaneExample() throws BadLocationException {

		setTitle("JTextPane Example");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextPane textPane = new JTextPane();
		SimpleAttributeSet attributeSet = new SimpleAttributeSet();
		StyleConstants.setBold(attributeSet, true);
		StyleConstants.setFontFamily(attributeSet, "Cambria");
		StyleConstants.setFontSize(attributeSet, 20);
		textPane.setCharacterAttributes(attributeSet, true);
		textPane.setText("Welcome ");

		attributeSet = new SimpleAttributeSet();
		StyleConstants.setItalic(attributeSet, true);
		StyleConstants.setForeground(attributeSet, Color.GREEN);
		StyleConstants.setBackground(attributeSet, Color.YELLOW);
		StyleConstants.setFontFamily(attributeSet, "Cambria");
		StyleConstants.setFontSize(attributeSet, 20);

		Document doc = textPane.getStyledDocument();
		doc.insertString(doc.getLength(), "To Java Swing ", attributeSet);

		attributeSet = new SimpleAttributeSet();
		StyleConstants.setFontFamily(attributeSet, "Cambria");
		StyleConstants.setFontSize(attributeSet, 20);
		doc.insertString(doc.getLength(), "Programming", attributeSet);

		JScrollPane scrollPane = new JScrollPane(textPane);
		getContentPane().add(scrollPane);

		setVisible(true);
	}

	public static void main(String[] args) throws BadLocationException {
		new JTextPaneExample();
	}

}
