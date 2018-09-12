package lk.ijse.autopart.rest.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Complains {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titel;
    private String disciption;
    private Date date;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Customer customer;

    public Complains() {
    }

    public Complains(String titel, String disciption, Date date) {
        this.titel = titel;
        this.disciption = disciption;
        this.date = date;
    }

    public Complains(Customer customer) {
        this.customer = customer;
    }

    public Complains(String titel, String disciption, Date date, Customer customer) {
        this.titel = titel;
        this.disciption = disciption;
        this.date = date;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDisciption() {
        return disciption;
    }

    public void setDisciption(String disciption) {
        this.disciption = disciption;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Complains{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", disciption='" + disciption + '\'' +
                ", date=" + date +
                ", customer=" + customer +
                '}';
    }
}
