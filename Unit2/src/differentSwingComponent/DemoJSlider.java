package differentSwingComponent;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DemoJSlider extends JFrame {
	JSlider slider;
	JTextField valuetxt;

	public DemoJSlider() {
		setTitle("Slider Frame");
		setSize(300, 300);
		ChangeListener listener = new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				valuetxt.setText("The value is = " + slider.getValue());
			}
		};
		Dictionary<Integer, Component> labels = new Hashtable<Integer, Component>();
		labels.put(10, new JLabel("A"));
		labels.put(30, new JLabel("B"));
		labels.put(50, new JLabel("C"));
		labels.put(70, new JLabel("D"));
		labels.put(90, new JLabel("E"));
		labels.put(110, new JLabel("F"));


		//		slider = new JSlider(SwingConstants.VERTICAL,10,110,20); this is a customization example
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 20);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setLabelTable(labels);
//		slider.setSnapToTicks(true);  moves 5 tiicks if clicked
		slider.addChangeListener(listener);

		valuetxt = new JTextField(20);

		add(slider, BorderLayout.NORTH);
		add(valuetxt, BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new DemoJSlider();
	}

}
