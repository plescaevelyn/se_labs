package question1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class TennisClubLogin extends JFrame{
    SignUpPage signupforaccounts = new SignUpPage();
    List<User> accounts = signupforaccounts.getAccounts();

    JLabel user;
    JLabel password;
    JTextField userInput;
    JTextField passwordInput;
    JTextArea textArea;
    JButton loginButton;
    JButton signupButton;

    TennisClubLogin(){
        setTitle("Tennis court login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,600);
        setVisible(true);
        setLayout(null);

        init();
    }

    public void init(){
        this.setLayout(null);

        user = new JLabel("User: ");
        user.setBounds(20, 100, 160, 40);

        password = new JLabel("Password: ");
        password.setBounds(20, 200,160, 40);

        userInput = new JTextField();
        userInput.setBounds(140,100,160, 40);

        passwordInput = new JTextField();
        passwordInput.setBounds(140,200,160, 40);

        loginButton = new JButton("Login!");
        loginButton.setBounds(20,300,160, 40);

        loginButton.addActionListener(new logIn());

        signupButton = new JButton("Sign up!");
        signupButton.setBounds(180,300,160, 40);

        signupButton.addActionListener(new signUp());

        textArea = new JTextArea();
        textArea.setBounds(40,360,300,160);

        add(user);
        add(password);
        add(userInput);
        add(passwordInput);
        add(loginButton);
        add(signupButton);
        add(textArea);
    }

    class logIn implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userKey = userInput.getText();
            String passwordKey = passwordInput.getText();

            for (User user : accounts) {
                if (user.getUserName().equals(userKey)) {
                    String correctPwd = user.getPassword();

                    if (correctPwd.equals(passwordKey)) {
                        textArea.append("Valid login data\n");
                        ReserveTennisCourt reserveTennisCourt = new ReserveTennisCourt();
                        reserveTennisCourt.setVisible(true);
                        dispose();
                    } else {
                        textArea.append("Invalid password!\n");
                    }
                } else {
                    textArea.append("User not found!\n");
                }
            }
            ReserveTennisCourt reserveTennisCourt = new ReserveTennisCourt();
            reserveTennisCourt.setVisible(true);
            dispose();
        }
    }

    class signUp implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            SignUpPage signUpPage = new SignUpPage();
            signUpPage.setVisible(true);
            dispose();
        }
    }

    public static void main(String[] args) {
        new TennisClubLogin();
    }
}
