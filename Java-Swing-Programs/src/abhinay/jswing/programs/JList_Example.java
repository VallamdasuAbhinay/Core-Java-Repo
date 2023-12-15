package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JList_Example extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel countryLabel, placesLabel, countrySelectionLabel, placeSelectionLabel;
	JButton selectionBtn;
	// JList basically
	JList<String> placesList, countriesList;

	public JList_Example() {
		setTitle("JList Sample Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		placesLabel = new JLabel("Select Your City:");
		placesLabel.setBounds(50, 50, 150, 30);
		add(placesLabel);

		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("Hyderabad");
		listModel.addElement("Chennai");
		listModel.addElement("Bangalore");
		listModel.addElement("Kerala");
		listModel.addElement("Delhi");
		listModel.addElement("Tripura");
		listModel.addElement("Mysore");
		listModel.addElement("Kolkata");
		listModel.addElement("Mizoram");
		listModel.addElement("Indore");
		placesList = new JList<>(listModel);
		JScrollPane placesPane = new JScrollPane(placesList);
		placesPane.setBounds(200, 50, 200, 100);
		add(placesPane);

		countryLabel = new JLabel("Select Your Country:");
		countryLabel.setBounds(50, 180, 150, 30);
		add(countryLabel);

		DefaultListModel<String> countryModel = new DefaultListModel<>();
		countryModel.addElement("India");
		countryModel.addElement("Srilanka");
		countryModel.addElement("Japan");
		countryModel.addElement("Russia");
		countryModel.addElement("America");
		countryModel.addElement("Germany");

		countriesList = new JList<>(countryModel);
		JScrollPane countriesPane = new JScrollPane(countriesList);
		countriesPane.setBounds(200, 190, 200, 100);
		add(countriesPane);

		selectionBtn = new JButton("Submit");
		selectionBtn.setBounds(150, 320, 100, 30);
		add(selectionBtn);
		selectionBtn.addActionListener(this);

		placeSelectionLabel = new JLabel();
		placeSelectionLabel.setBounds(100, 350, 400, 30);
		add(placeSelectionLabel);

		countrySelectionLabel = new JLabel();
		countrySelectionLabel.setBounds(100, 400, 400, 30);
		add(countrySelectionLabel);

		setSize(600, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JList_Example();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// below will print the index of the selected item of the particular list
		// index starts from 0
		// if no option is selected in the JList, then getSelectedIndex() will return -1
		// value
		// getSelectedIndices() - will return the array of all selected indices in
		// increasing order
		System.out.println(placesList.getSelectedIndex() + "&&" + countriesList.getSelectedIndex());
		// System.out.println(placesList.getSelectedIndices()+"&&"+countriesList.getSelectedIndices());
		if (placesList.getSelectedIndex() != -1) {
			// as JList allows the user to select the multiple values as well
			// getSelectedValue() -- this method will return the single selected value
			// getSelectedValuesList() -- this will return the list of the multiple selected
			// values
			placeSelectionLabel.setText("Selected City : " + placesList.getSelectedValuesList());
		}
		if (countriesList.getSelectedIndex() != -1) {
			countrySelectionLabel.setText("Selected Country : " + countriesList.getSelectedValuesList());
		}
	}

}
