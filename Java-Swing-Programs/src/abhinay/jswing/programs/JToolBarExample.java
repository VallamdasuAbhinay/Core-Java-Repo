package abhinay.jswing.programs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.text.DefaultStyledDocument;

public class JToolBarExample extends JFrame implements ActionListener {

	/**
	 * JToolBar container allows us to group other components, usually buttons with
	 * icons in a row or column. JToolBar provides a component which is useful for
	 * displaying commonly used actions or controls.
	 * 
	 * JToolBar orientation is by default Horizontal. But, if we want it to display
	 * in Vertical, we can make use of following orientation parameters accepted by
	 * JToolBar: JToolBar.VERTICAL JToolBar.HORIZONTAL
	 * 
	 * In this App, the maximum character limit allowed in the JTextArea is 400
	 * chars only. If the user tries to type an additional character (when the
	 * maxlimit is reached), it will not allow the user. If the user tries to paste
	 * the text(whose length is greater the max limit allowed), the logic will
	 * simply tries to fetch the substring from that position 0 to max limit
	 * position and will remove the remaining additional characters.
	 */
	private static final long serialVersionUID = -4134687909806595230L;
	JToolBar toolBar;
	JLabel headingLabel, transportLabel, statusLabel, charLimitLabel, charCountLabel, charLimitExceededLabel;
	JButton transportBtn;
	JComboBox<String> transportComboBox;
	JTextArea commentsTextArea;
	DefaultStyledDocument styledDoc;
	int maxLimit = 400;

	public JToolBarExample() {
		setTitle("JToolBar Example");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		headingLabel = new JLabel("TRANSPORT APPLICATION");
		headingLabel.setBounds(220, 20, 200, 30);
		add(headingLabel);

		toolBar = new JToolBar();
		toolBar.setBounds(50, 50, 500, 30);

		transportLabel = new JLabel("Transport");
		transportLabel.setBounds(50, 50, 100, 30);
		toolBar.add(transportLabel);

		toolBar.addSeparator();

		transportBtn = new JButton("Book Transport");
		transportBtn.setBounds(120, 50, 120, 30);
		toolBar.add(transportBtn);
		transportBtn.addActionListener(this);

		toolBar.addSeparator();

		transportComboBox = new JComboBox<>(new String[] { "Aeroplane", "Helicopter", "Train", "Steamer", "Bus",
				"Scooter", "Hero Honda", "Hyundai", "Tata Nexus", "Tata Toyota" });
		transportComboBox.setBounds(100, 50, 50, 30);
		toolBar.add(transportComboBox);

		toolBar.setBackground(Color.CYAN);
		add(toolBar);

		statusLabel = new JLabel();
		statusLabel.setBounds(100, 150, 200, 30);
		add(statusLabel);

		commentsTextArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(commentsTextArea);
		scrollPane.setBounds(50, 85, 500, 200);
		add(scrollPane);

		charLimitLabel = new JLabel("Character Limit: ");
		charLimitLabel.setBounds(405, 280, 180, 30);
		add(charLimitLabel);

		charCountLabel = new JLabel("0/400");
		charCountLabel.setBounds(505, 280, 50, 30);
		add(charCountLabel);

		charLimitExceededLabel = new JLabel();
		charLimitExceededLabel.setBounds(170, 280, 220, 30);
		add(charLimitExceededLabel);

		commentsTextArea.addKeyListener(new KeyListener() {
			// This will be executed each time, whenever user types the key
			@Override
			public void keyTyped(KeyEvent e) {

				if (commentsTextArea.getText().length() >= maxLimit) {
					/*
					 * This consume() method of KeyEvent, is basically used to prevent an event from
					 * processing (in our case, the event is KeyType) in the normal way. Hence, it
					 * will not allow the user to paste the text (whose length>maxLimit). Instead,
					 * it will take the substring of that text (which is going to be pasted) from
					 * 0-maxLimit position and adds that substring to JTextArea field.
					 */
					e.consume();
					String shortened = commentsTextArea.getText().substring(0, maxLimit);
					commentsTextArea.setText(shortened);
					updateTextAreaCharCount();
				} else {
					statusLabel.setText("");
				}
			}

			// This will be executed each time, whenever user releases the key
			@Override
			public void keyReleased(KeyEvent arg0) {
				updateTextAreaCharCount();
			}

			// This will be executed each time, whenever user presses the key
			@Override
			public void keyPressed(KeyEvent arg0) {
				updateTextAreaCharCount();
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new JToolBarExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		statusLabel.setText("Happy " + transportComboBox.getModel().getSelectedItem().toString() + " Journey");
		commentsTextArea.setEditable(true);
	}

	public void updateTextAreaCharCount() {
		charCountLabel.setText(commentsTextArea.getText().length() + "/" + maxLimit);
	}

}
