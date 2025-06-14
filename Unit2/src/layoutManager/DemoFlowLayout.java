package layoutManager;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DemoFlowLayout extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;
	JPanel panel;

	public DemoFlowLayout() {
		btn1 = new JButton("Button One");
		btn2 = new JButton("Button two");
		btn3 = new JButton("Button three");
		btn4 = new JButton("Button 4 ");
		btn5 = new JButton("Button 5");
		panel = new JPanel();
		panel.setBackground(Color.red);

		FlowLayout layout=new FlowLayout();
		panel.setLayout(layout);
		
		add(panel);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		setTitle("FlowLayout Frame");
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	

	public static void main(String[] args) {
		new DemoFlowLayout();

	}

}
