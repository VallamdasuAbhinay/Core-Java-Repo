package abhinay.jswing.programs;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingJTableDemo extends JFrame {

	private static final long serialVersionUID = -5954203516364710671L;

	SwingJTableDemo() {
		setTitle("JTable Application");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[][] rowData = { { "Abhinay", "Sri Vastav", "Vallamdasu", "Hyderabad" },
				{ "Shiva", "Shankara Linga", "Vallamdasu", "Hyderabad" },
				{ "Sai", "Sri Vastav", "Vallamdasu", "Hyderabad" },
				{ "Kumar", "Shankara Linga", "Vallamdasu", "Hyderabad" },
				{ "Lavith", "Sri Vastav", "Vallamdasu", "Hyderabad" },
				{ "Archana", "Shankara Linga", "Vallamdasu", "Hyderabad" },
				{ "Urmila", "Sri Vastav", "Vallamdasu", "Hyderabad" },
				{ "Amarendar", "Shankara Linga", "Vallamdasu", "Hyderabad" } };
		String[] columnData = { "First Name", "Middle Name", "Last Name", "Location" };
		JTable jTableObj = new JTable(rowData, columnData);
		jTableObj.setBackground(Color.WHITE);
		jTableObj.setForeground(Color.GREEN);
		jTableObj.setRowHeight(25);
		// whenever we are working with JTables, it is highly recommended to use the
		// JScrollPane
		// because it automatically takes care of either horizontal or vertical scroll
		// bars,
		// if the components content goes larger than the view
		JScrollPane jScrollPaneObj = new JScrollPane(jTableObj);
		add(jScrollPaneObj);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingJTableDemo();
	}
}
