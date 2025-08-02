package java_practical_list1;

import javax.swing.*;
import java.awt.event.*;

public class FormUI{
    public static void main(String[] args) {
        JFrame f = new JFrame("Form");
        f.setSize(300, 300);
        JPanel p = new JPanel();
        JTextField tf = new JTextField(10);
        JPasswordField pf = new JPasswordField(10);
        JTextArea ta = new JTextArea(3, 15);
        JButton b = new JButton("Submit");

        b.addActionListener(e -> JOptionPane.showMessageDialog(f, "Submitted!"));
        p.add(new JLabel("Name:")); p.add(tf);
        p.add(new JLabel("Password:")); p.add(pf);
        p.add(new JLabel("About:")); p.add(ta);
        p.add(b);
        f.add(p);
        f.setVisible(true);
    }
}
