package layoutManager;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DemoBorderLayout extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;

	public DemoBorderLayout() {
		btn1 = new JButton("Button One");
		btn2 = new JButton("Button two");
		btn3 = new JButton("Button three");
		btn4 = new JButton("Button 4 ");
		btn5 = new JButton("Button 5");
		//layout
		setLayout(new BorderLayout(10,15));  // hgap=10 ,vgap=15

		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.SOUTH);
		add(btn3,BorderLayout.WEST);
		add(btn4,BorderLayout.EAST);
		add(btn5);

		setTitle("FlowLayout Frame");
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new  DemoBorderLayout();
	}

}

// JFrame borderlayout by default and JPanel Flowlayout by default.