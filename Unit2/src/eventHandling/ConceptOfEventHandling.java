package eventHandling;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ConceptOfEventHandling extends JFrame {
	JButton close;

	public ConceptOfEventHandling() {
		close = new JButton("Close");
		add(close, BorderLayout.NORTH);
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		setTitle("ActionEvent Frame");
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ConceptOfEventHandling();
	}

}

// Event: It is a state when one component is residing on it.
// Events : ActionEvent, KeyEvent, FocusEvent, ItemEvent, MouseEvent, WindowEvent ,ChangeEvent
// Event Handling: It is the process of handling events with the help of different interfaces such as ActionListener, KeyListener, FocusListener
// ItemListener , MouseListener, etc
