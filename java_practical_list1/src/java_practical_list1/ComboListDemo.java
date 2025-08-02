package java_practical_list1;

import javax.swing.*;

public class ComboListDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Combo and List");
        String[] items = {"Apple", "Banana", "Cherry"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        JList<String> list = new JList<>(items);
        JPanel panel = new JPanel();
        panel.add(comboBox); panel.add(new JScrollPane(list));
        f.add(panel);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
