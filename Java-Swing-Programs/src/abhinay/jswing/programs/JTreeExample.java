package abhinay.jswing.programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class JTreeExample extends JFrame implements ActionListener {

	/**
	 * The JTree class is used to display the tree structured data or hierarchical
	 * data. JTree is a complex component. It has a 'root node' at the top most
	 * which is a parent for all nodes in the tree. It inherits JComponent class.
	 */
	private static final long serialVersionUID = 2213840747725663505L;
	JFrame frameObj = new JFrame();
	JTree treeObj;
	DefaultMutableTreeNode animalsRootNode, herbivoresNode, carnivoresNode;
	DefaultMutableTreeNode herbChildNode1, herbChildNode2, carnChildNode1, carnChildNode2;
	JLabel mainLabel;
	JTextField animalTextField;
	JButton herbSubmitBtn, carnSubmitBtn;
	DefaultTreeModel defaultTreeModel;
	JScrollPane scrollPane;
	JLabel selectedNodeLabel;

	public JTreeExample() {
		setTitle("JTree Example");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		mainLabel = new JLabel("Animals Hierarchial Data");
		mainLabel.setBounds(50, 50, 200, 30);
		add(mainLabel);

		animalsRootNode = new DefaultMutableTreeNode("Animals");
		herbivoresNode = new DefaultMutableTreeNode("Herbivores");
		carnivoresNode = new DefaultMutableTreeNode("Carnivores");

		herbChildNode1 = new DefaultMutableTreeNode("Cow");
		herbChildNode2 = new DefaultMutableTreeNode("Rabbit");
		carnChildNode1 = new DefaultMutableTreeNode("Lion");
		carnChildNode2 = new DefaultMutableTreeNode("Tiger");

		herbivoresNode.add(herbChildNode1);
		herbivoresNode.add(herbChildNode2);
		carnivoresNode.add(carnChildNode1);
		carnivoresNode.add(carnChildNode2);

		animalsRootNode.add(herbivoresNode);
		animalsRootNode.add(carnivoresNode);

		treeObj = new JTree(animalsRootNode);
		treeObj.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
			// following method will gets executed each & every time on selection of the
			// node in a JTree
			@Override
			public void valueChanged(TreeSelectionEvent se) {
				// System.out.println(se.getPath());
				selectedNodeLabel.setText("Your Selection: " + se.getPath());
				// if we want to print only the name of the selected node, we can use below code
//				DefaultMutableTreeNode selectedNode = 
//						(DefaultMutableTreeNode) treeObj.getLastSelectedPathComponent();
//				if(selectedNode!=null) {
//					selectedNodeLabel.setText("Your Selection: "+selectedNode.getUserObject().toString());
//				}
			}
		});
		// adding the treeObj to the JScrollPane. so that, even if there are more number
		// of
		// child nodes got added, a scrollbar will appear automatically
		scrollPane = new JScrollPane(treeObj);
		scrollPane.setBounds(50, 100, 200, 300);
		add(scrollPane);
		// if want to hide the root node of this JTree, we can set the below property to
		// false
		// treeObj.setRootVisible(false);
		// if want to show the handle on the root node of this JTree, we can set the
		// below property to true
		treeObj.setShowsRootHandles(true);
		animalTextField = new JTextField();
		animalTextField.setBounds(300, 100, 150, 30);
		add(animalTextField);

		herbSubmitBtn = new JButton("Add Herbivores Animal");
		herbSubmitBtn.setBounds(300, 150, 200, 30);
		add(herbSubmitBtn);
		herbSubmitBtn.addActionListener(this);

		carnSubmitBtn = new JButton("Add Carnivores Animal");
		carnSubmitBtn.setBounds(300, 200, 200, 30);
		add(carnSubmitBtn);
		carnSubmitBtn.addActionListener(this);

		selectedNodeLabel = new JLabel();
		selectedNodeLabel.setBounds(300, 250, 300, 30);
		add(selectedNodeLabel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JTreeExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().contentEquals("Add Herbivores Animal")) {
			if(animalTextField.getText().trim().length()>0) {
				herbivoresNode.add(new DefaultMutableTreeNode(animalTextField.getText()));
				animalsRootNode.add(herbivoresNode);
			}
			// If we want to know the count of the child nodes in a specific node,
			// we can use below method called getChildCount()
			// System.out.println(herbivoresNode.getChildCount());
			defaultTreeModel = (DefaultTreeModel) treeObj.getModel();
			defaultTreeModel.reload();
			// reload() is basically used, if there are any addition/deletion of nodes in a
			// JTree
			// and to reflect the updated changes of JTree, it is used.
			// getModel() of JTree Object is used to fetch the model data (all nodes info)
		}
		if (e.getActionCommand().contentEquals("Add Carnivores Animal")) {
			if(animalTextField.getText().trim().length()>0) {
				carnivoresNode.add(new DefaultMutableTreeNode(animalTextField.getText()));
				animalsRootNode.add(carnivoresNode);
			}
			defaultTreeModel = (DefaultTreeModel) treeObj.getModel();
			defaultTreeModel.reload();
		}
	}
}
