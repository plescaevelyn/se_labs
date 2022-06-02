package question1;

import java.util.List;

public class User {
    String userName;
    String address;
    String phoneNumber;
    String email;
    String password;
    String paymentMethod;

    public User(String userName, String address, String phoneNumber, String email, String password, String paymentMethod) {
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.paymentMethod = paymentMethod;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
