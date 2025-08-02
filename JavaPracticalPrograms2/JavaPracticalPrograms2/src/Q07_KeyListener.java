//7. Write a program to handle KeyEvent using KeyListener interface.
import javax.swing.*;
import java.awt.event.*;

public class Q07_KeyListener extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;
    JLabel label;

    public Q07_KeyListener() {
        setTitle("Aayush Key Event Example");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Press a key", SwingConstants.CENTER);
        add(label);

        addKeyListener(this);
        setFocusable(true);
    }

    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        label.setText("Pressed: " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q07_KeyListener().setVisible(true));
    }
}
