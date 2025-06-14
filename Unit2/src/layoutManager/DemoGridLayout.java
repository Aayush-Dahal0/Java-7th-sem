package layoutManager;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DemoGridLayout extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;

	public DemoGridLayout() {
		btn1 = new JButton("Button One");
		btn2 = new JButton("Button two");
		btn3 = new JButton("Button three");
		btn4 = new JButton("Button 4 ");
		btn5 = new JButton("Button 5");
		// layout
		setLayout(new GridLayout(3, 2,10,15)); // rows=3 columns=2 hgap=10 vgap=15
//		columns are dynamic

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);

		setTitle("FlowLayout Frame");
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new DemoGridLayout();
	}
}
