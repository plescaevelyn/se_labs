package lab9.Exercise2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    private JButton button;
    private JPanel mainPanel;
    private JTextField valueField;
    private int count;

    public Counter(String title) {
        super(title);
        this.count = 0;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);

        this.setLayout(null);
        int width=100;
        int height = 80;

        valueField.setBounds(50,25,width, height/2);
        add(valueField);

        button.setBounds(50, 95, width, height);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                valueField.setText(String.valueOf(count));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Counter("Exercise 2");
        frame.setVisible(true);
        frame.setSize(250,250);
        frame.setLocation(600, 100);
    }
}
