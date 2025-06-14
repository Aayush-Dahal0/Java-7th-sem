package differentSwingComponent;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ToolBarDemonstration extends JFrame  {
JToolBar bar;

	public ToolBarDemonstration() {
setTitle("ToolBar Frame");
setSize(300,300);
Action openaction=new AbstractAction("OPEN",new ImageIcon("openicon.PNG")) {
	
	@Override
	public void actionPerformed(ActionEvent e) {
   new JFileChooser().showOpenDialog(bar);		
	}
};

bar=new JToolBar();
bar.add(openaction);


setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

	}

}
