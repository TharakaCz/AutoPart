package lk.ijse.autopart.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Diliver {

    @Id
    private String dNic;
    private String dName;
    private String dAddress;
    private String dEmail;
    private String dContact;

    public Diliver() {
    }

    public Diliver(String dNic) {
        this.dNic = dNic;
    }

    public Diliver(String dNic, String dName, String dAddress, String dEmail, String dContact) {
        this.dNic = dNic;
        this.dName = dName;
        this.dAddress = dAddress;
        this.dEmail = dEmail;
        this.dContact = dContact;
    }

    public String getdNic() {
        return dNic;
    }

    public void setdNic(String dNic) {
        this.dNic = dNic;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail;
    }

    public String getdContact() {
        return dContact;
    }

    public void setdContact(String dContact) {
        this.dContact = dContact;
    }


    @Override
    public String toString() {
        return "Diliver{" +
                "dNic='" + dNic + '\'' +
                ", dName='" + dName + '\'' +
                ", dAddress='" + dAddress + '\'' +
                ", dEmail='" + dEmail + '\'' +
                ", dContact='" + dContact + '\'' +
                '}';
    }
}
