
//2. Write a program to implement the JProgressBar with Event Handling .
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q02_JProgressBar extends JFrame {
    private static final long serialVersionUID = 1L;
    private JProgressBar progressBar;
    private Timer timer;
    private int progress = 0;

    public Q02_JProgressBar() {
        setTitle("Progress Bar");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        add(progressBar);

        JButton startButton = new JButton("Start");
        add(startButton);

        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (progress < 100) {
                    progress += 5;
                    progressBar.setValue(progress);
                } else {
                    timer.stop();
                }
            }
        });

        startButton.addActionListener(e -> {
            progress = 0;
            timer.start();
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q02_JProgressBar().setVisible(true));
    }
}
