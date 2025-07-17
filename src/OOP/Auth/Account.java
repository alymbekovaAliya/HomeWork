package OOP.Auth;

import java.util.HashMap;
import java.util.Map;

public class Account {
    public String name;
    public String login;
    public String password;

    public Account(String name, String login, String password) {
        if(login.length() >= 6) {
            this.login = name;
            if(password.length() >= 7) {
                this.password = password;
            }
        }
        this.name = login;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
