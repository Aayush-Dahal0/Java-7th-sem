package eventHandling;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEventDemo extends JFrame implements WindowListener {

	public WindowEventDemo() {
		addWindowListener(this);
		setTitle("Window Events");
		setSize(300, 300);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new WindowEventDemo();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Welcome to my project");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Bye bye");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {

		JOptionPane.showMessageDialog(this, "See you soon");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Welcome back");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window is active");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window is deactivated");
	}

}
