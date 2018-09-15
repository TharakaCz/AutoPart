package lk.ijse.autopart.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

    @Id
    private String id;
    private String password;

    public Admin() {
    }

    public Admin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public Admin(String id) {
        this.id = id;
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
        return "Admin{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
