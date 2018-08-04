package lk.ijse.autopart.rest.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderDelatil implements Serializable {

    private int qty;
    private double unitprice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gId",referencedColumnName = "gId",insertable = false,updatable = false)
    private Gig gig;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oId",referencedColumnName = "oID",insertable = false,updatable = false)
    private Orders orders;
    @EmbeddedId
    private OrderDetail_PK orderDetail_pk;

    public OrderDelatil() {
    }

    public OrderDelatil(int qty, double unitprice, Gig gig, Orders orders, OrderDetail_PK orderDetail_pk) {
        this.setQty(qty);
        this.setUnitprice(unitprice);
        this.setGig(gig);
        this.setOrders(orders);
        this.setOrderDetail_pk(orderDetail_pk);
    }


    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public Gig getGig() {
        return gig;
    }

    public void setGig(Gig gig) {
        this.gig = gig;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public OrderDetail_PK getOrderDetail_pk() {
        return orderDetail_pk;
    }

    public void setOrderDetail_pk(OrderDetail_PK orderDetail_pk) {
        this.orderDetail_pk = orderDetail_pk;
    }

    @Override
    public String toString() {
        return "OrderDelatil{" +
                "qty=" + qty +
                ", unitprice=" + unitprice +
                ", gig=" + gig +
                ", orders=" + orders +
                ", orderDetail_pk=" + orderDetail_pk +
                '}';
    }
}
