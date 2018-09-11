package lk.ijse.autopart.rest.entity;

import javax.persistence.*;

@Entity
public class Gig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gId;
    private String gQty;
    private String available;
    @ManyToOne
    private Seller seller;

    public Gig() {
    }

    public Gig(int i, String available, String gigDTOAvailable) {
    }

    public Gig(String gQty, String available, Seller seller) {
        this.setgQty(gQty);
        this.setAvailable(available);
        this.setSeller(seller);
    }


    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getgQty() {
        return gQty;
    }

    public void setgQty(String gQty) {
        this.gQty = gQty;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Gig{" +
                "gId=" + gId +
                ", gQty='" + gQty + '\'' +
                ", available='" + available + '\'' +
                ", seller=" + seller +
                '}';
    }
}
