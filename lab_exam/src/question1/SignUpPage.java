package question1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class SignUpPage extends JFrame{
    List<User> accounts = new ArrayList<>();

    JLabel user;
    JLabel address;
    JLabel phoneNumber;
    JLabel email;
    JLabel password;
    JLabel paymentMethod;

    JTextField userInput;
    JTextField addressInput;
    JTextField phoneNumberInput;
    JTextField emailInput;
    JTextField passwordInput;
    JTextField paymentMethodInput;

    JTextArea textArea;

//    JButton loginButton;
    JButton signupButton;

    SignUpPage(){
        setTitle("Tennis court sign up");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,1100);
        setVisible(true);
        setLayout(null);

        init();
    }

    public void init(){
        this.setLayout(null);

        user = new JLabel("User: ");
        user.setBounds(20, 100, 160, 40);

        userInput = new JTextField();
        userInput.setBounds(140,100,160, 40);

        address = new JLabel("Address: ");
        address.setBounds(20, 200, 160, 40);

        addressInput = new JTextField();
        addressInput.setBounds(140, 200, 160, 40);

        phoneNumber = new JLabel("Phone number: ");
        phoneNumber.setBounds(20, 300, 160, 40);

        phoneNumberInput = new JTextField();
        phoneNumberInput.setBounds(140,300,160, 40);

        email = new JLabel("E-mail adress: ");
        email.setBounds(20, 400, 160, 40);

        emailInput = new JTextField();
        emailInput.setBounds(140, 400, 160, 40);

        password = new JLabel("Password: ");
        password.setBounds(20, 500,160, 40);

        passwordInput = new JTextField();
        passwordInput.setBounds(140,500,160, 40);

        paymentMethod = new JLabel("Payment method: ");
        paymentMethod.setBounds(20, 600,160, 40);

        paymentMethodInput = new JTextField();
        paymentMethodInput.setBounds(140,600,160, 40);
//
//        loginButton = new JButton("Log in!");
//        loginButton.setBounds(20,700,160, 40);
//
//        loginButton.addActionListener(new logIn());

        signupButton = new JButton("Sign up!");
        signupButton.setBounds(20,700,320, 40);

        signupButton.addActionListener(new signUp());

        textArea = new JTextArea();
        textArea.setBounds(40,800,300,160);

        add(user);
        add(userInput);

        add(textArea);

        add(address);
        add(addressInput);

        add(phoneNumber);
        add(phoneNumberInput);

        add(email);
        add(emailInput);

        add(paymentMethod);
        add(paymentMethodInput);

        add(password);
        add(passwordInput);

//        add(loginButton);
        add(signupButton);
    }

    class logIn implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            TennisClubLogin tennisClubLogin = new TennisClubLogin();
            tennisClubLogin.setVisible(true);
            dispose();
        }
    }

    class signUp implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String user = userInput.getText();
            String address = addressInput.getText();
            String phonenumber = addressInput.getText();
            String email = emailInput.getText();
            String password = passwordInput.getText();
            String paymentmethod = paymentMethod.getText();

            if (user.isEmpty()) {
                textArea.setText("Empty user name! Please enter a valid user name!");
            } else if (address.isEmpty()) {
                textArea.setText("Empty address! Please enter a valid address!");
            } else if (phonenumber.isEmpty()) {
                textArea.setText("Empty address! Please enter a valid phonenumber!");
            } else if (email.isEmpty()) {
                textArea.setText("Empty address! Please enter a valid e-mail address!");
            } else if (password.isEmpty()) {
                textArea.setText("Empty address! Please enter a valid password!");
            } else if (paymentmethod.isEmpty()){
                textArea.setText("Empty payment method! Please enter a valid payment method!");
            } else {
                accounts.add(new User(user,address,phonenumber,email,password,paymentmethod));
                textArea.setText("User added!");
            }

            TennisClubLogin tennisClubLogin = new TennisClubLogin();
            tennisClubLogin.setVisible(true);
            dispose();
        }
    }

    public List<User> getAccounts(){
        return accounts;
    }

    public static void main(String[] args) {
        new TennisClubLogin();
    }
}
