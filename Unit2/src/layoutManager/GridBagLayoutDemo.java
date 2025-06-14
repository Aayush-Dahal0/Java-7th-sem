package layoutManager;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;
	GridBagConstraints gbc = new GridBagConstraints();

	public GridBagLayoutDemo() {
		setTitle("Grid Bag Frame");
		setSize(550,300);
		setLayout(new GridBagLayout());
		
		btn1= new JButton("Button One");
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight=5;
		gbc.fill=GridBagConstraints.VERTICAL;
		add(btn1,gbc);
		
		btn2= new JButton("Button Two");
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridheight=1;
		add(btn2,gbc);
		
		btn3= new JButton("Button Three");
		gbc.gridx=2;
		gbc.gridy=2;
		gbc.gridheight=1;
		add(btn3,gbc);
		
		btn4= new JButton("Button Four");
		gbc.gridx=3;
		gbc.gridy=3;
		gbc.gridheight=1;
		add(btn4,gbc);
		
		btn5= new JButton("Button Five");
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.gridheight=1;
		gbc.gridwidth=3;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		add(btn5,gbc);
		
		setVisible(true);
	}

	public static void main(String[] args) {
new GridBagLayoutDemo();
	}

}
