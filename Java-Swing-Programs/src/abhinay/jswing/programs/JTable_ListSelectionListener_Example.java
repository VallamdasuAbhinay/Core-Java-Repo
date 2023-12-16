package abhinay.jswing.programs;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JTable_ListSelectionListener_Example extends JFrame {

	private static final long serialVersionUID = 7850098393268580349L;
	JTable jTableObj;
	JLabel tableSelectionLabel;

	public JTable_ListSelectionListener_Example() {
		setTitle("JTable Example using ListSelectionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		String columnData[] = { "Employee ID", "Employee Name", "Employee Location", "Designation" };
		String rowData[][] = { { "AB229066", "Shiva Kumar", "Hyderabad", "Engineer" },
				{ "KA255610", "Kranthi Kumar", "Bangalore", "Consultant" },
				{ "PS651123", "Prasad Reddy", "Chennai", "Associate Engineer" },
				{ "MN900321", "Manoj", "Delhi", "Project Manager" },
				{ "LV188652", "Lavith", "Indore", "Assistant Manager" } };
		jTableObj = new JTable(rowData, columnData);
		JScrollPane scrollPane = new JScrollPane(jTableObj);
		add(scrollPane);
		ListSelectionModel listSelectModel = jTableObj.getSelectionModel();
		// Below setting will allow the user to select only one cell at a time
		// multiple row selection is not allowed due to below property
		listSelectModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listSelectModel.addListSelectionListener(new ListSelectionListener() {
			// below method will gets executed each time, whenever a row/column/cell
			// selection
			// happens
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int[] selectedRows = jTableObj.getSelectedRows();
				int[] selectedColumns = jTableObj.getSelectedColumns();

				for (int i = 0; i < selectedRows.length; i++) {
					for (int j = 0; j < selectedColumns.length; j++) {
						tableSelectionLabel.setText(
								"Selected Details...." + jTableObj.getValueAt(selectedRows[i], selectedColumns[j]));
						System.out.println(jTableObj.getValueAt(selectedRows[i], selectedColumns[j]));
					}
				}
			}
		});

		tableSelectionLabel = new JLabel();
		add(tableSelectionLabel);

		setSize(600, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTable_ListSelectionListener_Example();
	}

}
