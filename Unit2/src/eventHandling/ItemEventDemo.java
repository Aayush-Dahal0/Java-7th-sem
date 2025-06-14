package eventHandling;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ItemEventDemo extends JFrame implements ItemListener, ListSelectionListener {
	JComboBox<String> students;
	JLabel itemlbl;
	JList<String> fruits; // handled by listSelectionListener with valueChanged(ListSelectionEvent e)

	public ItemEventDemo() {
		String[] list = { "Ram", "Hari", "Shyam", "Krishna" };
		String[] list1 = { "Apple", "Mango", "Pineapple", "Grapes" };
		
		students = new JComboBox<String>(list);
		fruits = new JList<String>(list1);
		itemlbl = new JLabel("Selected item");
		
		students.addItemListener(this);
		fruits.addListSelectionListener(this);
		fruits.setBorder(BorderFactory.createLineBorder(Color.RED));
		add(students, BorderLayout.NORTH);
		add(itemlbl, BorderLayout.SOUTH);
		add(fruits,BorderLayout.CENTER);

		setTitle("Item Events");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ItemEventDemo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		itemlbl.setText("Name of selected student is " + students.getSelectedItem());
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
itemlbl.setText("Name of selected fruits are "+fruits.getSelectedValuesList());
	}

}
