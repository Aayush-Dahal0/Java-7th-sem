//9. Write a program to handle focus Events using FocusListener interface.
import javax.swing.*;
import java.awt.event.*;

public class Q09_FocusListener extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField field1 = new JTextField(10);
    JTextField field2 = new JTextField(10);

    public Q09_FocusListener() {
        setTitle("Focus Event Example");
        setSize(300, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        field1.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                field1.setText("Focus Gained!");
            }
            public void focusLost(FocusEvent e) {
                field1.setText("Focus Lost!");
            }
        });

        add(field1);
        add(field2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q09_FocusListener().setVisible(true));
    }
}
