package java_practical_list1;

import java.awt.*;
import javax.swing.*;

public class GUIComparison {
    public static void main(String[] args) {
        Frame awtFrame = new Frame("AWT Example");
        awtFrame.setSize(200, 100);
        awtFrame.setLayout(new FlowLayout());
        awtFrame.add(new Label("AWT Label"));
        awtFrame.setVisible(true);

        JFrame swingFrame = new JFrame("Swing Example");
        swingFrame.setSize(200, 100);
        swingFrame.setLayout(new FlowLayout());
        swingFrame.add(new JLabel("Swing Label"));
        swingFrame.setVisible(true);
    }
}
