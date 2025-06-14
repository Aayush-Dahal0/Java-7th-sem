package eventHandling;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//event handling by Implementing ActionListener
public class FactorialUI extends JFrame implements ActionListener {
	JLabel numlbl, resultlbl;
	JTextField numtxt;
	JButton findfact;

	public FactorialUI() {
		numlbl = new JLabel("Enter any number");
		numtxt = new JTextField(20);
		findfact = new JButton("Find Factorial");
		findfact.addActionListener(this);
		resultlbl = new JLabel("Output:");

		add(numlbl, BorderLayout.NORTH);
		add(numtxt, BorderLayout.CENTER);
		add(findfact, BorderLayout.SOUTH);
		add(resultlbl, BorderLayout.EAST);
		setTitle("Factorial Frame");
		setSize(300, 300);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public int Factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * Factorial(n - 1);
	}

	public static void main(String[] args) {
		new FactorialUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int n=Integer.parseInt(numtxt.getText());
		resultlbl.setText(String.valueOf(Factorial(n)));
	}
}
