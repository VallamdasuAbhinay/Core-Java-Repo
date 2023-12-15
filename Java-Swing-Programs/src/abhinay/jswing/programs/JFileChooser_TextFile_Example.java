package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooser_TextFile_Example extends JFrame implements ActionListener {

	/**
	 * The object of JFileChooser class represents a dialog window from which the
	 * user can select file. It inherits JComponent class.
	 * 
	 * FileNameExtensionFilter is mainly used to restrict the user to select only
	 * some specific file types like txt, pdf, docx, jpg etc. It will take the
	 * following parameters 1).title - this is the filter name which appears in the
	 * FileChooser Dialog window in a drop down (other than the default option of
	 * All Files) 2)....Starting from second parameter, it can accept multiple
	 * parameters, where we need to specify the file extensions (without .), which
	 * we want the user to select. Only those file types (along with the file
	 * folders) will be displayed in FileChooser window
	 * 
	 * And this filter has to be set to the JFileChooser object, before opening the
	 * dialog (as below): fileChooser.setFileFilter(fileFilter);
	 */
	private static final long serialVersionUID = -1877214831944023243L;
	JFileChooser fileChooser;
	JMenuBar menubar;
	JMenu menuObj;
	JMenuItem menuItem;
	JTextArea textArea;
	JScrollPane scrollPane;
	FileNameExtensionFilter fileFilter;

	public JFileChooser_TextFile_Example() {
		setTitle("JFileChooser Example");
		setSize(1000, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		menubar = new JMenuBar();
		menuObj = new JMenu("File");
		menuItem = new JMenuItem("Open");
		menuObj.add(menuItem);
		menubar.add(menuObj);
		setJMenuBar(menubar);

		menuItem.addActionListener(this);

		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(20, 0, 900, 520);
		add(scrollPane);

		// this will allow user to select only txt files
		fileFilter = new FileNameExtensionFilter("Only Text Files", "txt");
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFileChooser_TextFile_Example();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().contentEquals("Open")) {
			fileChooser = new JFileChooser();
			fileChooser.setFileFilter(fileFilter);
			// below int value will give the file selection status to the user
			int fileSelectionStatus = fileChooser.showOpenDialog(this);
			// If the user has selected some file and clicked on the "Open" option in
			// JFileChooser Dialog,
			// it will be equal to below constant variable JFileChooser.APPROVE_OPTION
			if (fileSelectionStatus == JFileChooser.APPROVE_OPTION) {
				System.out.println("File Selection Approved .....");
				// below will provide the path of the selected file
				String selectedFilePath = fileChooser.getSelectedFile().getPath();
				System.out.println(selectedFilePath);
				String content1 = "", content2 = "";
				try {
					BufferedReader reader = new BufferedReader(new FileReader(selectedFilePath));
					while ((content1 = reader.readLine()) != null) {
						content2 += content1 + "\n";
					}
					textArea.setText(content2);
					reader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			// If the user has clicked on the "Cancel" option in JFileChooser Dialog,
			// it will be equal to below constant variable JFileChooser.CANCEL_OPTION
			if (fileSelectionStatus == JFileChooser.CANCEL_OPTION) {
				System.out.println("File Selection Canceled by the user.....");
			}
		}
	}
}
