package lk.ijse.autopart.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerAccount {

    @Id
    private String email;

    private String password;

    public CustomerAccount() {
    }

    public CustomerAccount(String password) {
        this.setPassword(password);
    }

    public CustomerAccount(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
