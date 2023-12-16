package abhinay.jswing.programs;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class JTableSearchApplication extends JFrame {
	private static final long serialVersionUID = 4945075141156467744L;
	private JTextField textFieldObj;
	private JLabel searchLabel;
	private DefaultTableModel model;
	private JTable table;
	private TableRowSorter<DefaultTableModel> rowSorter;
	private JScrollPane scrollPaneObj;

	public JTableSearchApplication() {
		setTitle("JTableSearch Test");
		textFieldObj = new JTextField(15);
		searchLabel = new JLabel("Search");
		String columnNames[] = { "Employee ID", "Employee Name", "Employee Location", "Designation" };
		String rowData[][] = { { "AB229066", "Shiva Kumar", "Hyderabad", "Engineer" },
				{ "KA255610", "Kranthi Kumar", "Bangalore", "Consultant" },
				{ "PS651123", "Prasad Reddy", "Chennai", "Associate Engineer" },
				{ "MN900321", "Manoj", "Delhi", "Project Manager" },
				{ "LV188652", "Lavith", "Indore", "Assistant Manager" } };
		model = new DefaultTableModel(rowData, columnNames);
		rowSorter = new TableRowSorter<>(model);
		table = new JTable(model);
		table.setRowSorter(rowSorter);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		scrollPaneObj = new JScrollPane(table);
		add(searchLabel);
		add(textFieldObj);
		add(scrollPaneObj);

		textFieldObj.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				System.out.println("insertUpdate.........");
				search(textFieldObj.getText());
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				System.out.println("removeUpdate.........");
				search(textFieldObj.getText());
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				System.out.println("changedUpdate.........");
				search(textFieldObj.getText());
			}

			public void search(String str) {
				if (str.length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter(str));
				}
			}
		});
		setSize(475, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTableSearchApplication();
	}
}
