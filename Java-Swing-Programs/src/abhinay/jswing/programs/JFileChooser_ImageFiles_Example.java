package abhinay.jswing.programs;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooser_ImageFiles_Example extends JFrame implements ActionListener {

	/**
	 * The object of JFileChooser class represents a dialog window from which the
	 * user can select file. It inherits JComponent class.
	 * 
	 * FileNameExtensionFilter is mainly used to restrict the user to select only
	 * some specific file types like txt, pdf, docx, jpg, png etc. It will take the
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

	JButton browseButton;
	JLabel imageLabel;
	JFileChooser fileChooser;
	FileNameExtensionFilter fileFilter;

	public JFileChooser_ImageFiles_Example() {
		setTitle("JFileChooser Example");
		setSize(1400, 810);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		browseButton = new JButton("Choose Image");
		browseButton.setBounds(650, 630, 150, 40);
		browseButton.addActionListener(this);
		add(browseButton);

		imageLabel = new JLabel();
		imageLabel.setBounds(20, 20, 1200, 600);
		add(imageLabel);

		fileFilter = new FileNameExtensionFilter("*.Images", "jpg", "png");
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFileChooser_ImageFiles_Example();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().contentEquals("Choose Image")) {
			fileChooser = new JFileChooser();
			fileChooser.setFileFilter(fileFilter);
			// below int value will give the file selection status to the user
			int fileSelectionStatus = fileChooser.showOpenDialog(this);
			// If the user has selected some file and clicked on the "Open" option in
			// JFileChooser Dialog,
			// it will be equal to below constant variable JFileChooser.APPROVE_OPTION
			if (fileSelectionStatus == JFileChooser.APPROVE_OPTION) {
				System.out.println("File Selection Approved by the user.....");
				// below will provide the path of the selected file
				String selectedFilePath = fileChooser.getSelectedFile().getPath();
				System.out.println(selectedFilePath);
				imageLabel.setIcon(resizeImage(selectedFilePath));
			}
			// If the user has clicked on the "Cancel" option in JFileChooser Dialog,
			// it will be equal to below constant variable JFileChooser.CANCEL_OPTION
			if (fileSelectionStatus == JFileChooser.CANCEL_OPTION) {
				System.out.println("File Selection Canceled by the user.....");
			}
		}
	}

	// This method will be used to resize the user selected image with the same size
	// as that of JLabel dimensions (height and width)
	public ImageIcon resizeImage(String imgPath) {
		ImageIcon path = new ImageIcon(imgPath);
		Image img = path.getImage();
		Image newImg = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		return image;
	}

}
