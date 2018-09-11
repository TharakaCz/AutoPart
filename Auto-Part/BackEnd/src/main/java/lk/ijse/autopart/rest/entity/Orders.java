package lk.ijse.autopart.rest.entity;


import javax.persistence.*;


@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oId;
    private String oDate;
    private  double totalPrice;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Customer customer;

    public Orders() {
    }

    public Orders(String oDate, double totalPrice, Customer customer) {
        this.oDate = oDate;
        this.totalPrice = totalPrice;
        this.customer = customer;
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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
                ", totalPrice=" + totalPrice +
                ", customer=" + customer +
                '}';
    }
}
