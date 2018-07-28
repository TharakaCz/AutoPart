package lk.ijse.autopart.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private String cNic;

    private String cName;

    private String cEmail;

    private String cAddress;

    private String cContact;

    public Customer() {
    }

    public Customer(String cName, String cEmail, String cAddress, String cContact) {
        this.setcName(cName);
        this.setcEmail(cEmail);
        this.setcAddress(cAddress);
        this.setcContact(cContact);
    }

    public Customer(String cNic, String cName, String cEmail, String cAddress, String cContact) {
        this.setcNic(cNic);
        this.setcName(cName);
        this.setcEmail(cEmail);
        this.setcAddress(cAddress);
        this.setcContact(cContact);
    }


    public String getcNic() {
        return cNic;
    }

    public void setcNic(String cNic) {
        this.cNic = cNic;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcContact() {
        return cContact;
    }

    public void setcContact(String cContact) {
        this.cContact = cContact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cNic='" + cNic + '\'' +
                ", cName='" + cName + '\'' +
                ", cEmail='" + cEmail + '\'' +
                ", cAddress='" + cAddress + '\'' +
                ", cContact='" + cContact + '\'' +
                '}';
    }
}
