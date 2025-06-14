package layoutManager;

import javax.swing.*;

public class NoLayout extends JFrame {
	JLabel firstlbl, lastlbl, genderlbl, countrylbl;
	JTextField firsttxt, lasttxt;
	JRadioButton male, female;
	JComboBox<String> country;
	JButton submitbtn;

	public NoLayout() {
		// Labels and Text Fields
		firstlbl = new JLabel("First Name");
		firstlbl.setBounds(20, 20, 200, 20);
		firsttxt = new JTextField(20);
		firsttxt.setBounds(120, 20, 200, 20);

		lastlbl = new JLabel("Last Name");
		lastlbl.setBounds(20, 50, 200, 20);
		lasttxt = new JTextField(20);
		lasttxt.setBounds(120, 50, 200, 20);

		// Gender
		genderlbl = new JLabel("Gender");
		genderlbl.setBounds(20, 90, 100, 20);
		male = new JRadioButton("Male");
		male.setBounds(120, 90, 70, 20);
		female = new JRadioButton("Female");
		female.setBounds(190, 90, 100, 20);

		// Grouping radio buttons
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);

		// Country
		countrylbl = new JLabel("Country");
		countrylbl.setBounds(20, 130, 100, 20);
		String[] countries = { "Nepal", "India", "Niger" };
		country = new JComboBox<String>(countries);
		country.setBounds(120, 130, 200, 20);

		// Submit Button
		submitbtn = new JButton("Submit");
		submitbtn.setBounds(120, 180, 100, 30);

		// Layout and Frame Settings
		setLayout(null);
		add(firstlbl);
		add(firsttxt);
		add(lastlbl);
		add(lasttxt);
		add(genderlbl);
		add(male);
		add(female);
		add(countrylbl);
		add(country);
		add(submitbtn);

		setTitle("Student Registration Form");
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new NoLayout();
	}
}
