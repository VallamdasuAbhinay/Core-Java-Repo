package abhinay.jswing.programs;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class JScrollPaneExample extends JFrame {

	/**
	 * A JscrollPane is used to make scrollable view of a component. When screen
	 * size is limited, we use a scroll pane to display a large component or a
	 * component whose size can change dynamically. We can set any of the following
	 * policies for the Horizontal or Vertical Scrollbars:
	 * HORIZONTAL_SCROLLBAR_AS_NEEDED or VERTICAL_SCROLLBAR_AS_NEEDED (Here,
	 * scrollbar will come only when needed i.e., content is dynamic)
	 * HORIZONTAL_SCROLLBAR_ALWAYS or VERTICAL_SCROLLBAR_ALWAYS (Here, always
	 * scrollbar will be displayed) HORIZONTAL_SCROLLBAR_NEVER or
	 * VERTICAL_SCROLLBAR_NEVER (Here, scrollbar will never be displayed, even when
	 * the content is big)
	 */
	private static final long serialVersionUID = 8988988354240287964L;

	JScrollPaneExample() {
		setTitle("JScrollPane Example");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Here, JTextArea took 2 parameters (x, y)
		// where x represents the number of rows and
		// y represents number of columns
		JTextArea textArea = new JTextArea(3, 3);
		// setting the initial text into JTextArea
		textArea.setText("India is celebrating its 75 Years of Independence.\n");
		textArea.append("Impact Day Guidelines.\n");
		textArea.append("Well Being Day Guidelines.\n");
		textArea.append("Computer Day Guidelines.");
		// This will apply the scroll pane to the specified component (i.e., textArea)
		JScrollPane textAreaScrollPane = new JScrollPane(textArea);
		textAreaScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		textAreaScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		// This will be displayed in the Column Header
		textAreaScrollPane.setColumnHeaderView(new JTextArea("ColumnTextArea"));
		// This will be displayed in the Row Header
		textAreaScrollPane.setRowHeaderView(new JTextArea("RowTextArea"));
		setContentPane(textAreaScrollPane);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JScrollPaneExample();
	}

}
