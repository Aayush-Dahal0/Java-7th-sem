//5. Write a program to implement the Menus in swing.
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Q05_SwingMenus extends JFrame {
    private static final long serialVersionUID = 1L;

    public Q05_SwingMenus() {
        setTitle("Aayush Dai ko Menu");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener((ActionEvent e) -> System.exit(0));

        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q05_SwingMenus().setVisible(true));
    }
}
