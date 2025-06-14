package differentSwingComponent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class DemoJMenu extends JFrame {
	JMenuBar bar;
	JMenu file, edit;
	JMenuItem save, exit, open, color;
	JPanel panel;

	public DemoJMenu() {
// creating objects
		panel=new JPanel();
		add(panel);
		
		bar = new JMenuBar();

		file = new JMenu("File");
		file.setMnemonic('F');

		edit = new JMenu("Edit");
		edit.setMnemonic('E');

		save = new JMenuItem("Save");
		save.setEnabled(false);

		exit = new JMenuItem("Exit");
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		exit.addActionListener(e -> System.exit(0));

		open = new JMenuItem("Open");
		open.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new JFileChooser().showOpenDialog(bar);
			}
		});

		color = new JMenuItem("Color");
		color.addActionListener(e -> {
			Color c = new JColorChooser().showDialog(bar, "Select Color", Color.BLUE);
		panel.setBackground(c);
		});
		// adding components to parent node
		// here bar is the parent node as it is a menubar and menu and menu items are
		// added to bar

		bar.add(file);
		bar.add(edit);
		file.add(save);
		file.add(exit);
		edit.add(open);
		edit.add(color);

		setJMenuBar(bar);
		setTitle("Menu frame");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new DemoJMenu();
	}
}
