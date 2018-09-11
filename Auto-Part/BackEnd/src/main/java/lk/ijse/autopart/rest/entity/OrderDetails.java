package lk.ijse.autopart.rest.entity;

import lk.ijse.autopart.rest.dto.OrdersDTO;

import javax.persistence.*;

@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int qty;
    private double tot;

    @ManyToOne(cascade = CascadeType.ALL)
    private Orders orders;

    @ManyToOne(cascade = CascadeType.ALL)
    private Gig gig;

    @ManyToOne(cascade = CascadeType.ALL)
    private GigDetails gigDetails;

    public OrderDetails() {
    }

    public OrderDetails(int qty, double tot, Orders orders, Gig gig, GigDetails gigDetails) {
        this.qty = qty;
        this.tot = tot;
        this.orders = orders;
        this.gig = gig;
        this.gigDetails = gigDetails;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Gig getGig() {
        return gig;
    }

    public void setGig(Gig gig) {
        this.gig = gig;
    }

    public GigDetails getGigDetails() {
        return gigDetails;
    }

    public void setGigDetails(GigDetails gigDetails) {
        this.gigDetails = gigDetails;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", qty=" + qty +
                ", tot=" + tot +
                ", orders=" + orders +
                ", gig=" + gig +
                ", gigDetails=" + gigDetails +
                '}';
    }
}
