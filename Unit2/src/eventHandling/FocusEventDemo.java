package eventHandling;

import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FocusEventDemo extends JFrame implements FocusListener {
	JTextField focustxt1, focustxt2;
	JLabel infolbl;

	public FocusEventDemo() {
		focustxt1 = new JTextField(20);
		focustxt1.addFocusListener(this);
		focustxt2 = new JTextField(20);
		focustxt2.addFocusListener(this);
		infolbl = new JLabel("Information");
		add(focustxt1, BorderLayout.NORTH);
		add(focustxt2, BorderLayout.SOUTH);
		add(infolbl,BorderLayout.CENTER);
		setTitle("Focus Event Demo");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new FocusEventDemo();
	}

	@Override
	public void focusGained(FocusEvent e) {
//infolbl.setText("Focus gained at"+e.getSource());
		
		if(e.getSource()==focustxt1) {
			infolbl.setText("We are in focus text 1 field");
		}
		else
			infolbl.setText("We are in focus text 2 field");
	}

	@Override
	public void focusLost(FocusEvent e) {
//		infolbl.setText("Focus lost at"+e.getSource());
		
		if(e.getSource()==focustxt1 && focustxt1.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Empty textbox, Enter anything to continue");
			focustxt1.requestFocus();
		}
		if(e.getSource()==focustxt2 && focustxt2.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Empty textbox, Enter anything to continue");
			focustxt2.requestFocus();
		}
		

	}
}
