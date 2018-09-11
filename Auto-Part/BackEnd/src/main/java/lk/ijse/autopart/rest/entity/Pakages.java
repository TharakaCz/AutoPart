package lk.ijse.autopart.rest.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pakages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String pakageTitel;

    private double pakagePrice;

    private String pakageDuration;

    public Pakages() {
    }

    public Pakages(String pakageTitel, double pakagePrice, String pakageDuration) {
        this.pakageTitel = pakageTitel;
        this.pakagePrice = pakagePrice;
        this.pakageDuration = pakageDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPakageTitel() {
        return pakageTitel;
    }

    public void setPakageTitel(String pakageTitel) {
        this.pakageTitel = pakageTitel;
    }

    public double getPakagePrice() {
        return pakagePrice;
    }

    public void setPakagePrice(double pakagePrice) {
        this.pakagePrice = pakagePrice;
    }

    public String getPakageDuration() {
        return pakageDuration;
    }

    public void setPakageDuration(String pakageDuration) {
        this.pakageDuration = pakageDuration;
    }

    @Override
    public String toString() {
        return "Pakages{" +
                "id=" + id +
                ", pakageTitel='" + pakageTitel + '\'' +
                ", pakagePrice=" + pakagePrice +
                ", pakageDuration='" + pakageDuration + '\'' +
                '}';
    }
}
