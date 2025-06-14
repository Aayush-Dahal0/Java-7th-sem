package eventHandling;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// KeyEvent is a class in java which is handled by KeyListener interface which provides 
// different event handler functions : KeyTyped(), keyPressed()
// Key Event is occured when any of the key in a keyboard is pressed, typed and released
public class DemoKeyEvent extends JFrame implements KeyListener {
	JLabel firstlbl, secondlbl, thirdlbl, lastlbl;
	JTextField firsttxt, secondtxt, thirdtxt, lasttxt;

	public DemoKeyEvent() {
		setTitle("Math Operation");

		setLayout(new GridLayout(4, 2, 5, 5)); // 4 rows with 2 columns and 5 hgap and vgap each

		firstlbl = new JLabel("First Number");
		secondlbl = new JLabel("Second Number");
		thirdlbl = new JLabel("Operation");
		lastlbl = new JLabel("Result");

		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		thirdtxt = new JTextField(20);
		thirdtxt.addKeyListener(this);
		lasttxt = new JTextField(20);

		add(firstlbl);
		add(firsttxt);
		add(secondlbl);
		add(secondtxt);
		add(thirdlbl);
		add(thirdtxt);
		add(lastlbl);
		add(lasttxt);
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new DemoKeyEvent();
	}

	@Override
	public void keyTyped(KeyEvent e) {
// addition ,substraction, multiplication, division and remainder
		int first=Integer.parseInt(firsttxt.getText());
		int second=Integer.parseInt(secondtxt.getText());
		int result=0;
		char choice=e.getKeyChar();
		switch(choice) {
		case 'a':
			result=first+second;
			break;
		case 's':
			result=first-second;
			break;
		case 'm':
			result=first*second;
			break;
		case 'd':
			result=first/second;
			break;
		case 'r':
			result=first%second;
		
		}
		lasttxt.setText("The result is="+result);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar() + " Key is pressed for long time");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Key is released after long press");
	}

}
