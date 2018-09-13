package lk.ijse.autopart.rest.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date date;

    @OneToOne(cascade = CascadeType.MERGE)
    private Seller seller;

    @OneToOne(cascade = CascadeType.MERGE)
    private Pakages pakages;

    public Payments() {
    }

    public Payments(Date date, Seller seller, Pakages pakages) {
        this.date = date;
        this.seller = seller;
        this.pakages = pakages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Pakages getPakages() {
        return pakages;
    }

    public void setPakages(Pakages pakages) {
        this.pakages = pakages;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "id=" + id +
                ", date=" + date +
                ", seller=" + seller +
                ", pakages=" + pakages +
                '}';
    }
}
