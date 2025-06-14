package defaultPackage;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ConceptofUI {
	JFrame frame;// reference of container frame
	JLabel usernamelbl, passwordlbl;
	JTextField usernametxt;
	JPasswordField passwordtxt;
	JButton loginbtn;

	public ConceptofUI() {
		// object creation
		frame = new JFrame();// container object
		usernamelbl = new JLabel("Username");
		passwordlbl = new JLabel("Password");
		usernametxt = new JTextField(20);
		passwordtxt = new JPasswordField(20);
		loginbtn = new JButton("Login");
		// adding components into container
		frame.add(usernamelbl);
		frame.add(usernametxt);
		frame.add(passwordlbl);
		frame.add(passwordtxt);
		frame.add(loginbtn);
		// layout setting
		frame.setLayout(new FlowLayout());// components are added left to right
		frame.setTitle("Concept UI Frame");
		frame.setResizable(false);
		frame.setSize(300, 300);// size of frame in pixels
		frame.setVisible(true);// frame shown about the screen

	}

	public static void main(String[] args) {
		new ConceptofUI();

	}

}
