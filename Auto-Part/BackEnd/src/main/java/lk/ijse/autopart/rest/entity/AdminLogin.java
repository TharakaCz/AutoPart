package lk.ijse.autopart.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminLogin {

    @Id
    private String id;
    private String password;

    public AdminLogin() {
    }

    public AdminLogin(String password) {
        this.setPassword(password);
    }

    public AdminLogin(String id, String password) {
        this.setId(id);
        this.setPassword(password);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AdminLoginDTO{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
