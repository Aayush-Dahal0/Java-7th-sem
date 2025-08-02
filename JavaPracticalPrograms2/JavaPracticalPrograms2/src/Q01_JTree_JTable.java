//1. Write a program for JTree and JTable.
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Q01_JTree_JTable extends JFrame {
    private static final long serialVersionUID = 1L;

    public Q01_JTree_JTable() {
        setTitle("JTree and JTable Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Countries");
        DefaultMutableTreeNode asia = new DefaultMutableTreeNode("Asia");
        asia.add(new DefaultMutableTreeNode("Nepal"));
        asia.add(new DefaultMutableTreeNode("India"));
        root.add(asia);

        JTree tree = new JTree(root);

        String[][] data = {
            {"101", "Aayush Dahal", "Student"},
            {"102", "Rajan Thapa", "Teacher"},
            {"103", "Samridha", "Friend"}
        };
        String[] columns = {"ID", "Name", "Role"};

        JTable table = new JTable(data, columns);
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                                              new JScrollPane(tree),
                                              new JScrollPane(table));
        add(splitPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q01_JTree_JTable().setVisible(true));
    }
}
