package lab9.Exercise3;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderEx extends JFrame{
    JPanel mainPanel;
    JTextArea textArea;
    JTextField fileName;
    JButton button;

    ActionListener listener = e -> {
        try {
            String fileName = FileReaderEx.this.fileName.getText();
            open(fileName);
        } catch(Exception ignored){}
    };

    FileReaderEx(String title) {
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);
        int width = 200;
        int height = 100;

        fileName.setBounds(50,50,width, height/2);
        add(fileName);

        button.setBounds(50, 150, width, height);
        add(button);
        button.addActionListener(listener);

        textArea = new JTextArea();
        textArea.setBounds(300, 50, 250, 200);
        textArea.setLineWrap(true);
        add(textArea);
    }

    void open(String file) {
        try {
            textArea.setText("");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String l = "";
            l = bufferedReader.readLine();
            while (l != null)
            {
                textArea.append(l + "\n");
                l = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch(Exception e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new FileReaderEx("Exercise 3");
        frame.setVisible(true);
        frame.setSize(600,350);
        frame.setLocation(600, 100);
    }
}

