package eventHandling;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventHandling extends JFrame implements MouseListener {
JLabel infolbl;
	public MouseEventHandling() {
		infolbl=new JLabel("Information");
		add(infolbl,BorderLayout.NORTH);
		setTitle("Mouse Events");
		setSize(300,300);
		addMouseListener(this); // we register mouse listener to Jframe
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
new MouseEventHandling();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		infolbl.setText("Mouse clicked at:"+e.getX()+","+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		infolbl.setText("Mouse pressed at:"+e.getX()+","+e.getY());
 
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		infolbl.setText("Mouse released at:"+e.getX()+","+e.getY());

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		infolbl.setText("Mouse entered at:"+e.getX()+","+e.getY());

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		infolbl.setText("Mouse Exited at:"+e.getX()+","+e.getY());

	}

}
