package lk.ijse.autopart.rest.entity;

import javax.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oId;

    private String oDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Orders() {
    }

    public Orders(int oId) {
        this.setoId(oId);
    }

    public Orders(String oDate, Customer customer) {
        this.setoDate(oDate);
        this.setCustomer(customer);
    }


    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public String getoDate() {
        return oDate;
    }

    public void setoDate(String oDate) {
        this.oDate = oDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oId=" + oId +
                ", oDate='" + oDate + '\'' +
                ", customer=" + customer +
                '}';
    }
}
