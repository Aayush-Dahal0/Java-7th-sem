//8. Write a program to handle the Mouse events using MouseAdapter Class.
import javax.swing.*;
import java.awt.event.*;

public class Q08_MouseAdapter extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel label;

    public Q08_MouseAdapter() {
        setTitle("Mouse Event Example");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Click on Frame", SwingConstants.CENTER);
        add(label);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + "," + e.getY() + ")");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q08_MouseAdapter().setVisible(true));
    }
}
