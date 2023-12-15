package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class JMenuBar_JMenu_JMenuItem_Notepad extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 8441539204144797628L;
	JMenu fileMenu, editMenu, helpMenu;
	JMenuItem editMenuItem1, editMenuItem2, editMenuItem3, editMenuItem4;
	JTextArea textArea;
	public JMenuBar_JMenu_JMenuItem_Notepad() {
		setTitle("JMenuBar_JMenu_JMenuItem Notepad Application");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		editMenuItem1 = new JMenuItem("Cut");
		editMenuItem1.addActionListener(this);
		editMenuItem2 = new JMenuItem("Copy");
		editMenuItem2.addActionListener(this);
		editMenuItem3 = new JMenuItem("Paste");
		editMenuItem3.addActionListener(this);
		editMenuItem4 = new JMenuItem("Select All");
		editMenuItem4.addActionListener(this);
		editMenu.add(editMenuItem1);
		editMenu.add(editMenuItem2);
		editMenu.add(editMenuItem3);
		editMenu.add(editMenuItem4);
		helpMenu = new JMenu("Help");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		setJMenuBar(menuBar);
		
		textArea = new JTextArea();
		textArea.setBounds(5, 5, 475, 425);
		add(textArea);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuBar_JMenu_JMenuItem_Notepad();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().contentEquals("Cut")) {
			textArea.cut();
		}
		if(e.getActionCommand().contentEquals("Copy")) {
			textArea.copy();
		}
		if(e.getActionCommand().contentEquals("Paste")) {
			textArea.paste();
		}
		if(e.getActionCommand().contentEquals("Select All")) {
			textArea.selectAll();
		}
	}

}

