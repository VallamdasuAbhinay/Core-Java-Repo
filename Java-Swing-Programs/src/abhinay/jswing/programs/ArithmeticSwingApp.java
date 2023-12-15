package abhinay.jswing.programs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ArithmeticSwingApp extends JFrame implements ActionListener{

	private static final long serialVersionUID = 942424668074208130L;
	
	//Container containerObj; //Creating the instance of Container Object
	JLabel firstLabel, secondLabel, resultLabel, validationLabel;
	JTextField firstTextField, secondTextField, resultTextField;
	JButton clearButton;
	JButton addButton, subButton, multiplyButton, divisionButton;
	
	public ArithmeticSwingApp() {
		
		setTitle("Arithmetic Application");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);//setting the frame layout to null, so that no default layout will be
		//used and we can place the elements at the desired position of frame
		
		//If we want to use the Container object provided by the Java AWT Package, then we have
		//to create the instance of it (as shown above).
		//But, in this example we only want to make use of the Java Swing API components. (as they are light weight components)
		//Hence, commenting the below 2 lines and instead we are using the JFrame and all the
		//elements or components of this APP are added to JFrame only
		//containerObj = getContentPane();
		//containerObj.setLayout(null);
		
		firstLabel = new JLabel("Enter First Number");
		//firstLabel.setSize(150, 20);
		//firstLabel.setLocation(50, 50);
		//below mentioned setBounds() method will accept 4 parameters. They are as follows:
		//x - represents the position of this element from X-Axis (Horizontal)
		//y - represents the position of this element from Y-Axis (Vertical)
		//width - represents the width of this element
		//height - represents the height of this element 
		firstLabel.setBounds(50, 50, 150, 20);
		//containerObj.add(firstLabel);
		add(firstLabel);
		
		firstTextField = new JTextField();
		firstTextField.setBounds(200, 50, 180, 20);
		//containerObj.add(firstTextField);
		add(firstTextField);
		
		secondLabel = new JLabel("Enter Second Number");
		secondLabel.setBounds(50, 80, 150, 20);
		//containerObj.add(secondLabel);
		add(secondLabel);
		
		secondTextField = new JTextField();
		secondTextField.setBounds(200, 80, 180, 20);
		//containerObj.add(secondTextField);
		add(secondTextField);
		
		resultLabel = new JLabel("Arithmetic Result");
		resultLabel.setBounds(50, 110, 150, 20);
		//containerObj.add(resultLabel);
		add(resultLabel);
		
		resultTextField = new JTextField();
		resultTextField.setBounds(200, 110, 180, 20);
		resultTextField.setEnabled(false);
		//containerObj.add(resultTextField);
		add(resultTextField);
		
		addButton = new JButton("Addition");
		addButton.setBounds(50, 150, 120, 20);
		//containerObj.add(addButton);
		add(addButton);
		
		subButton = new JButton("Substraction");
		subButton.setBounds(50, 190, 120, 20);
		//containerObj.add(subButton);
		add(subButton);
		
		multiplyButton = new JButton("Multiplication");
		multiplyButton.setBounds(50, 230, 120, 20);
		//containerObj.add(multiplyButton);
		add(multiplyButton);
		
		divisionButton = new JButton("Division");
		divisionButton.setBounds(50, 270, 120, 20);
		//containerObj.add(divisionButton);
		add(divisionButton);
		
		clearButton = new JButton("Clear Data");
		clearButton.setBounds(200, 210, 120, 20);
		//containerObj.add(clearButton);
		add(clearButton);
		
		validationLabel = new JLabel();
		validationLabel.setBounds(50, 300, 300, 20);
		//containerObj.add(validationLabel);
		add(validationLabel);
		
		//we are adding all the following buttons to the ActionListener and the parameter "this"
		//refers to the current instance.
		//whenever any of the button gets clicked, the method actionPerformed() is going to execute
		//and it takes the parameter as ActionEvent
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divisionButton.addActionListener(this);
		clearButton.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ArithmeticSwingApp();
	}
	
	public void actionPerformed(ActionEvent actEventObj) {
		String buttonName = actEventObj.getActionCommand();
		System.out.println(buttonName+" button clicked....");
		double arithmeticResult = 0;
		if(validationCheck()) {
			if(buttonName.contentEquals("Addition")) {
				arithmeticResult = Double.parseDouble(firstTextField.getText()) + Double.parseDouble(secondTextField.getText());
				resultTextField.setText(arithmeticResult+"");
				validationLabel.setText("");
			}
			else if(buttonName.contentEquals("Substraction")) {
				arithmeticResult = Double.parseDouble(firstTextField.getText()) - Double.parseDouble(secondTextField.getText());
				resultTextField.setText(arithmeticResult+"");
				validationLabel.setText("");
			}
			else if(buttonName.contentEquals("Multiplication")) {
				arithmeticResult = Double.parseDouble(firstTextField.getText()) * Double.parseDouble(secondTextField.getText());
				resultTextField.setText(arithmeticResult+"");
				validationLabel.setText("");
			}
			else if(buttonName.contentEquals("Division")) {
				arithmeticResult = Double.parseDouble(firstTextField.getText()) / Double.parseDouble(secondTextField.getText());
				resultTextField.setText(arithmeticResult+"");
				validationLabel.setText("");
			}
			else if(buttonName.contentEquals("Clear Data")) {
				firstTextField.setText("");
				secondTextField.setText("");
				resultTextField.setText("");
			}
		}
		
		else {
			if(!buttonName.contentEquals("Clear Data")) {
				validationLabel.setText("Please Enter First Number & Second Number");
				validationLabel.setForeground(Color.RED);
			}
		}
		
	}
	
	//validates whether the first and second text boxes are empty or not
	public Boolean validationCheck() {
		Boolean validationStatus = false;
		if(firstTextField.getText().length()>0 && secondTextField.getText().length()>0) {
			validationStatus = true;
		}
		else {
			validationStatus = false;
		}
		return validationStatus;
	}

}

