//6. Write a program to implement all kinds of Borders.
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Q06_Borders extends JFrame {
    private static final long serialVersionUID = 1L;

    public Q06_Borders() {
        setTitle("Aayush ko  Borders Example");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        JLabel label1 = new JLabel("Line Border", SwingConstants.CENTER);
        label1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(label1);

        JLabel label2 = new JLabel("Etched Border", SwingConstants.CENTER);
        label2.setBorder(BorderFactory.createEtchedBorder());
        add(label2);

        JLabel label3 = new JLabel("Bevel Border", SwingConstants.CENTER);
        label3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        add(label3);

        JLabel label4 = new JLabel("Titled Border", SwingConstants.CENTER);
        label4.setBorder(BorderFactory.createTitledBorder("Title"));
        add(label4);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q06_Borders().setVisible(true));
    }
}
