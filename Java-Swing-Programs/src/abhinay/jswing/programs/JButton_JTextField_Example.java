package abhinay.jswing.programs;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JButton_JTextField_Example extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = -2301276236473013436L;
	
	JTextField txtFieldObj, txtFieldHostName;
	JButton addTextBtn, changeBackgroundBtn, imageBtn, getIPAddressBtn;
	JLabel ipAddressLabel;
	public JButton_JTextField_Example() {
		setTitle("Demo using JButton and JTextField");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		txtFieldObj = new JTextField();
		txtFieldObj.setBounds(100, 100, 200, 25);
		add(txtFieldObj);//this will add the specified component to the end of this container
		
		addTextBtn = new JButton("Click to Add Text");
		addTextBtn.setBounds(100, 150, 200, 25);
		add(addTextBtn);
		addTextBtn.addActionListener(this);
		
		changeBackgroundBtn = new JButton("Click to Change Background");
		changeBackgroundBtn.setBounds(100, 200, 200, 25);
		add(changeBackgroundBtn);
		changeBackgroundBtn.addActionListener(this);
		
		//use below code, if we want to add an image for a JButton and in the parameter
		//we have to use a class called ImageIcon and provide the image file path
		imageBtn = 
				new JButton(new ImageIcon("C:\\Users\\ValSrivastav\\Desktop\\Java Swing And Fx documents\\submitBtnImage.jpg"));
		imageBtn.setBounds(100, 250, 200, 200);
		add(imageBtn);
		
		txtFieldHostName = new JTextField();
		txtFieldHostName.setBounds(400, 100, 200, 25);
		add(txtFieldHostName);//this will add the specified component to the end of this container
		
		getIPAddressBtn = new JButton("Click to Get IP Address");
		getIPAddressBtn.setBounds(400, 150, 200, 25);
		add(getIPAddressBtn);
		getIPAddressBtn.addActionListener(this);
		
		ipAddressLabel = new JLabel();
		ipAddressLabel.setBounds(400, 200, 200, 50);
		add(ipAddressLabel);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JButton_JTextField_Example();
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().contentEquals("Click to Add Text")) {
			txtFieldObj.setText("Welcome to Java Swing API");
		}
		if(ae.getActionCommand().contentEquals("Click to Change Background")) {
			getContentPane().setBackground(Color.PINK);
		}
		if(ae.getActionCommand().contentEquals("Click to Get IP Address")) {
			String hostName = txtFieldHostName.getText();
			try {
				if(!hostName.equals("")) {
					//Some valid hostnames are wipro.com, javatpoint.com, microsoft.com etc.
					System.out.println(InetAddress.getByName(hostName).getHostAddress());
					ipAddressLabel.setText("IP Address is "+ InetAddress.getByName(hostName).getHostAddress());
				}else {
					ipAddressLabel.setText("IP Address cannot be empty.");
				}
			} catch (UnknownHostException e) {
				System.out.println("Exception Occurred......");
				e.printStackTrace();
			}
		}
	}
}

