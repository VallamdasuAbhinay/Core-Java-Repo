package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JTextArea_DemoApplication extends JFrame implements ActionListener {

	private static final long serialVersionUID = -6910997542819516855L;

	JLabel wordsLabel, charLabel;
	JButton calculateDetailsBtn;
	JTextArea textAreaObj;

	public JTextArea_DemoApplication() {
		setTitle("JTextArea Demo Application");
		setSize(800, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		// JTextArea component is basically used to store the multi line plain text data
		// in the below syntax, we provided 3 arguments to it
		// text - represents the data that has to be added to this JTextArea
		// rows - represents the number of rows, that can be accommodated by this
		// JTextArea
		// columns - represents the number of columns
		textAreaObj = new JTextArea("This is the sample text", 10, 10);
		textAreaObj.setBounds(50, 50, 200, 100);
		add(textAreaObj);

		calculateDetailsBtn = new JButton("Calculate");
		calculateDetailsBtn.setBounds(50, 180, 150, 30);
		add(calculateDetailsBtn);
		calculateDetailsBtn.addActionListener(this);

		wordsLabel = new JLabel();
		wordsLabel.setBounds(50, 220, 200, 30);
		add(wordsLabel);

		charLabel = new JLabel();
		charLabel.setBounds(50, 250, 200, 30);
		add(charLabel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextArea_DemoApplication();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().contentEquals("Calculate")) {
			String textAreaData = textAreaObj.getText();
			String[] wordsCount = textAreaData.split("\\s");
			wordsLabel.setText("Words Count...." + wordsCount.length);
			charLabel.setText("Characters Count...." + textAreaData.length());
		}

	}

}
