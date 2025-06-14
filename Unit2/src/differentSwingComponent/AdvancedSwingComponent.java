package swingcomponents;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;

public class AdvancedSwingComponents extends JFrame {
JTree tree;
JTable table;
JProgressBar bar;
JScrollPane pane;
JList<String> list;
	public AdvancedSwingComponents() {
		// TODO Auto-generated constructor stub
			setSize(300,300);
		String[] heading= {"name", "college","address"};
		String[][]data= {
				{"Aayush","veda","dhapakhhel"},
				{"Samriddha","bidhya sagar","santenashor"}
		};
		table =new JTable(data,heading);
		pane=new JScrollPane(table);
		add(pane);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AdvancedSwingComponents();
	}

}
