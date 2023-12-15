package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JComboBox_Demo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1976653342367566114L;

	// JComboBox is mainly used to show the list of options to the user in the form
	// of the dropdown
	// it allows the user to select one of the values from that dropdown list
	// user can get the selected option value, delete a particular value from that
	// list
	// even user has the option to delete all the values from that list
	JComboBox<String> countryComboBox;
	JLabel statusLabel;
	JButton countryBtn, addCountryBtn, deleteCountryBtn, deleteAllBtn;
	JTextField addCountryTextField;
	JLabel countryLabel, addStatusLabel;

	public JComboBox_Demo() {
		setTitle("JComboBox Demo Application");
		setSize(500, 500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		countryLabel = new JLabel("Please Select Your Country");
		countryLabel.setBounds(50, 50, 200, 30);
		add(countryLabel);

		String[] countryArray = { "India", "Australia", "England", "Germany", "Japan", "America" };
		countryComboBox = new JComboBox<String>(countryArray);
		countryComboBox.setBounds(50, 100, 200, 30);
		add(countryComboBox);

		countryBtn = new JButton("Select Country");
		countryBtn.setBounds(50, 150, 200, 30);
		add(countryBtn);
		countryBtn.addActionListener(this);

		statusLabel = new JLabel();
		statusLabel.setBounds(50, 200, 200, 30);
		add(statusLabel);

		addCountryTextField = new JTextField("");
		addCountryTextField.setBounds(50, 250, 200, 30);
		add(addCountryTextField);

		addCountryBtn = new JButton("Add Country");
		addCountryBtn.setBounds(50, 300, 200, 30);
		add(addCountryBtn);
		addCountryBtn.addActionListener(this);

		deleteCountryBtn = new JButton("Delete Country");
		deleteCountryBtn.setBounds(300, 300, 150, 30);
		add(deleteCountryBtn);
		deleteCountryBtn.addActionListener(this);

		deleteAllBtn = new JButton("Delete All");
		deleteAllBtn.setBounds(50, 400, 150, 30);
		add(deleteAllBtn);
		deleteAllBtn.addActionListener(this);

		addStatusLabel = new JLabel();
		addStatusLabel.setBounds(50, 350, 300, 30);
		add(addStatusLabel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JComboBox_Demo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().contentEquals("Select Country")) {
			String selectedCountry = countryComboBox.getItemAt(countryComboBox.getSelectedIndex());
			statusLabel.setText("Selected Country: " + selectedCountry);
		}
		if (e.getActionCommand().contentEquals("Add Country")) {
			String inputCountry = addCountryTextField.getText();
			List<String> countriesList = new ArrayList<String>();
			for (int i = 0; i < countryComboBox.getItemCount(); i++) {
				countriesList.add(countryComboBox.getItemAt(i));
			}
			if (!countriesList.contains(inputCountry)) {
				countryComboBox.addItem(inputCountry);
				addStatusLabel.setText("Country: " + inputCountry + " added successfully.");
			} else {
				addStatusLabel.setText("Country: " + inputCountry + " already exists in the list");
			}
		}
		if (e.getActionCommand().contentEquals("Delete Country")) {
			String inputCountry = addCountryTextField.getText();
			countryComboBox.removeItem(inputCountry);
			addStatusLabel.setText("Country: " + inputCountry + " deleted successfully");
		}
		if (e.getActionCommand().contentEquals("Delete All")) {
			countryComboBox.removeAllItems();
		}
	}

}
