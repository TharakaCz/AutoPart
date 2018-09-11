package lk.ijse.autopart.rest.entity;

import javax.persistence.*;

@Entity
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String pakageName;
    private String date;

    @OneToOne(cascade = CascadeType.MERGE)
    private Seller seller;

    public Payments() {
    }

    public Payments(String pakageName, String date, Seller seller) {
        this.pakageName = pakageName;
        this.date = date;
        this.seller = seller;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPakageName() {
        return pakageName;
    }

    public void setPakageName(String pakageName) {
        this.pakageName = pakageName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "id=" + id +
                ", pakageName='" + pakageName + '\'' +
                ", date='" + date + '\'' +
                ", seller=" + seller +
                '}';
    }
}
