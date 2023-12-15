package abhinay.jswing.programs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelExample extends JFrame {

	/**
	 * The JPanel is a simplest container class. It provides space in which an
	 * application can attach any other component. It inherits the JComponent class.
	 * It doesn't have title bar.
	 */
	private static final long serialVersionUID = -9152590135432205872L;
	JPanel panelObj;
	JTextField txtField;
	JButton submitBtn;
	JLabel panelLabel, statusLabel;

	public JPanelExample() {

		setTitle("JPanel Example");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLACK);
		setLayout(null);

		panelObj = new JPanel();
		panelObj.setBounds(100, 100, 300, 300);
		panelObj.setBackground(Color.LIGHT_GRAY);
		panelObj.setLayout(null);

		panelLabel = new JLabel("This is Panel Section");
		panelLabel.setBounds(50, 10, 200, 30);
		panelObj.add(panelLabel);

		txtField = new JTextField();
		txtField.setBounds(50, 50, 150, 30);
		panelObj.add(txtField);

		submitBtn = new JButton("Char Length");
		submitBtn.setBounds(50, 100, 150, 30);
		panelObj.add(submitBtn);
		submitBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				statusLabel.setText("Characters Length: " + txtField.getText().length());
			}
		});

		statusLabel = new JLabel();
		statusLabel.setBounds(50, 150, 200, 30);
		panelObj.add(statusLabel);

		add(panelObj);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JPanelExample();
	}

}
