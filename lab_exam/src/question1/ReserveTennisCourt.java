package question1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReserveTennisCourt extends JFrame{
    SignUpPage signupforaccounts = new SignUpPage();
    List<User> accounts = signupforaccounts.getAccounts();

    List<String> availableDatetimes = new ArrayList<>();
    List<String> availableTrainers = new ArrayList<>();

    JButton reserveButton;
    JLabel dateTimeLabel;
    JLabel trainerLabel;
    JScrollPane trainerScrollPane;
    JScrollPane datetimeScrollPane;
    JPanel panel1;
    JTextField textField;

    public ReserveTennisCourt() {
        setTitle("Reservation page");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,700);

        init();

        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String dateInput = datetimeScrollPane.getText();
//                String trainerInput = trainerScrollPane.getToolTipText();
            }
        });
    }

    public void init(){
        this.setLayout(null);

        dateTimeLabel = new JLabel("Select a date and time");
        dateTimeLabel.setBounds(0,0,200,100);

        trainerLabel = new JLabel("Select a trainer");
        trainerLabel.setBounds(200,0,200,100);

        datetimeScrollPane = new JScrollPane();
        datetimeScrollPane.setBounds(0,100,200,400);

        trainerScrollPane = new JScrollPane();
        datetimeScrollPane.setBounds(200,100,200,400);

        reserveButton = new JButton("Make a reservation!");
        reserveButton.setBounds(0,500,400,100);

        textField = new JTextField("");
        textField.setBounds(0,600,400,100);

        add(reserveButton);
        add(dateTimeLabel);
        add(trainerLabel);
        add(datetimeScrollPane);
        add(textField);
    }

    public void hardcodeData(){
        //hardcode data from the datetime scroll pane
        availableDatetimes.add("19.05.2022, 16:00");
        availableDatetimes.add("19.05.2022, 18:00");
        availableDatetimes.add("19.05.2022, 20:00");

        //hardcode data from the trainers scroll pane
        availableTrainers.add("Plesca Evelyn");
        availableTrainers.add("Plesca Csilla");
        availableTrainers.add("Plesca Iulian");
    }

    public static void main(String[] args) {
        new ReserveTennisCourt();
    }
}
