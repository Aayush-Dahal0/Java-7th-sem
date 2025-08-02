//4. Write a program to handle the ChangeEvents in JSliders.
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Q04_JSlider_ChangeEvent extends JFrame {
    private static final long serialVersionUID = 1L;

    public Q04_JSlider_ChangeEvent() {
        setTitle("Slider Event Demo");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JSlider slider = new JSlider(0, 100, 50);
        JLabel label = new JLabel("Value: 50");

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Value: " + slider.getValue());
            }
        });

        add(slider, "North");
        add(label, "South");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q04_JSlider_ChangeEvent().setVisible(true));
    }
}
