package abhinay.jswing.programs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class JTable_DemoApp extends JFrame implements ActionListener {

	private static final long serialVersionUID = 6027541586640995093L;

	JLabel searchLabel;
	JTextField searchField;
	JTable empTable;
	DefaultTableModel tableModel;
	TableRowSorter<DefaultTableModel> rowSorter;
	JButton searchBtn;

	public JTable_DemoApp() {
		setTitle("JTable Search Application");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);// new FlowLayout(FlowLayout.CENTER));

		searchLabel = new JLabel("Enter Employee Name");
		searchLabel.setBounds(30, 10, 200, 30);
		add(searchLabel);

		searchField = new JTextField();
		searchField.setBounds(200, 10, 160, 30);
		add(searchField);

		searchBtn = new JButton("Search Employee");
		searchBtn.setBounds(400, 10, 150, 29);
		add(searchBtn);
		searchBtn.addActionListener(this);

		String columnData[] = { "Employee ID", "Employee Name", "Employee Location", "Designation" };
		String rowData[][] = { { "AB229066", "Abhinay Srivastav", "Hyderabad", "Engineer" },
				{ "KA255610", "Kranthi Kumar", "Bangalore", "Consultant" },
				{ "PS651123", "Prasad Reddy", "Chennai", "Associate Engineer" },
				{ "MN900321", "Manoj", "Delhi", "Project Manager" },
				{ "LV188652", "Lavith", "Indore", "Assistant Manager" },
				{ "ST229066", "Sathya Thar", "Hyderabad", "Engineer" },
				{ "KZ255610", "Kumaran Swamy", "Bangalore", "Consultant" },
				{ "PZ651123", "Prakash", "Chennai", "Associate Engineer" },
				{ "MP900321", "Manohar", "Delhi", "Project Manager" } };

		tableModel = new DefaultTableModel(rowData, columnData);
		rowSorter = new TableRowSorter<DefaultTableModel>(tableModel);
		empTable = new JTable(tableModel);
		empTable.setRowSorter(rowSorter);
		empTable.setRowHeight(25);
		empTable.setFillsViewportHeight(true);
		empTable.setSelectionBackground(Color.GREEN);
		JScrollPane scrollPane = new JScrollPane(empTable);
		scrollPane.setBounds(65, 80, 480, 200);
		add(scrollPane);

		setSize(700, 450);
		setResizable(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTable_DemoApp();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().contentEquals("Search Employee")) {
			String searchItem = searchField.getText().trim();
			if (searchItem.length() == 0) {
				rowSorter.setRowFilter(null);
			} else {
				// below regular expression is used to match only the exact first term
				// in any of the columns of table model data (case-sensitive)
				// rowSorter.setRowFilter(RowFilter.regexFilter("^"+searchItem));
				// below regular expression is used to match the string anywhere
				// in any of the columns of table model data (case-sensitive)
				rowSorter.setRowFilter(RowFilter.regexFilter(searchItem));
			}
		}

	}

}
